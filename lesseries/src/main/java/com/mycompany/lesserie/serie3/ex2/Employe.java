/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie3.ex2;

import java.util.Vector;

// Classe Employe
public class Employe {

    private String nom, grade;
    private Float salaire;
    private Service myService;

    public Employe(String a, String b, float c) {
        this.nom = a;
        this.grade = b;
        this.salaire = c;
    }

    public String getNom() {
        return this.nom;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String newGrade) {
        this.grade = newGrade;
    }

    public Service getMyService() {
        return this.myService;
    }

    public void setMyService(Service newService) {
        this.myService = newService;
    }

    public Float getSalaire() {
        return this.salaire;
    }

    public void setSalaire(Float newSalaire) {
        this.salaire = newSalaire;
    }

    public String toString() {
        return "Nom : " + this.nom + ", Grade : " + this.grade + ", Salaire : " + this.salaire;
    }
}

