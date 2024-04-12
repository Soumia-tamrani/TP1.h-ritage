package com.tp1.ClasseAbstract.Exercice4;

public class TestApp {

    public static void main(String[] args) {

        Employe mg = new Manager ("b","d","bd@gmail.com","064347866",8000,"DEV");
        Employe p = new Ingenieur ("a","b","ab@gmail.com","0734789876",10000,"Mecanique");

        System.out.println("Le salaire de l'ingenieur apres Augmentation du 15 % est : " +p.calculSalaire() );

        System.out.println("Le salaire de Manager apres Augmentation du 20% est : " +mg.calculSalaire()+"\n" );

        System.out.println("Informations de l'Ingénieur:"+"\n");
        System.out.println(p.toString()+"\n");

        System.out.println("Informations du Manager:"+"\n");
        System.out.println(mg.toString());


    }

}
