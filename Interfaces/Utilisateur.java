package com.tp1.Interfaces;

public class Utilisateur {
    private String nomUt;

    public String getNomUt() {
        return nomUt;
    }

    public void setNomUt(String nomUt) {
        this.nomUt = nomUt;
    }

    public Utilisateur(String nomUt) {
        this.nomUt = nomUt;
    }

    public void emprunterObjet (Empruntable t ){
        t.emprunter();
    }



    }


