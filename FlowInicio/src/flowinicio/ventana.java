
package flowinicio;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class ventana extends JFrame {
    
   JButton  boton;
    JLabel   a,b,c,x1,x2;
    JTextField cajaTexto,cajaTexto2,cajaTexto3,cajaTextoR1,cajaTextoR2,espacio;

    
       public ventana(){
 
         setSize (390,250); //establecemos el tamaño de la ventana ancho y largo  
       setDefaultCloseOperation(EXIT_ON_CLOSE);//Metodo para el programa finalice  
        setLocationRelativeTo(null);//Establecemos  la ventana en el centro 
       setTitle("Ecuaciones Cuadraticas");//Establecemos el titulo de la ventana
       iniciarComponentes(); // iniciamos los controles 
    
       }
       
    public void iniciarComponentes (){
        
             setLayout(new FlowLayout());
       
        
        a = new JLabel ("A;");
           add(a);
           
        cajaTexto = new JTextField(8);
         add(cajaTexto);
           
           
           b = new JLabel ("b;");
         add(b);
        
         cajaTexto2 = new JTextField(8);
         add(cajaTexto2);        
         
          
        c = new JLabel ("C;");
        add(c);
        cajaTexto3 = new JTextField(9);
        add(cajaTexto3);
        
           espacio = new JTextField(12);
            espacio.setEditable(false);
        add(espacio);
        
        boton = new JButton ("solucionar");
        add(boton);
                     espacio = new JTextField(12);
             espacio.setEditable(false);
        add(espacio);
       x1 = new JLabel ("x1;");
       add(x1);
 
      cajaTextoR1 = new JTextField(10);
      add(cajaTextoR1);
        
       x2 = new JLabel ("x2;");
       add(x2);
        
       cajaTextoR2 = new JTextField(10);
       add(cajaTextoR2);
       
             boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aceptarActionPerformed(e);
            }

            private void aceptarActionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("####.###");
                if (e.getSource()==boton) {
                    try {                                                     

                        double a1, b1, c1,pot;

                        a1 = Double.parseDouble(cajaTexto.getText());
                        b1 = Double.parseDouble(cajaTexto2.getText());   
                        c1 = Double.parseDouble(cajaTexto3.getText());
                              pot=Math.pow(b1,2)-4*a1*c1;    

            

                        if (pot > 0) {
                            
               
                     double r1=((-1*b1)+Math.sqrt(pot))/2*a1; //si el pot numero de adentro de la raiz es mayor 0 
                double r2=((-1*b1)-Math.sqrt(pot))/2*a1;
                
               cajaTextoR1.setText(String.valueOf(df.format(r1))); 
               cajaTextoR2.setText(String.valueOf(df.format(r2)));
               


                        }
                        if (pot < 0) {
                        
               cajaTextoR1.setText((-1*b1)+"+"+"√"+pot+"i"+"/"+(2*a1)); // si es un numero imaginario
               cajaTextoR2.setText((-1*b1)+"-"+"√"+pot+"i"+"/"+(2*a1));
            
                        }

                    } catch (NumberFormatException exception) {
                        cajaTextoR1.setText("Error");
                       cajaTextoR2.setText("Error");
                    }
                }
            }

        });


    }
}