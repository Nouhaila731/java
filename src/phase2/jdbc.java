package phase2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc{

    public static void main(String[] args) {


        String url = "jdbc:mysql://localhost:3306/java";
        String user = "root";
        String pwd = "123456";
        try {
            Connection cx = DriverManager.getConnection(url, user, pwd);
            System.out.println("Good Connection");





        } catch (SQLException e) {
            System.out.println("Bad Connection");
            e.printStackTrace();
        }
    }



    public static void createEnseignant(Connection cx) throws SQLException {
        String req1 = "CREATE TABLE IF NOT EXISTS Enseignant (\n" +
                "id INT AUTO_INCREMENT PRIMARY KEY,\n" +
                " nom VARCHAR(50) CHARACTER SET utf8 NULL,\n" +
                "prenom VARCHAR(50) CHARACTER SET utf8 NULL,\n" +
                "email VARCHAR(50) CHARACTER SET utf8 NULL,\n" +
                "grade VARCHAR(50) CHARACTER SET utf8 NULL\n" +
                ");";
        try (Statement smt = cx.createStatement()) {
            smt.executeUpdate(req1);
            System.out.println("une nouvelle table 'enseignant' a ete cree avec succes.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}