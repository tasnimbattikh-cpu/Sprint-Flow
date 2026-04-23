/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unzoo;
import java.util.HashMap;

public class Zoo {

    private final HashMap<String, Enclos> enclos;

    public Zoo() {
        enclos = new HashMap<>();
    }

    public void ajouterEnclos(String nom, Enclos e) {
        enclos.put(nom, e);
        System.out.println("Enclos ' " + nom + " ' ajouté au zoo.");
    }

    public void ajouterAnimal(String nomEnclos, Animal animal)
            throws EnclosPleinException, AnimalNonTrouveException {

        if (!enclos.containsKey(nomEnclos)) {
            throw new AnimalNonTrouveException("L'enclos '" + nomEnclos + "' n'existe pas.");
        }

        Enclos e = enclos.get(nomEnclos);
        e.ajouterAnimal(e.getNom(), animal);
    }

    public boolean enleverAnimal(String nomEnclos, int idAnimal) {
        if (!enclos.containsKey(nomEnclos)) {
            System.err.println("L'enclos '" + nomEnclos + "' n'existe pas.");
            return false;
        }

        Enclos e = enclos.get(nomEnclos);
        Animal animalARetirer = null;

        for (Animal a : e.getAnimaux()) {
            if (a.getId() == idAnimal) {
                animalARetirer = a;
                break;
            }
        }

        if (animalARetirer != null) {
            e.enleverAnimal(nomEnclos, animalARetirer);
            return true;
        } else {
            System.err.println("L'animal ID " + idAnimal + " n'a pas été trouvé dans l'enclos " + nomEnclos + ".");
            return false;
        }
    }

    public void rechercherAnimal(int idAnimal) {
        Animal animalTrouve = null;
        String enclosTrouve = null;

        for (String nomEnclos : enclos.keySet()) {
            Enclos e = enclos.get(nomEnclos);
            for (Animal a : e.getAnimaux()) {
                if (a.getId() == idAnimal) {
                    animalTrouve = a;
                    enclosTrouve = nomEnclos;
                    break;
                }
            }
            if (animalTrouve != null) {
                break;
            }
        }

        if (animalTrouve != null) {
            System.out.println(" Animal trouvé dans l'enclos : " + enclosTrouve);
            animalTrouve.afficherInfos();
        } else {
            System.out.println(" Animal ID " + idAnimal + " introuvable dans le Zoo.");
        }
    }

    public void deplacerAnimal(int idAnimal, String nomEnclosSource, String nomEnclosDestination)
            throws AnimalNonTrouveException, DeplacementImpossibleException, EnclosPleinException {

        if (!enclos.containsKey(nomEnclosSource) || !enclos.containsKey(nomEnclosDestination)) {
            throw new DeplacementImpossibleException("Un des enclos n'existe pas.");
        }

        Enclos source = enclos.get(nomEnclosSource);
        Enclos destination = enclos.get(nomEnclosDestination);

        Animal animalTrouve = null;

        for (Animal a : source.getAnimaux()) {
            if (a.getId() == idAnimal) {
                animalTrouve = a;
                break;
            }
        }

        if (animalTrouve == null) {
            throw new AnimalNonTrouveException(
                    "L'animal \"" + idAnimal + "\" n'a pas été trouvé dans l'enclos " + nomEnclosSource);
        }

        if (destination.estPlein()) {
            throw new EnclosPleinException("L'enclos " + nomEnclosDestination + " est plein.");
        }

        source.enleverAnimal(nomEnclosSource, animalTrouve);
        destination.ajouterAnimal(nomEnclosDestination, animalTrouve);

        System.out.println("Animal \"" + idAnimal + "\" déplacé de " + nomEnclosSource +
                " vers " + nomEnclosDestination + ".");
    }

    public void afficherTousLesAnimaux() {
        System.out.println("----- Liste des animaux du Zoo (" + enclos.size() + " Enclos) -----");

        if (enclos.isEmpty()) {
            System.out.println("Le Zoo n'a aucun enclos pour le moment.");
            return;
        }

        for (Enclos e : enclos.values()) {
            e.afficherInfos();
            System.out.println("---");
        }
    }
}