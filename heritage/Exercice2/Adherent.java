package com.tp1.heritage.Exercice2;

public class Adherent extends Personne {

    public Adherent(int numAdherent) {
        this.numAdherent = numAdherent;
    }

    public Adherent(String nom, String prenom, String email, String tel, int age, int numAdherent) {
        super(nom, prenom, email, tel, age);
        this.numAdherent = numAdherent;
    }

    private int numAdherent ;

   @Override
    public String toString() {
       return "Adherent{" +
               "nom='" + getNom()+ '\'' +
               ", prenom='" + getPrenom()+ '\'' +
               ", email='" + getNom() + '\'' +
               ", tel='" + getTel() + '\'' +
               ", age=" + getAge() +
               ", numAdherent =" + numAdherent +
               '}';

   }



}
