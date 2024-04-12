package com.tp1.ClasseAbstract.Exercice4;

public class Manager extends Employe {

    // Attribut

    private String service ;

    // Constructeur sans parametre

    public Manager() {

    }
    // Constructeur avec parametres

    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }
// Surcharger la methode CalculeSalaire

    public double calculSalaire() {

        double salaireMang = salaire* 1.2;
        return salaireMang;
    }

    // Methode toString()

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Service: " + service;
    }
}
