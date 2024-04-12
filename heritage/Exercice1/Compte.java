package com.tp1.heritage.Exercice1;

public class Compte {

    private String numero;
    private double solde;
    static int nbCompte = 0;

    @Override
    public String toString() {
        return "Compte{" +
                "numero='" + numero + '\'' +
                ", solde=" + solde +
                '}';
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Compte() {
        this.numero = "";
        this.solde = 0;
        nbCompte++; // Incrémenter nbCompte à chaque création de compte
    }

    public Compte(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
        nbCompte++; // Incrémenter nbCompte à chaque création de compte
    }

    public double deposerMontant(double montant) {
        solde += montant;
        return solde;
    }

    public double retirerMontant(double montant) {
        if (solde >= montant) {
            solde -= montant;
            return solde;
        } else
            System.out.println("Solde insuffisant !! ");
        return 0;
    }

    public void tafficherCompteInfo() {
        System.out.println("Compte{" +
                "numero='" + numero + '\'' +
                ", solde=" + solde +
                ", Le nombre des comptes est :" + nbCompte +
                '}');
    }

    public static void main(String[] args) {
        Compte c1 = new Compte("123445", 12000);
        Compte c2 = new Compte("334444", 200);
        Compte c3 = new Compte("3429894", 9000);

        double soldeRecent = c1.deposerMontant(12000.33);
        System.out.println("Le solde devient : " + soldeRecent);
        c2.retirerMontant(1000.33);
        c2.deposerMontant(200.55);
        System.out.println("Le solde devient : " + c2.deposerMontant(200.55));
        c1.tafficherCompteInfo();
        c2.tafficherCompteInfo();
        c3.tafficherCompteInfo();

    }
}
