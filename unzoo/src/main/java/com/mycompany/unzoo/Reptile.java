/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unzoo;

import java.time.LocalDate;

public class Reptile extends Animal {
    private boolean venimeux;

    public Reptile(int id, String nom, LocalDate dateNaissance, boolean venimeux) {
        super(id, nom, dateNaissance);
        this.venimeux = venimeux;
    }

    public boolean getVnimeux() {
        return venimeux;
    }

    public void setVenimeux(boolean venimeux) {
        this.venimeux = venimeux;
    }

    @Override
    public void crier() {
        System.out.println(nom + " pousse un cri de mammifère.");
    }

    @Override
    public void manger() {
        System.out.println(nom + " mange comme un mammifère.");
    }

    @Override
    public void afficherInfos() {
        System.out.println("ID : " + id);
        System.out.println("Nom : " + nom);
        System.out.println("Venimeux : " + venimeux);
        System.out.println("Âge : " + calculAge() + " ans");
    }

    public interface Carnivore {
        void chasser();
    }

    public interface Herbivore {
        void brouter();
    }

}
