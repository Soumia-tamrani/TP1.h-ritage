package com.tp1.Polymorphisme;

public class Paiement {
    private double montant;
    private int numTrans;

    public void effectuerPaiement(double montant){
        System.out.println("Paiement de " + montant + " effectué avec succès.");
    }

    public Paiement(double montant, int numTrans) {
        this.montant = montant;
        this.numTrans = numTrans;
    }
}

