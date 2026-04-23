/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import javax.swing.* ;
import java.awt.event.* ;
class MaFenetre extends JFrame
{ public MaFenetre () // constructeur
{ setTitle ("Gestion de clics") ;
setBounds (10, 20, 300, 200) ;
addMouseListener ( new
MouseAdapter()
{ public void
mouseClicked(MouseEvent ev)
{ int x = ev.getX() ;
int y = ev.getY() ;
System.out.println ("clic au point de
coordonnees " + x + ", " + y ) ;}
} ) ;}}