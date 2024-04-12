package com.tp1.ClasseAbstract.Exercice4;
    public abstract class Employe {


        //Attributs

        private String nom;
        private String prenom;
        private String email;
        private String telephone;
        protected double salaire;

        // Constructeur sans parametres



        public Employe() {

        }
        //Constructeurs avec parametres

        @Override
        public String toString() {
            return "Nom: " + nom + "\n" +
                    "Prénom: " + prenom + "\n" +
                    "Email: " + email + "\n" +
                    "Téléphone: " + telephone + "\n" +
                    "Salaire: " + calculSalaire();
        }

        public Employe(String nom, String prenom, String email,String telephone, double salaire) {
            super();
            this.nom = nom;
            this.prenom = prenom;
            this.email = email;
            this.telephone = telephone;
            this.salaire = salaire;
        }

        //La methode abstraite CalculSalaire

        public abstract double calculSalaire();


    }


