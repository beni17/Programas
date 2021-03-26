
package ventanapruebatiempo;
// Declaraciones de clase interna utilizadas para crear 
// manejadores de eventos.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class VentanaPruebaTiempo extends JFrame  {

     private Tiempo tiempo;
    private JLabel horaEtiqueta, minutoEtiqueta, segundoEtiqueta;
    private JTextField horaCampo, minutoCampo, segundoCampo, 
                                                         pantallaCampo;
    private JButton salirBoton;
    // configurar GUI

    public VentanaPruebaTiempo ( ) {
        super ( "Demostración de clase interna" );
        tiempo = new Tiempo ( );  // crear objeto Tiempo
        Container contenedor = getContentPane ( );
        contenedor.setLayout ( new FlowLayout ( ) );

        // preparar horaEtiqueta y horaCampo
        horaEtiqueta = new JLabel ( "Ajuste hora" );
        horaCampo = new JTextField ( 10 );
        contenedor.add ( horaEtiqueta );
        contenedor.add ( horaCampo );
        // preparar minutoEtiqueta y minutoCampo
        minutoEtiqueta = new JLabel ( "Ajuste minuto" );
        minutoCampo = new JTextField ( 10 );
        contenedor.add ( minutoEtiqueta );
        contenedor.add ( minutoCampo );

        // preparar segundoEtiqueta y segundoCampo
        segundoEtiqueta = new JLabel ( "Ajuste segundo" );
        segundoCampo = new JTextField ( 10 );
        contenedor.add ( segundoEtiqueta );
        contenedor.add ( segundoCampo );

        // establecer pantallaCampo
        pantallaCampo = new JTextField ( 30 );
        pantallaCampo.setEditable ( false );
        contenedor.add ( pantallaCampo );
        // establecer salirBoton
        salirBoton = new JButton ( "Salir" );
        contenedor.add ( salirBoton );
        // crear una instancia de la clase interna ActionEventHandler
        ActionEventHandler manejador = new ActionEventHandler ( );
        // registrar manejadores de eventos; el objeto referenciado   
        // por manejador es el ActionListener, el cual contiene el
        // método actionPerformed que será llamado para manejar
        // los eventos de acción generados por horaCampo,
        // minutoCampo, segundoCampo y salirBoton
        horaCampo.addActionListener ( manejador );
        minutoCampo.addActionListener ( manejador );
        segundoCampo.addActionListener ( manejador );
        salirBoton.addActionListener ( manejador );
    }        // fin del constructor
    // mostrar tiempo en pantallaCampo
    public void mostrarTiempo ( ) {
        pantallaCampo.setText ( "La hora es: " + tiempo );
    }
    // iniciar aplicación: crear, ajustar tamaño y mostrar
    // VentanaPruebaTiempo; cuando main termina, el programa
    // continua ejecutándose ya que se muestra una ventana
    // mediante las instrucciones en main

    public static void main(String[] args) {
        // TODO code application logic here
                VentanaPruebaTiempo ventana = new
                                                                  VentanaPruebaTiempo ( );
        ventana.setSize ( 400, 140 );
        ventana.setVisible ( true );
    }     // fin de main
    // declaración de clase interna para manejar eventos JTextField
    // y JButton
    private class ActionEventHandler implements ActionListener {
        // método para manejar eventos de acción 
        public void actionPerformed ( ActionEvent evento ) {
            // el usuario oprimió salirBoton
            if ( evento.getSource ( ) == salirBoton ) {
                System.exit ( 0 );     // terminar la aplicación
            }   // el usuario oprimió tecla Intro en horaCampo
            else if ( evento.getSource ( ) == horaCampo ) {
                         tiempo.establecerHora ( Integer.parseInt (
                                                         evento.getActionCommand ( ) ) );
                         horaCampo.setText ( "" );
            }    // el usuario oprimió tecla Intro en minutoCampo
            else if ( evento.getSource ( ) == minutoCampo ) {
                          tiempo.establecerMinuto ( Integer.parseInt (
                                                         evento.getActionCommand ( ) ) );
                          minutoCampo.setText ( "" );
            }    // el usuario oprimió tecla Intro en segundoCampo
            else if ( evento.getSource ( ) == segundoCampo ) {
                          tiempo.establecerSegundo ( Integer.parseInt (
                                                        evento.getActionCommand ( ) ) );
                          segundoCampo.setText ( "" );
            }
            mostrarTiempo ( ); // llamar a un método de la clase externa
        }     // fin del método actionPerformed
    }         // fin de la clase interna ActionEventHandler
}             // fin de la clase VentanaPruebaTiempo

    
    

