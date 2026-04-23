/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie2.ex3;


import java.util.Scanner;
public class TestPoint {
    public static void main(String[]args){
        System.out.println("Serie 2 Exercice 3 comparison des coordonnes de deux points ");
        Scanner s = new Scanner(System.in);
        Point P = new Point(3,5);
        Point P1 = new Point();
        System.out.println("Donnez l'abscisse de P1 : ");
        float a = s.nextFloat();
        System.out.println("Donnez l'ordonne de P1 : ");
        float b =s.nextFloat();
        P1.deplace(a, b);
        System.out.println("Point P :"+P);
        System.out.println("Point P1 :"+P1);
        if(P.equals(P1))
            System.out.println("P et P1 ont les meme coordonnes ");
        else
            System.out.println("P et P1 n'ont pas les meme coordonnes ");
                
    }
}
