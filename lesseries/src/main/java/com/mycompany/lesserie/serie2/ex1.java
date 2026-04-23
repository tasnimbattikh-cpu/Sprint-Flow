/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie2;

import java.lang.String;
public class ex1 {
    private int heures ; 
    private int minutes ;
    public void setHeures ( int h ){
        this.heures=h;
    }
    public void setMinutes ( int m ){
        this.minutes=m;
    }
    public String toString() {
        return  heures + "H:"+ minutes + "mn";
    }

}
