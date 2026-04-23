/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie4.ex3;
public abstract class Salairie {
    private String matricule;
    private String nom;

    public Salairie(String matricule, String nom) {
        this.matricule = matricule;
        this.nom = nom;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public void afficher() {
        System.out.println("Matricule : " + matricule + ", Nom : " + nom);
    }

    public abstract double calculSalaire();
}

