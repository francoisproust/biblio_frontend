package bibliotheque.modele;

import java.io.Serializable;

public class Usager implements Serializable {
    private String nom;
    private String prenom;
    private String identifiant;
    private String password;
    private String typeUser;

    public String getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(String typeUser) {
        this.typeUser = typeUser;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
