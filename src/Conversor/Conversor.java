package Conversor;
import javax.swing.*;
import java.awt.event.KeyEvent;

public class Conversor extends javax.swing.JFrame {
    //Declaracion de las variables
    private javax.swing.JLabel jblGradosC;
    private javax.swing.JTextField jtfGradosC;
    private javax.swing.JLabel jblGradosF;
    private javax.swing.JTextField jtfGradosF;
    private javax.swing.JButton jbtAceptar;
    private Object objTextField;
    private double grados;

    //Creamos un formulario
    public Conversor(){
        setSize(300,300); //Size del formulario
        setTitle("Conversor de temperaturas");//Titulo del formulario
        initcomponents(); //Iniciamos los componentes

    }
    //Metodo llamado por el formulario
    private void initcomponents(){
        getContentPane().setLayout(null);
        addWindowListener(new java.awt.event.WindowAdapter(){
            public void windowClosing(java.awt.event.WindowEvent evt){
                salir(evt);
            }
        });
        //Componentes
        jblGradosC= new javax.swing.JLabel();
        jtfGradosC= new javax.swing.JTextField();
        jblGradosF= new javax.swing.JLabel();
        jtfGradosF= new javax.swing.JTextField();
        jbtAceptar= new javax.swing.JButton();

        //Administrador de diseño en nullo


        //Etiqueta "Grados centigrados"
        jblGradosC.setText("Grados centrigrados");
        getContentPane().add(jblGradosC);
        jblGradosC.setBounds(12,28,116,24);

        //Cajas de texto para los grados centigrados
        jtfGradosC.setText("0.00");
        jtfGradosC.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(jtfGradosC);
        jtfGradosC.setBounds(132,28,144,24);

        //Etiqueta farenheits
        jblGradosF.setText("Grados Farenheits");
        getContentPane().add(jblGradosF);
        jblGradosF.setBounds(12,68,104,24);

        //Caja de texto para farenheits
        jtfGradosF.setText("32.00");
        jtfGradosF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(jtfGradosF);
        jtfGradosF.setBounds(132,72,144,24);

        //Boton de aceptar boton por omision
        jbtAceptar.setText("Aceptar");
        getRootPane().setDefaultButton(jbtAceptar);
        getContentPane().add(jbtAceptar);
        jbtAceptar.setBounds(132,120,144,24);

        //Manejador de eventos asociados con el boton
        jbtAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt){
                jbtAceptarActionPerformed(evt);
        }
        });
        //
        java.awt.event.KeyListener kl= new java.awt.event.KeyAdapter(){
            public void keyTyped(java.awt.event.KeyEvent evt){
                jtfGradosKeyType(evt);
            }
        };
        jtfGradosC.addKeyListener(kl);
        jtfGradosF.addKeyListener(kl);


    }
    //Metodo para salir de la aplicacion
    private void salir(java.awt.event.WindowEvent evt){
        System.exit(0);
    }

    public void jtfGradosKeyType(java.awt.event.KeyEvent evt){
        objTextField= evt.getSource(); //Objeto que produjo un evento
    }

    //Este metodo responde al clic del boton aceptar
    private void jbtAceptarActionPerformed(java.awt.event.ActionEvent evt){


            // si se escribio en la caja del texto grados centigrados..
        try {
            if (objTextField == jtfGradosC) {
                    grados = Double.parseDouble(jtfGradosC.getText()) * 9.0 / 5.0 + 32.0;
                    String texto = String.format("%.2f", grados);//redondear a dos decimales
                    jtfGradosF.setText(texto);


            }
            //Si se escribio en la caja del texto grados Farenheit
            if (objTextField==jtfGradosF){

                    grados = (Double.parseDouble(jtfGradosF.getText()) - 32.0) * 5.0 / 9.0;
                    String texto = String.format("%.2f", grados); //Redondear a dos decimales
                    jtfGradosC.setText(texto);
            }
        }catch (NumberFormatException e){
            jtfGradosC.setText("0.00");
            jtfGradosF.setText("32.00");
        }

    }
}
