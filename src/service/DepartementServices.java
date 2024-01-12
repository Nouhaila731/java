package service;

import models.Departement;
import models.Enseignant;

import java.util.ArrayList;

public class DepartementServices {
    public static Departement addDept(String intitule, Enseignant... chef){
        Departement departement = new Departement();
        departement.setIntitule(intitule);
        departement.setId(BD.getDeptId());
        if (chef.length > 0){
            departement.setChef(chef[0]);
        }
        BD.departements.add(departement);

        return  departement;
    }

    public static Departement updateDept(int id , String intitule, Enseignant... chef){
        for (Departement departement : BD.departements) {
            if (departement.getId() == id) {
                departement.setIntitule(intitule);
                if (chef.length > 0) {
                    departement.setChef(chef[0]);


                }
                return departement;
            }
        }

        return  new Departement();
    }
    public static ArrayList<Departement>  deleteDeptById(int id){
        BD.departements.remove(getDeptById(id));
        return BD.departements ;
    }

    public static Departement getDeptById(int id){
        for (Departement departement : BD.departements) {
            if (departement.getId() == id) return  departement;
        }
        return  new Departement();
    }

    public static ArrayList<Departement> getAllDept(){

        return BD.departements;
    }
}