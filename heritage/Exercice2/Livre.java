package com.tp1.heritage.Exercice2;

import com.tp1.heritage.Exercice2.Auteur;

public class Livre {
   private int ISBN;
   private String titre;
   private Auteur auteur ;

    public Livre(int ISBN, String titre, Auteur auteur) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "ISBN=" + ISBN +
                ", titre='" + titre + '\'' +
                ", auteur=" + auteur +
                '}';
    }
}
