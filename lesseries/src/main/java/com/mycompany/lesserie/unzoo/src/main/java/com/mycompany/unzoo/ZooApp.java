/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unzoo;
import java.util.Scanner;
import java.time.LocalDate;


public class ZooApp {
    @SuppressWarnings("UseSpecificCatch")
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            Zoo zoo = new Zoo();
            int choix;

            do {
                System.out.println("\n----- MENU DU ZOO -----");
                System.out.println("1. Ajouter un enclos");
                System.out.println("2. Ajouter un animal");
                System.out.println("3. Déplacer un animal");
                System.out.println("4. Supprimer un animal");
                System.out.println("5. Afficher tous les animaux");
                System.out.println("6. Rechercher un animal par ID");
                System.out.println("7. Quitter");
                System.out.print("Votre choix : ");
                choix = sc.nextInt();
                sc.nextLine();

                switch (choix) {

                    case 1 -> {
                        System.out.print("Nom de l'enclos : ");
                        String nom = sc.nextLine();

                        System.out.print("Capacité max : ");
                        int cap = sc.nextInt();

                        System.out.print("Superficie : ");
                        double sup = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Localité : ");
                        String loc = sc.nextLine();

                        zoo.ajouterEnclos(nom, new Enclos(nom, cap, sup, loc));
                        System.out.println("Enclos ajouté !");
                    }

                    case 2 -> {
                        System.out.print("ID animal : ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nom de l'animal : ");
                        String nomAnimal = sc.nextLine();

                        System.out.print("Année de naissance : ");
                        int annee = sc.nextInt();

                        System.out.print("Mois : ");
                        int mois = sc.nextInt();

                        System.out.print("Jour : ");
                        int jour = sc.nextInt();
                        sc.nextLine();

                        LocalDate date = LocalDate.of(annee, mois, jour);

                        System.out.print("Type (mammifere/oiseau/reptile) : ");
                        String type = sc.nextLine();

                        System.out.print("Son espece : ");
                        String espece = sc.nextLine();

                        System.out.print("Enclos où ajouter l'animal : ");
                        String enclosNom = sc.nextLine();

                        try {
                            Animal a = null;

                            if (type.equalsIgnoreCase("mammifere")) {
                                a = new Mammifere(id, nomAnimal, date, espece);
                            } else if (type.equalsIgnoreCase("oiseau")) {
                                a = new Oiseau(id, nomAnimal, date, 0);
                            } else if (type.equalsIgnoreCase("reptile")) {
                                a = new Reptile(id, nomAnimal, date, false);
                            }

                            zoo.ajouterAnimal(enclosNom, a);
                            System.out.println("Animal ajouté !");
                        } catch (Exception e) {
                            System.out.println("Erreur : " + e.getMessage());
                        }
                    }

                    case 3 -> {
                        System.out.print("ID de l'animal à déplacer : ");
                        int idDep = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enclos source : ");
                        String src = sc.nextLine();

                        System.out.print("Enclos destination : ");
                        String dest = sc.nextLine();

                        try {
                            zoo.deplacerAnimal(idDep, src, dest);
                            System.out.println("Animal déplacé !");
                        } catch (Exception e) {
                            System.out.println("Erreur : " + e.getMessage());
                        }
                    }

                    case 4 -> {
                        System.out.print("ID animal à supprimer : ");
                        int idSup = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enclos : ");
                        String enc = sc.nextLine();

                        if (zoo.enleverAnimal(enc, idSup))
                            System.out.println("Animal supprimé !");
                        else
                            System.out.println("Animal introuvable !");
                    }

                    case 5 -> zoo.afficherTousLesAnimaux();

                    case 6 -> {
                        System.out.print("ID animal recherché : ");
                        int idSearch = sc.nextInt();
                        sc.nextLine();

                        zoo.rechercherAnimal(idSearch);
                    }

                    case 7 -> System.out.println("Au revoir !");

                    default -> System.out.println("Choix invalide !");
                }

            } while (choix != 7);
        }
    }
}
