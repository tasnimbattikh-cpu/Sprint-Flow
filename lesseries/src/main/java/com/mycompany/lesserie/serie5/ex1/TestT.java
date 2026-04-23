/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie5.ex1;

public class TestT {

    public static void main(String[] args) {
        System.out.println("Serie 5 Ex 1 Temps avec des exceptions");
        try {
            Temps t = new Temps(23, 12, 6);   // temps valide
            System.out.println(t);            // affiche le temps
        } 
        catch (TempsException e) {
            System.out.println("Temps invalide");   // message demandé
        }
    }

    
}
