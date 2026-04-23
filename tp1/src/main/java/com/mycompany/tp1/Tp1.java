/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

/**
 *
 * @author batti
 */
public class Tp1 extends JFrame {

   public Tp1(){
       setTitle("cc les babies");
       setSize(100,300);
       JButton b1=new JButton("b1");
   getContentPane().setLayout(new FlowLayout());
   getContentPane().add(b1);
   };
   class EcouterSouris implements MouseListener{
       @Override
       public void mouseClicked(MouseEvent e){}
       @Override
       public void mousePressed(MouseEvent e){}
       @Override
       public void mouseReleased(MouseEvent e){}
       @Override
       public void mouseEntered(MouseEvent e){}
       @Override
       public void mouseExited(MouseEvent e){}
       
       
   };
   
   
   
   
   
}
