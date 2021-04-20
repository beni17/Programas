/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication92;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class JavaApplication92 {

    public static void main(String[] args) throws InterruptedException{
        // TODO code application logic here
           Escenario es = new  Escenario (); 
es.setSize(600,600);
es.setLocationRelativeTo(null);
       es.setVisible(true);
    es.setTitle("Prueba");
    es.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    while (true){
        es.repaint();
        Thread.sleep(10);
    }
    }
    
}
