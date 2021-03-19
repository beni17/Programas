package Conversor;



import javax.swing.*;

public class Conversor extends javax.swing.JFrame {
    //Declaracion de las variables
    private javax.swing.JLabel jblGradosC;
    private javax.swing.JTextField jtfGradosC;
    private javax.swing.JLabel jblGradosF;
    private javax.swing.JTextField jtfGradosF;
    private javax.swing.JButton jbtAceptar;
    private Object objTextField;

    //Creamos un formulario
    public Conversor(){
        setSize(300,300); //Size del formulario
        setTitle("Conversor de temperaturas");//Titulo del formulario
        initcomponents();

    }
    //Metodo llamado por el formulario
    private void initcomponents(){
        //Componentes
        jblGradosC= new javax.swing.JLabel();
        jtfGradosC= new javax.swing.JTextField();
        jblGradosF= new javax.swing.JLabel();
        jtfGradosF= new javax.swing.JTextField();
        jbtAceptar= new javax.swing.JButton();

        //Administrador de diseño en nullo
        getContentPane().setLayout(null);



        //Etiqueta "Grados centigrados"
        jblGradosC.setText("Grados centrigrados");
        getContentPane().add(jblGradosC);
        jblGradosC.setBounds(12,28,116,24);

        //Cajas de texto para los grados centigrados
        jtfGradosC.setText("0.00");
        jtfGradosC.setHorizontalAlignment(JTextField.RIGHT);
        getContentPane().add(jtfGradosC);
        jtfGradosC.setBounds(132,28,116,24);

        //Etiqueta farenheits
        jblGradosF.setText("Grados Farenheits");
        getContentPane().add(jblGradosF);
        jblGradosF.setBounds(12,68,104,24);

        //Caja de texto para farenheits
        jtfGradosF.setText("32.00");
        jtfGradosF.setHorizontalAlignment(JTextField.RIGHT);
        getContentPane().add(jtfGradosF);
        jtfGradosF.setBounds(132,72,144,24);

        //Boton de aceptar
        jbtAceptar.setText("Aceptar");
        jbtAceptar.setMnemonic('A');
        getRootPane().setDefaultButton(jbtAceptar);
        getContentPane().add(jbtAceptar);
        jbtAceptar.setBounds(132,120,144,24);

        java.awt.event.KeyListener kl= new java.awt.event.KeyAdapter(){
            public void keyTyped(java.awt.event.KeyEvent evt){

            }
        };
        jtfGradosC.addKeyListener(kl);

        getContentPane().setLayout(null);
        addWindowListener(new java.awt.event.WindowAdapter(){
            public void WindowClosing(java.awt.event.WindowEvent evt){
                salir(evt);
            }
        });
    }

    //Metodo para salir de la aplicacion
    private void salir(java.awt.event.WindowEvent evt){
        System.exit(0);
    }
}
