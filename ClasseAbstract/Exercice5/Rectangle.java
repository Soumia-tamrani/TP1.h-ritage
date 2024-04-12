package com.tp1.ClasseAbstract.Exercice5;

public class Rectangle {
    private double longueur;
    private double larg;
    private final String nomF;

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public Rectangle(double longueur, double larg, String nomF) {
        this.longueur = longueur;
        this.larg = larg;
        this.nomF = nomF;
    }

    public double getLarg() {
        return larg;
    }

    public void setLarg(double larg) {
        this.larg = larg;
    }
    public double calculAire(){
        double Ar = longueur*larg;
        return  Ar;
    }
    public double calculerPerimetre(){
        double pR= (2*(longueur+larg));
        return pR;
    }


    public String AfficherDetails() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", larg=" + larg +
                ", nomF='" + nomF + '\'' +
                '}';
    }
}
