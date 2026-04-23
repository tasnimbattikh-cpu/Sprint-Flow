/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie2.ex4;

public class Rectangle {
    public float longueur ;
    public float largeur ;
    public Rectangle(float L , float l){
        this.longueur=L;
        this.largeur=l;
    }
    public Rectangle(){
        this.longueur=10;
        this.largeur=5;
    }
    public float perimetre(){
        return (this.longueur + this.largeur)*2 ;
    }
    public float surface(){
        return this.largeur*this.longueur ;
    }
    public String toString(){
        return "Largeur : "+this.largeur+" | longeur : "+this.longueur+"| perimetre : "+this.perimetre()+"| Surface :"+this.surface();
    }
    public void modifierRectangle(float L , float l){
        this.longueur=L;
        this.largeur=l;
    }
    
}