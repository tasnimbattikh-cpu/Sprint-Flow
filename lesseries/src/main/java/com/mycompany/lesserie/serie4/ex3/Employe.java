/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie4.ex3;
public class Employe extends Salairie {
    private int heuresTravaillees;
    private double tauxHoraire;

    public Employe(String matricule, String nom, int heuresTravaillees, double tauxHoraire) {
        super(matricule, nom);
        this.heuresTravaillees = heuresTravaillees;
        this.tauxHoraire = tauxHoraire;
    }

    @Override
    public double calculSalaire() {
        return heuresTravaillees * tauxHoraire;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Heures : " + heuresTravaillees + ", Taux horaire : " + tauxHoraire);
        System.out.println("Salaire : " + calculSalaire());
    }
}


