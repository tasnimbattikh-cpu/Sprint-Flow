/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie4.ex3;

public class Vendeur extends Employe {
    private double ventes;
    private double pourcentage;

    public Vendeur(String matricule, String nom, int heuresTravaillees, double tauxHoraire, double ventes, double pourcentage) {
        super(matricule, nom, heuresTravaillees, tauxHoraire);
        this.ventes = ventes;
        this.pourcentage = pourcentage;
    }

    @Override
    public double calculSalaire() {
        return super.calculSalaire() + ventes * pourcentage;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Ventes : " + ventes + ", Pourcentage : " + pourcentage);
        System.out.println("Salaire total : " + calculSalaire());
    }
}
