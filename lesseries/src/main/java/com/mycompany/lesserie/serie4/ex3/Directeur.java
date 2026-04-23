/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie4.ex3;

public class Directeur extends Salairie {
    private double salaireFixe;
    private double primeMensuelle;

    public Directeur(String matricule, String nom, double salaireFixe, double primeMensuelle) {
        super(matricule, nom);
        this.salaireFixe = salaireFixe;
        this.primeMensuelle = primeMensuelle;
    }

    @Override
    public double calculSalaire() {
        return salaireFixe + primeMensuelle;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Salaire fixe : " + salaireFixe + ", Prime : " + primeMensuelle);
        System.out.println("Salaire total : " + calculSalaire());
    }
}
