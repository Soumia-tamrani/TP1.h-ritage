package com.tp1.Polymorphisme;

public class Paypal extends Paiement{
    private String email;

    public Paypal(double montant, int numTrans, String email) {
        super(montant, numTrans);
        this.email = email;
    }

    public void effectuerPaiement(double montant) {

        System.out.println("Payé via PayPal à l'adresse email: " + email);
    }

}
