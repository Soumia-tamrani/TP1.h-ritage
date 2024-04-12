package com.tp1.heritage.Exercie3;

public class TestVeh {
    public static void main(String[] args) {
        Voiture v = new Voiture("CLIO",200000,"204532",2020);
        Avion a = new Avion("Audi",7000000,"AAAAA",80);
        Moto m = new Moto("Skouda",2600000,"dddddd",345.20);

        a.emetSon("Avion");
        v.emetSon("Voiture");
        m.emetSon("Moto");
        System.out.println(a.afficherInformations());
        System.out.println(v.afficherInformations());
        System.out.println(m.afficherInformations());
    }
}
