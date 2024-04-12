package com.tp1.heritage.Exercie3;

public class Moto extends Vehicule {
    private String marque;
    private double puissance ;

    @Override
    public void emetSon(String typeVeh) {
        super.emetSon(typeVeh);
    }

    public Moto(String marque, double puissance) {
        this.marque = marque;
        this.puissance = puissance;
    }

    public Moto(String nomVeh, double prixVeh, String marque, double puissance) {
        super(nomVeh, prixVeh);
        this.marque = marque;
        this.puissance = puissance;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPuissance() {
        return puissance;
    }

    public void setPuissance(double puissance) {
        this.puissance = puissance;
    }
    @Override
    public String afficherInformations() {
        return super.afficherInformations() +'\''+
                " , marque ='" + marque + '\'' +
                ", Puissance =" + puissance+
                '}';
    }

}
