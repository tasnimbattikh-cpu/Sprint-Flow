/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie4.ex4;

public class Rectangle implements Forme {
    protected double longueur;
    protected double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double surface() {
        return longueur * largeur;
    }

    public double perimetre() {
        return 2 * (longueur + largeur);
    }
}
