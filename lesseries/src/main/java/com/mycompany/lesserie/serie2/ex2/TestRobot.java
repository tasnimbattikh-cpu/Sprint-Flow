
package com.mycompany.lesserie.serie2.ex2;


public class TestRobot {
    public static void main(String[]args){
        System.out.println("Serie 2 Exercie 2 Position d'un Robot ");
        Robot R =new Robot();
        R.avancer(3);
        R.tourneDroit();
        R.tourneDroit();
        R.tourneDroit();
        R.avancer();
        System.out.println("Position de robot : "+R);
    }
}