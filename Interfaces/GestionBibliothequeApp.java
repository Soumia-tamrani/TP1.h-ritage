package com.tp1.Interfaces;

public class GestionBibliothequeApp {
    public static void main(String[] args) {
        Livre l = new Livre("RRRR","omar");
        DVD d = new DVD("tttt","iiiii");
        Utilisateur u = new Utilisateur("ahmed");
        u.emprunterObjet(l);
        u.emprunterObjet(d);
        System.out.println( l.retourner());
        System.out.println( d.retourner());
    }
}
