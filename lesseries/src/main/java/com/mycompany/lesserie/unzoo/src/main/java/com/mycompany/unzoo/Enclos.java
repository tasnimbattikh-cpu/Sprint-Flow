/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unzoo;
import java.util.ArrayList;

public class Enclos {

    private String nom;
    private int capaciteMax;
    private final ArrayList<Animal> animaux;
    private double superficie;
    private String localite;

    public Enclos(String nom, int capaciteMax, double superficie, String localite) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.superficie = superficie;
        this.localite = localite;
        this.animaux = new ArrayList<>();
    }

    public void ajouterAnimal(String nom, Animal animal) throws EnclosPleinException {
        if (estPlein()) {
            throw new EnclosPleinException("Impossible d'ajouter " + animal.getNom() +
                    " : l'enclos '" + nom + "' est plein.");
        }
        animaux.add(animal);
        System.out.println(animal.getNom() + " a été ajouté à l'enclos " + nom);
    }

    public void enleverAnimal(String nom, Animal animal) {
        if (animaux.remove(animal)) {
            System.out.println(animal.getNom() + " a été retiré de l'enclos " + nom);
        } else {
            System.out.println("L'animal n'existe pas dans cet enclos.");
        }
    }

    public boolean estPlein() {
        return animaux.size() >= capaciteMax;
    }

    public String getNom() {
        return nom;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public ArrayList<Animal> getAnimaux() {
        return animaux;
    }

    public double getSuperficie() {
        return superficie;
    }

    public String getLocalite() {
        return localite;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public void setLocalite(String localite) {
        this.localite = localite;
    }

    public void afficherInfos() {
        System.out.println("----- Enclos : " + nom + " -----");
        System.out.println("Localité : " + localite);
        System.out.println("Superficie : " + superficie + " m²");
        System.out.println("Capacité maximale : " + capaciteMax);
        System.out.println("Animaux présents : " + animaux.size());

        if (animaux.isEmpty()) {
            System.out.println("Aucun animal pour le moment.");
        } else {
            System.out.println("Liste des animaux :");
            for (Animal a : animaux) {
                System.out.println("- " + a.getNom());
            }
        }
    }
}