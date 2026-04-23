/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import static java.awt.Color.PINK;
import javax.swing.*;
import java.awt.event.*;

public class Mavenproject1 {

    public static void main(String[] args) {
        JFrame fen = new JFrame();
        fen.setSize(300,150);
        fen.setTitle("cc les babies");
        fen.setVisible(true);
        fen.setBackground(PINK);
        fen.addMouseListener(new MouseListener(){
        public void mouseClicked(MouseEvent e){
            System.out.println("clic ");
            
        }
        public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        System.out.println("Hello World!");
    }
}

/*class ccc extends JFrame {

    public ccc() {

        setTitle("Gestion de clics");
        setBounds(10, 20, 300, 200);

        addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent ev) {

                int x = ev.getX();
                int y = ev.getY();

                System.out.println(
                    "clic au point de coordonnees " + x + ", " + y
                );
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

   
}*/
