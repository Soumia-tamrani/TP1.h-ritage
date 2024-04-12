package com.tp1.heritage.Exercie3;

public class Voiture extends Vehicule {
    private String modele ;
    private int annee;

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public Voiture(String modele, int annee) {
        this.modele = modele;
        this.annee = annee;
    }

    public Voiture(String nomVeh, double prixVeh, String modele, int annee) {
        super(nomVeh, prixVeh);
        this.modele = modele;
        this.annee = annee;
    }

    @Override
    public void emetSon(String typeVeh) {
        super.emetSon(typeVeh);
    }
    @Override
    public String afficherInformations() {
        return super.afficherInformations() +'\''+
                " , modele ='" + modele + '\'' +
                ", annee =" + annee +
                '}';
    }

}
