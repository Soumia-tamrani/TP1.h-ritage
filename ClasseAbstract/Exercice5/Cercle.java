package com.tp1.ClasseAbstract.Exercice5;

public class Cercle {
    private final String nomF;
    private double rayon ;

    public Cercle( String nomF , double rayon) {
        this.rayon = rayon;
        this.nomF = nomF;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double calculerAire(){
        double a = Math.PI*Math.pow(rayon,2);
        return a ;
    }
    public double calculerPerimetre(){
        double p = 2*Math.PI*rayon;
        return  p ;
    }

    public String afficheDetails() {
        return "Cercle{" +
                "nomF='" + nomF + '\'' +
                ", rayon=" + rayon +
                '}';
    }

}
