package com.tp1.Polymorphisme;

public class GestionPaiementApp {
    public static void main(String[] args) {

        CarteCredit carteCRD1 = new CarteCredit(1000.12,12,1);
        Paypal p = new Paypal(200.45,22,"tamranisoumia01@gmail.com");

        Commande c1 = new Commande(carteCRD1,300.12);
        Commande c2 = new Commande(p,700.23);

        c1.processPayment();
        c2.processPayment();

    }
}
