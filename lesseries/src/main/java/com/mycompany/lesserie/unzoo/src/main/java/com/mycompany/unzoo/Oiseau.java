/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unzoo;

import java.time.LocalDate;

public class Oiseau extends Animal {
    private int envergure;

    public Oiseau(int id, String nom, LocalDate dateNaissance, int envergure) {
        super(id, nom, dateNaissance);
        this.envergure = envergure;
    }

    public int getEnvergure() {
        return envergure;
    }

    public void setEnvergure(int envergure) {
        this.envergure = envergure;
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
        System.out.println("Envergure : " + envergure);
        System.out.println("Âge : " + calculAge() + " ans");
    }

    public interface Carnivore {
        void chasser(); 
    }

    public interface Herbivore {
        void brouter(); 
    }

}

