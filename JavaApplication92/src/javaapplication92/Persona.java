
package javaapplication92;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Persona extends JPanel{
     
    
            public int x =10  , y =200, dir=2;
       public int vel =4;
    public void pintarPer( Graphics g )
    { super.paintComponent( g ); // call superclass's paintComponent

   


             ImageIcon image;
         image = new ImageIcon (getClass().getResource("mini-loader.gif"));
g.drawImage(image.getImage(), x,400,100,100,this);

             
      
             ImageIcon image2;
         image2 = new ImageIcon (getClass().getResource("mini-loader.gif"));
g.drawImage(image2.getImage(), x,600,100,100,this);

                    

{         
       
 }

    }public void mover (){
             
   
             
          if (dir ==2){
             x+= vel;
   
         }             
             
         }

 }




