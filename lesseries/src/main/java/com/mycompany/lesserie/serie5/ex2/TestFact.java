/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie5.ex2;

public class TestFact {

    
    public static void main(String[] args) {
        System.out.println("Serie 5 ex 2 Test : calcule la factorielle d'un entier passe comme parametre");
        try{
            int n=Integer.parseInt(args[0]);
        if(n<0)
            throw new NombreNegatifException();
        if(n==0)
            System.out.println("La factorielle de"+n+"est : 1");
        else{
            int f=1;
            for(int i=2;i<=n;i++)
                f*=i;
            System.out.println("La factorielle de "+n +" est : "+f);
        }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Il n'y a pas de parametre sur la ligne de commande");
        }
        catch(NumberFormatException e){
            System.out.println("le parametre n'est pas un entier ");
        }
        catch(NombreNegatifException e){
            System.out.println("Le parametre est négatif ");
        }
        
            
    }
    
}