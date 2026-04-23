/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unzoo;
import java.time.LocalDate;

public class Mammifere extends Animal {
    private String espece;

    public Mammifere(int id, String nom, LocalDate dateNaissance, String espece) {
        super(id, nom, dateNaissance);
        this.espece = espece;
    }

    public String getEspece() {
        return espece;
    }

    public void setEspece(String espece) {
        this.espece = espece;
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
        System.out.println(" ----- Mammifère ----- ");
        System.out.println("ID : " + id);
        System.out.println("Nom : " + nom);
        System.out.println("Espèce : " + espece);
        System.out.println("Date de naissance : " + dateNaissance);
        System.out.println("Âge : " + calculAge() + " ans");
    }

    public interface Carnivore {
        void chasser();
    }

    public interface Herbivore {
        void brouter();
    }

}
