/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie3.ex2;

import java.util.Vector;


public class Service {

    private String nom;
    private int numTel;
    private Employe chef;
    private Vector<Employe> listeEmployes = new Vector<Employe>();

    public String getNom() {
        return this.nom;
    }

    public int getNombreEmployes() {
        return this.listeEmployes.size();
    }

    public int getNumTel() {
        return this.numTel;
    }

    public void setNumTel(int newNumTel) {
        this.numTel = newNumTel;
    }

    public Employe getChef() {
        return this.chef;
    }

    public void setChef(Employe newChef) {
        if (newChef.getMyService() == this) {
            this.chef = newChef;
            newChef.setGrade("Chef");
        } else {
            if (newChef.getMyService() != null)
                newChef.getMyService().eliminerEmploye(newChef);
            this.affecterEmploye(newChef);
            this.chef = newChef;
            newChef.setGrade("Chef");
        }
    }

    public void affecterEmploye(Employe e) {
        if (this.listeEmployes.contains(e)) {
            System.out.println("L'employé existe déjà dans la liste des employés de ce service !");
        } else {
            this.listeEmployes.add(e);
            e.setMyService(this);
        }
    }

    public void eliminerEmploye(Employe e) {
        if (this.listeEmployes.contains(e)) {
            this.listeEmployes.remove(e);
            e.setMyService(null);
        } else {
            System.out.println("L'employé n'existe pas dans la liste des employés de ce service !");
        }
    }

    public String toString() {
        String s = "Nom : " + this.nom + ", NumTel : " + this.numTel + ", Chef : " +
                (chef != null ? chef.getNom() : "aucun") + "\nListe des employés : ";

        for (Employe e : listeEmployes) {
            if (!e.getGrade().equalsIgnoreCase("Chef"))
                s += e.getNom() + " ";
        }
        return s;
    }
}
