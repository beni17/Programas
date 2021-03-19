package EcuacionCuadratica;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.*;


public class EcuacionesCuadraticas extends JFrame{

    //Variables
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JTextField at;
    private JTextField bt;
    private JTextField ct;
    private JTextField x1,x2;

    private JLabel xOne;
    private JLabel xTwo;

    private JButton aceptar;
    private Object Boton;
    FlowLayout flowLayout;



    public EcuacionesCuadraticas(){

        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(250,300);
        Componentes();
        Boton();
        respuestas();

    }

    public void Componentes(){
        JPanel panelArriba= new JPanel();
        aceptar= new JButton();
        a= new JLabel();
        b=new JLabel();
        c=new JLabel();
        at=new JTextField(5);
        bt=new JTextField(3);
        ct= new JTextField(5);

        xOne= new JLabel();
        xTwo= new JLabel();

        x1= new JTextField(6);
        x2= new JTextField(6);

        //Etiquetas\
        a.setText("a");
        a.setBackground(Color.GRAY);
        getContentPane().add(a);
        panelArriba.add(a);

        at.setText("");
        getContentPane().add(at);
        panelArriba.add(at);


        b.setText("b");
        getContentPane().add(b);
        panelArriba.add(b);


        bt.setText("");
        getContentPane().add(bt);
        panelArriba.add(bt);


        c.setText("c");
        getContentPane().add(c);
        panelArriba.add(c);

        ct.setText("");
        getContentPane().add(ct);
        panelArriba.add(ct);
        getContentPane().add(panelArriba);
    }
    public void respuestas(){
        JPanel panelabajo= new JPanel();
        xOne.setText("x1");
        getContentPane().add(xOne);
        panelabajo.add(xOne);

        x1.setText("");
        getContentPane().add(x1);
        x1.setHorizontalAlignment(JTextField.CENTER);
        panelabajo.add(x1);



        xTwo.setText("x2");
        getContentPane().add(xTwo);
        panelabajo.add(xTwo);

        x2.setText("");
        getContentPane().add(x2);
        panelabajo.add(x2);
        getContentPane().add(panelabajo);

    }
    public void Boton(){

        JPanel panelCentro= new JPanel();

        aceptar.setText("Hacer Operacion");
        getContentPane().add(aceptar);
        panelCentro.add(aceptar);
        getContentPane().add(panelCentro);

        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}



