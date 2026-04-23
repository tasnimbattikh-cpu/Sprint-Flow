package com.mycompany.lesserie.serie1;
import java.util.Scanner;
public class ex3 {
    public static void main(String[]args){
        System.out.println("Serie 1 Exercie 3 Affichez un chiffre en lettre ");
        int n; 
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Entrez un entier : ");
            n = sc.nextInt();
        }while(n<0 || n>9);
        switch(n){
            case 1 :
                System.out.println("un");
                break ;
            case 2 :
                System.out.println("Deux");
                break ;
            case 3 :
                System.out.println("Trois");
                break ;
            case 4 :
                System.out.println("Quatre");
                break ;
            case 5 :
                System.out.println("Cinq");
                break ;
            case 6 :
                System.out.println("Six");
                break ;
            case 7 :
                System.out.println("Sept");
                break ;
            case 8 :
                System.out.println("Huite");
                break ;
            case 9 :
                System.out.println("Neuf");
                break ;
        }
    }
}