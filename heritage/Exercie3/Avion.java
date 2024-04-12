package com.tp1.heritage.Exercie3;

public class Avion extends Vehicule {
    private String compagnie;
    private int vitesseMax;

    @Override
    public void emetSon(String typeVeh) {
        super.emetSon(typeVeh);
    }

    public String getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(String compagnie) {
        this.compagnie = compagnie;
    }

    public int getVitesse() {
        return vitesseMax;
    }

    public void setVitesse(int vitesse) {
        this.vitesseMax = vitesse;
    }

    public Avion(String compagnie, int vitesse) {
        this.compagnie = compagnie;
        this.vitesseMax = vitesse;
    }

    public Avion(String nomVeh, double prixVeh, String compagnie, int vitesseMax) {
        super(nomVeh, prixVeh);
        this.compagnie = compagnie;
        this.vitesseMax = vitesseMax;
    }


    @Override
    public String afficherInformations() {
        return super.afficherInformations() +'\''+
                " , compagnie='" + compagnie + '\'' +
                ", vitesseMax=" + vitesseMax +
                '}';
    }
}
