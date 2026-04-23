/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unzoo;
import java.time.LocalDate;


public abstract class Animal {
    int id;
    String nom;
    LocalDate dateNaissance;

    public Animal(int id, String nom, LocalDate dateNaissance) {
        this.id = id;
        this.nom = nom;
        this.dateNaissance = dateNaissance;

    }

    public abstract void crier();

    public abstract void manger();

    public abstract void afficherInfos();

    public int calculAge() {
        LocalDate today = LocalDate.now();
        int age = today.getYear() - this.dateNaissance.getYear();
        if (today.getMonthValue() < this.dateNaissance.getMonthValue() ||
                (today.getMonthValue() == this.dateNaissance.getMonthValue()
                        && today.getDayOfMonth() < this.dateNaissance.getDayOfMonth())) {
            age--;
        }

        return age;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

}