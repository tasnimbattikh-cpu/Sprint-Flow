/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie3.ex3;
import java.util.ArrayList;

public class EnsembleStr {

    private ArrayList<String> elements;

    public EnsembleStr() {
        elements = new ArrayList<String>();
    }

    public void vider() {
        elements.clear();
    }

    public void afficher() {
        System.out.println(elements);
    }

    public int appartient(String ch) {
        return elements.indexOf(ch);
    }

    public void ajouter(String ch) {
        if (!elements.contains(ch)) {
            elements.add(ch);
        }
    }

    public void retirer(String ch) {
        elements.remove(ch);
    }

    public boolean egalite(EnsembleStr E) {
        return elements.containsAll(E.elements) && E.elements.containsAll(elements);
    }
}
