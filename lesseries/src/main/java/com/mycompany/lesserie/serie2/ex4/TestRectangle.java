/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie2.ex4;
public class TestRectangle {
    public static void main(String[] args) {
        System.out.println("Serie 2 Ex4 dimension , perimetre et surface d'un rectangle ");
        Rectangle R = new Rectangle(5.4F, 3.5F);
        Rectangle R1 = new Rectangle();
        System.out.println("Rectangle R = " + R);
        R.modifierRectangle(20.6F, 15F);
        System.out.println("Rectangle R apres modification = "+R);
        System.out.println("Rectangle R1 = " + R1);
        
        
    }
}