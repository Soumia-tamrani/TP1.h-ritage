package com.tp1.Interfaces;

public class Livre implements Empruntable {
private String titre ;
private String nomAuteur;
boolean etatLi;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public Livre(String titre, String nomAuteur) {
        this.titre = titre;
        this.nomAuteur = nomAuteur;
    }

    @Override
    public void emprunter() {

    }

    @Override
    public boolean retourner() {
        return etatLi;
    }
}
