package com.tp1.Polymorphisme;

public class Commande {
    Paiement moyenPaiement;
    private double montant;


    public Commande(Paiement moyenPaiement, double montant) {
        this.moyenPaiement = moyenPaiement;
        this.montant = montant;
    }
    public void processPayment() {
        moyenPaiement.effectuerPaiement(montant);
    }


}

