/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie4.ex3;

public class TestSalairie {

    public static void main(String[] args) {
        System.out.println("Serie 4 ex 3 les salaries des employes ");

        Employe emp = new Employe("E001", "Alice", 160, 15.0);
        emp.afficher();
        System.out.println();

        Vendeur ven = new Vendeur("V001", "Bob", 150, 12.0, 5000, 0.05);
        ven.afficher();
        System.out.println();

        Directeur dir = new Directeur("D001", "Charlie", 4000, 1000);
        dir.afficher();
        System.out.println();
    }
}
