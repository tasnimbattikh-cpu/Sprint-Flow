/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie3.ex2;

public class Test {

    public static void main(String[] args) {
        System.out.println("Serie 3 ex 2 modeliser un systeme de gestion de personnel");

        // Création des services
        Service S1 = new Service();
        Service S2 = new Service();

        // Création des employés
        Employe E1 = new Employe("Nidhal", "grade1", 1000);
        Employe E2 = new Employe("Mohamed", "grade2", 1200);
        Employe E3 = new Employe("Ali", "grade3", 800);
        Employe E4 = new Employe("Sana", "grade4", 900);

        // Affectation des employés aux services
        S1.affecterEmploye(E1);
        S1.affecterEmploye(E2);
        S2.affecterEmploye(E3);
        S2.affecterEmploye(E4);

        // Définir les chefs
        S1.setChef(E1);
        S2.setChef(E3);

        // Échanger E2 et E4 entre les services
        S1.eliminerEmploye(E2);
        S2.eliminerEmploye(E4);
        S1.affecterEmploye(E4);
        S2.affecterEmploye(E2);

        // Augmenter le salaire et définir le chef
        E2.setSalaire(E2.getSalaire() + 500);
        S2.setChef(E2);

        // Affichage
        System.out.println("Chef de service S1 : " + S1.getChef());
        System.out.println("Chef de service S2 : " + S2.getChef());
        System.out.println("Infos service S1 : " + S1);
        System.out.println("Infos service S2 : " + S2);
    }
}
