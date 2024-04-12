package com.tp1.heritage.Exercice1;

import com.tp1.heritage.Exercice2.Adherent;
import com.tp1.heritage.Exercice2.Auteur;
import com.tp1.heritage.Exercice2.Livre;

public class testApp {

    public static void main(String[] args) {

        Adherent a = new Adherent ("el fassi","mohammed","mohammed2@gmail.com","039858498", 45,23);
        Auteur t = new Auteur("Amine","elhelou","ttt@gmail.com","948373738",34,23);
        Livre l = new Livre(100,"autigone",t);
        System.out.println(" les info de adherant est : " + a.toString());
        System.out.println("Les informations du livre : "+l.toString());

    }

}
