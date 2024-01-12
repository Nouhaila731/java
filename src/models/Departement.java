package models;

import java.util.ArrayList;
public class Departement {

    private int id;
    private String intitule;
    private Enseignant chef;

    ArrayList<Filiere> filieres = new ArrayList<>();


    public Departement() {
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule( String intitude) {
        this.intitule = intitule;
    }

    public Enseignant getChef() {
        return chef;
    }

    public void setChef(Enseignant chef) {
        this.chef = chef;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}