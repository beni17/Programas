package Topicos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class frameCuadrado extends JFrame {
    //Declarar los componentes
    private JLabel lblnumero;
    private JTextField txtNumero, txtResultado;
    private JButton btCuadrado,btLimpiar;

    //Constructor
    public frameCuadrado(){
        setSize(300,300);
        setTitle("");
        Componentes();

    }
    public void Componentes(){

        lblnumero= new JLabel();
        txtNumero= new JTextField();
        txtResultado= new JTextField();
        btCuadrado= new JButton();
        btLimpiar= new JButton();

        getContentPane().setLayout(null);

        lblnumero.setText("Primer numero");
        getContentPane().add(lblnumero);
        lblnumero.setBounds(0,28,144,24);

        txtNumero.setText("");
        txtNumero.setHorizontalAlignment(JTextField.RIGHT);
        getContentPane().add(txtNumero);
        txtNumero.setBounds(122,28,144,24);

        txtResultado.setText("Resulado");
        getContentPane().add(txtResultado);
        txtResultado.setHorizontalAlignment(JTextField.CENTER);
        txtResultado.setBounds(70,70,130,24);
        txtResultado.setEditable(false);

        btCuadrado.setText("Sacar el resultado");
        getContentPane().add(btCuadrado);
        btCuadrado.setBounds(70,100,170,24);




            btCuadrado.addActionListener(new ActionListener() {
                @Override

                public void actionPerformed(ActionEvent e) {
                    try {
                        if (e.getSource() == btCuadrado) {
                            int n = Integer.parseInt(txtNumero.getText());
                            double cuadrado = Math.pow(n, 2);
                            String resultado = String.valueOf(cuadrado);
                            txtResultado.setText(resultado);
                        }
                    }catch (NumberFormatException a){
                        txtResultado.setText("Introdusca un numero");
                    }
                }
            });

        btLimpiar.setText("Limpiar");
        getContentPane().add(btLimpiar);
        btLimpiar.setBounds(70,130,170,24);

            btLimpiar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        if (e.getSource()==btLimpiar){
                            txtResultado.setText("0");
                        }
                    }catch (NumberFormatException exception){
                        txtResultado.setText("Error");
                    }
                }
            });


    }


}

