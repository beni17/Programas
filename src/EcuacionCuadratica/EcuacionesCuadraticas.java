package EcuacionCuadratica;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class EcuacionesCuadraticas extends JFrame{

    //Variables las etiquetas
    private JLabel a,b,c;
    //
    private JTextField at,bt,ct,x1,x2;
    private JLabel xOne,xTwo;
    private JButton aceptar;
    private Object Boton;

    //Constructor
    public EcuacionesCuadraticas(){
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(270,200);//Size que definimos
        setLocationRelativeTo(null);//Aparece en el centro

        setResizable(false);//Se bloque los rangos de la ventana
        Componentes();
        Boton();
        respuestas();

    }
    //
    public void Componentes(){
        JPanel panelArriba= new JPanel();
        aceptar= new JButton();
        a= new JLabel();
        b=new JLabel();
        c=new JLabel();
        at=new JTextField(5);
        bt=new JTextField(5);
        ct= new JTextField(5);

        xOne= new JLabel();
        xTwo= new JLabel();

        x1= new JTextField(6);
        x2= new JTextField(6);

        //Etiquetas
        a.setText("a"); //Como se llama la etiqueta
        getContentPane().add(a);
        panelArriba.add(a);

        //Caja de texto
        at.setText("");
        getContentPane().add(at);
        panelArriba.add(at);
        //Etiquetas
        b.setText("b");
        getContentPane().add(b);
        panelArriba.add(b);

        //Caja de texto
        bt.setText("");
        getContentPane().add(bt);
        panelArriba.add(bt);

        //Etiquetas
        c.setText("c");
        getContentPane().add(c);
        panelArriba.add(c);

        //Caja de texto
        ct.setText("");
        getContentPane().add(ct);
        panelArriba.add(ct);
        getContentPane().add(panelArriba);
    }
    public void respuestas(){
        JPanel panelabajo= new JPanel();
        //Etiqueta
        xOne.setText("x1");
        getContentPane().add(xOne);
        panelabajo.add(xOne);
        //Caja de texto
        x1.setText("");
        getContentPane().add(x1);
        x1.setHorizontalAlignment(JTextField.CENTER);
        panelabajo.add(x1);

        //Etiqueta
        xTwo.setText("x2");
        getContentPane().add(xTwo);
        panelabajo.add(xTwo);
        //Caja de texto
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



