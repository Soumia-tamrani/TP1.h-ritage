package com.tp1.Polymorphisme;

public class CarteCredit extends Paiement {
    private int numCarte;

    public CarteCredit(double montant, int numTrans, int numCarte) {
        super(montant, numTrans);
        this.numCarte = numCarte;
    }

    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement de " + montant + " avec la carte de crédit " + numCarte + " effectué avec succès.");

    }

}
