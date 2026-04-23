/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie2.ex2;

public class Robot {
    int x ;
    int y ;
    char orientation ;
    public Robot(){
        this.x=0;
        this.y=0;
        this.orientation='N';
    }
    public Robot(int a , int b ){
        this.x=a;
        this.y=b;
        this.orientation='E';
    }
    public void tourneDroit(){
        if(this.orientation=='N'){
            this.orientation='E';
        }
        else if(this.orientation=='E'){
            this.orientation='S';
        }
        else if(this.orientation=='S'){
            this.orientation='O';
        }else{
            this.orientation='N';
        }
    }
    public void avancer(){
        if(this.orientation=='N'){
            this.y++;
        }
        else if(this.orientation=='E'){
            this.x++;
        }
        else if(this.orientation=='S'){
            this.y--;
        }
        else{
            this.x--;
        }
    }
    public void avancer(int nbp){
        if(this.orientation=='N'){
            this.y+=nbp;
        }
        else if(this.orientation=='E'){
            this.x+=nbp;
        }
        else if(this.orientation=='S'){
            this.y-=nbp;
        }
        else{
            this.x-=nbp;
        }
    }
    public String toString(){
        return "abscisse :"+x+"|ordonne : "+y+"|orientation "+ orientation ;
    }
}

