package com.tp1.ClasseAbstract.Exercice5;

public class ClassTesteMain {
    public static void main(String[] args) {
        Cercle c = new Cercle("A",10.5);
        Rectangle r = new Rectangle(15.2,13.5,"B");

        System.out.println("Aire du cercle est :"+ c.calculerAire());
        System.out.println("Le Perimetre du Cercle est : " +c.calculerPerimetre());


        System.out.println( " Aire du Rectangle est : " + r.calculAire());
        System.out.println( " Le Perimetre du Rectangle est : " + r.calculerPerimetre());

        System.out.println(r.AfficherDetails());
        System.out.println(c.afficheDetails());


    }
}
