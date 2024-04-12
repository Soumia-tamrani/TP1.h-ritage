package com.tp1.heritage.Exercie3;

public class Vehicule {

    private String nomVeh;
    private double prixVeh;

    public Vehicule() {

    }
    public Vehicule(String nomVeh, double prixVeh) {
        this.nomVeh = nomVeh;
        this.prixVeh = prixVeh;

    }

    public String getNomVeh() {
        return nomVeh;
    }

    public void setNomVeh(String nomVeh) {
        this.nomVeh = nomVeh;
    }

    public double getPrixVeh() {
        return prixVeh;
    }

    public void setPrixVeh(double prixVeh) {
        this.prixVeh = prixVeh;
    }

    public void emetSon(String typeVeh) {
        if(typeVeh =="Voiture"){
            System.out.println("La voiture vrombit");
        } else if (typeVeh == "Moto") {
            System.out.println("La moto rugit");
        }else if (typeVeh == "Avion"){
            System.out.println("L'avion fait un bruit de moteur puissant");
        }else
        System.out.println("Le vehicule emet un son inconnu");
        }


    public String afficherInformations () {
        return "{"+
                "nomVeh='" + nomVeh + '\'' +
                ", prixVeh=" + prixVeh
                ;
    }
}