
package ventanapruebatiempo2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class VentanaPruebaTiempo2 extends JFrame {

       private Tiempo tiempo;
   private JLabel horaEtiqueta, minutoEtiqueta, segundoEtiqueta;
   private JTextField horaCampo, minutoCampo, segundoCampo, pantallaCampo;

       public VentanaPruebaTiempo2 ( ) {
      super ( "Demostración de clase interna anónima" );  
      tiempo = new Tiempo ( );        // crear objeto Tiempo
      crearGUI ( );              // configurar GUI
      // configurar manejo eventos
      registrarManejadoresDeEventos ( );
    
       }

          // crear componentes de GUI y adjuntarlos al panel de contenido
   private void crearGUI ( ) {
      Container contenedor = getContentPane ( );
      contenedor.setLayout ( new FlowLayout ( ) );

      horaEtiqueta = new JLabel ( "Ajuste hora" );
      horaCampo = new JTextField ( 10 );
      contenedor.add ( horaEtiqueta );
      contenedor.add ( horaCampo );

      minutoEtiqueta = new JLabel ( "Ajuste minuto" );
      minutoCampo = new JTextField ( 10 );
      contenedor.add ( minutoEtiqueta );
      contenedor.add ( minutoCampo );


      segundoEtiqueta = new JLabel ( "Ajuste segundo" );
      segundoCampo = new JTextField ( 10 );
      contenedor.add ( segundoEtiqueta );
      contenedor.add ( segundoCampo );

      pantallaCampo = new JTextField ( 30 );
      pantallaCampo.setEditable( false );
      contenedor.add ( pantallaCampo );

   } // fin del método crearGUI
         // registrar manejadores de eventos para horaCampo,
     // minutoCampo y segundoCampo
    private void registrarManejadoresDeEventos ( ) {
        // registrar manejador de eventos para horaCampo
        horaCampo.addActionListener ( new ActionListener ( ) {
                                                                       // clase interna anónima
            public void actionPerformed ( ActionEvent evento ) {
                tiempo.establecerHora ( Integer.parseInt ( 
                                                        evento.getActionCommand ( ) ) );
                horaCampo.setText ( "" );
                mostrarTiempo ( );
            }
          } // fin de la clase interna anónima
        );  // fin de la llamada a addActionListener para horaCampo

        // registrar manejador de eventos para minutoCampo
        minutoCampo.addActionListener (
                new ActionListener ( ) {       // clase interna anónima

                    public void actionPerformed ( ActionEvent evento ) {
                        tiempo.establecerMinuto ( Integer.parseInt (
                                        evento.getActionCommand ( ) ) );
                        minutoCampo.setText ( "" );
                        mostrarTiempo ( );
                    }

                }    // fin de la clase interna anónima

        );  // fin de la llamada a addActionListener para minutoCampo
        segundoCampo.addActionListener (
                new ActionListener ( ) {  // clase interna anónima
                    public void actionPerformed ( ActionEvent evento ) {
                        tiempo.establecerSegundo ( Integer.parseInt (
                                        evento.getActionCommand ( ) ) );
                        segundoCampo.setText ( "" );
                        mostrarTiempo ( );
                    }
                }    // fin de la clase interna anónima
        ); // fin de la llamada a addActionListener para segundoCampo
    }      // fin del método registrarManejadoresDeEventos
    // mostrar tiempo en pantallaCampo
    public void mostrarTiempo ( ) {
        pantallaCampo.setText ( "La hora es: " + tiempo );
    }

    public static void main(String[] args) {

        
        
                VentanaPruebaTiempo2 ventana = new VentanaPruebaTiempo2 ( );
        // registrar componente de escucha para evento
        // windowClosing
        ventana.addWindowListener (
                // clase interna anónima para evento windowClosing
                new WindowAdapter ( ) {
                    // terminar aplicación cuando usuario cierra la ventana
                    public void windowClosing ( WindowEvent evento ) {
                        System.exit ( 0 );
                    }
                }    // fin de la clase interna anónima
     );    // fin de la llamada a addWindowListener para ventana
        ventana.setSize ( 400, 105 );
        ventana.setVisible ( true );
    }   // fin de main
}     
        
        
        
        
        
        
        
 