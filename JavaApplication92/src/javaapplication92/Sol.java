
package javaapplication92;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JPanel;


public class Sol extends JPanel{
    
                  public int x =10
                    
                     
                    , y =200, div=0;
       public int vel =2;
     public void SolDibujar( Graphics g )
{ super.paintComponent( g ); // call superclass's paintComponent



Graphics2D g2d = ( Graphics2D ) g; // cast g to Graphics2D
// draw 2D ellipse filled with a blue-yellow gradient
g2d.setPaint( new GradientPaint( 5, 30, Color.RED, 35, 100,
Color.YELLOW, true ) );
g2d.fill( new Ellipse2D.Double( 100, 50, 65, 100 ) );

g2d.drawArc(200, 1200, 123, 200, 2000, 200);


float[] dashes = { 10 }; // specify dash pattern
g2d.setStroke( new BasicStroke( 4, BasicStroke.CAP_ROUND,
BasicStroke.JOIN_ROUND, 10, dashes, 0 ) );

g2d.draw( new Line2D.Double( 65, 100,150, 90 ) );

g2d.draw( new Line2D.Double( 105, 200,150, 90 ) );



g2d.draw( new Line2D.Double( 105,100,210, 90 ) );


g2d.draw( new Line2D.Double( 110,100,210, 120 ) );

g2d.draw( new Line2D.Double( 110,100,210, 18 ));
        
g2d.draw( new Line2D.Double( 110,100,260, 200 ));
        

g2d.draw( new Line2D.Double( 110,100,300, 10 ));
       
  g2d.draw( new Line2D.Double( 110,100,135, 10 ));
  
    g2d.draw( new Line2D.Double( 120,100,20, 10 ));
    
    
    //nube 1
 g2d.setColor(Color.WHITE);
 

 g2d.fillOval(800, 50, 80, 100);
 g2d.fillOval(810, 60, 60, 70);
 g2d.fillOval(790, 70, 80, 80);
 g2d.fillOval(810, 70, 100, 80);

 
 //nube 2
 
  g2d.fillOval(x+500, 50, 80, 100);
 g2d.fillOval(x+530, 60, 60, 70);
 g2d.fillOval(x+540, 60, 80, 80);
 g2d.fillOval(x+550, 70, 100, 80);

 
 
       
 
    }public void movernubes (){
             
             if (div ==0){
             x-=vel;
             
         } else if (div ==1){
             
             x=x + vel;   
         } else if (div ==2){
             x+= vel;
         } else if (div == 3){
             x-=vel;
         }             
             
         }

 }



