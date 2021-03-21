
package inciogirl;

import javax.swing.SwingUtilities;


public class Inicio {


    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
           
            SwingUtilities.invokeLater(new Runnable() {
        private ventana ventana;
            @Override
            public void run() {
    
ventana v1 = new ventana();  // objeto 

v1.setVisible(true);//Hacemos visible la ventana

v1.setResizable(false);



        
    }
    

            });
                    }
}

                    