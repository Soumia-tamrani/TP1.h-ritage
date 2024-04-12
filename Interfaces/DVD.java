package com.tp1.Interfaces;

public class DVD implements Empruntable {
    private String titreD;
    private String nomRealisateur ;
    boolean EtatD;

    public String getTitreD() {
        return titreD;
    }

    public void setTitreD(String titreD) {
        this.titreD = titreD;
    }

    public String getNomRealisateur() {
        return nomRealisateur;
    }

    public void setNomRealisateur(String nomRealisateur) {
        this.nomRealisateur = nomRealisateur;
    }

    public DVD(String titreD, String nomRealisateur) {
        this.titreD = titreD;
        this.nomRealisateur = nomRealisateur;
    }

    @Override
    public void emprunter() {

    }

    @Override
    public boolean retourner() {
        return EtatD ;
    }
}
