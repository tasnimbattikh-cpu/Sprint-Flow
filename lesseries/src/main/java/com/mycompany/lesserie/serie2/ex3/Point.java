/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie2.ex3;

public class Point {
    private float abs ;
    private float ord ;
    public Point(){
        this.abs=10;
        this.ord=10;
    }
    public Point(float abs , float ord ){
        this.abs=abs;
        this.ord=ord;
    }
    public void deplace(float a , float b){
        this.abs=a;
        this.ord=b;
    }
    public float getAbscisse(){
        return this.abs;
    }
    public float getOrdonnee(){
        return this.ord;
    }
    public String toString(){
        return "("+this.abs+","+this.ord+")";
    }
    public boolean equals( Object o){
        Point q = (Point)o;
        return this.abs==q.abs && this.ord==q.ord ;
    }
}
