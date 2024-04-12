package com.tp1.ClasseAbstract.Exercice4;

public class Ingenieur extends Employe {

    // Attribut
    private String specialite ;


    // Constructeur avec parametres

    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    // Constructeur sans parametre

    public Ingenieur() {

    }

    // Surcharger la methode CalculSalaire

    public double calculSalaire() {

        return salaire* 1.15;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Spécialité: " + specialite;
    }
}
