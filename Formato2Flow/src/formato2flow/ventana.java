
package formato2flow;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class ventana extends JFrame {
      JButton  boton;
    JLabel   a,b,c,x1,x2;
    JTextField cajaTexto,cajaTexto2,cajaTexto3,cajaTextoR1,cajaTextoR2;
    public ventana(){
 
         setSize (390,250); //establecemos el tamaño de la ventana ancho y largo  
       setDefaultCloseOperation(EXIT_ON_CLOSE);//Metodo para el programa finalice  
        setLocationRelativeTo(null);//Establecemos  la ventana en el centro 
       setTitle("Ecuaciones Cuadraticas");//Establecemos el titulo de la ventana
       iniciarComponentes(); // iniciamos los controles 
boton();   
       abajo();
   
}
    
        public void iniciarComponentes (){
    
    setLayout (new FlowLayout());
    
        JPanel PanelArriba = new JPanel();
          add(PanelArriba,BorderLayout.NORTH);  // se crea un panel en el boderlayout en el centro.
    
               a = new JLabel ("A;");
               PanelArriba.add(a);
   
               cajaTexto = new JTextField(8);
              PanelArriba.add(cajaTexto);
                      
            boton = new JButton("Solucionar");
            PanelArriba.add(boton);
          
        }
            public void abajo (){
               
          JPanel PanelAbajo  = new JPanel ();
          add(PanelAbajo,BorderLayout.CENTER);
               c = new JLabel ("c:");
               PanelAbajo.add(c);
               
            cajaTexto3 = new JTextField(8);
              PanelAbajo.add(cajaTexto3);
              
               x2 = new JLabel ("X2;");
               PanelAbajo.add(x2);
               
            cajaTextoR2 = new JTextField(8);
              PanelAbajo.add(cajaTextoR2);
        }
            
            public void boton (){
             
                
                          JPanel PanelMedio  = new JPanel ();
          add(PanelMedio,BorderLayout.CENTER);
               b = new JLabel ("B:");
               PanelMedio.add(b);
               
            cajaTexto2 = new JTextField(8);
              PanelMedio.add(cajaTexto2);
              
               x1 = new JLabel ("X1;");
               PanelMedio.add(x1);
               
            cajaTextoR1 = new JTextField(8);
              PanelMedio.add(cajaTextoR1);
          
                
            
        
        
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

