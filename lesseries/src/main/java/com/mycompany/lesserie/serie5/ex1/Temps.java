/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie5.ex1;

public class Temps {
    private int heures;
    private int minutes;
    private int secondes;

    public Temps(int h, int m, int s) throws TempsException {
        if (h >= 0 && h <= 23)
            this.heures = h;
        else
            throw new TempsException();

        if (m >= 0 && m <= 59)
            this.minutes = m;
        else
            throw new TempsException();

        if (s >= 0 && s <= 59)
            this.secondes = s;
        else
            throw new TempsException();
    }

    public String toString() {
        return "Temps : " + this.heures + "H : " + this.minutes + "Mn : " + this.secondes + "s";
    }
}