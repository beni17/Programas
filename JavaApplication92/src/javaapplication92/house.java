/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication92;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class house extends JPanel {
  
JFrame  framePrincipal = null;
    JLabel imagenFriki1 = null;
    JLabel imagenFriki2 = null;
    JLabel imagenFriki3 = null;
    JLabel carretera = null;

    public house() 
    {
        
        
        
        
        
        iniciar();
      
    }

    public void iniciar()
    {
    
       

        imagenFriki3 = new JLabel();
        imagenFriki3.setBounds(10,590,250,250);
        ImageIcon imgfriki3 = new ImageIcon(getClass().getResource("Avion.jpg"));
        ImageIcon imgescalada3 = new ImageIcon(imgfriki3.getImage().getScaledInstance(imagenFriki3.getWidth(),
                imagenFriki3.getHeight(), Image.SCALE_DEFAULT));
        imagenFriki3.setIcon(imgescalada3);     
        framePrincipal.add(imagenFriki3);
    }
}


