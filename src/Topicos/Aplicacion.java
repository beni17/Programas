package Topicos;

import javax.swing.*;

public class Aplicacion {
    public static void main(String[]args){
        try {
            for (UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()){
                if ("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
                //Construimos el objeto frame
                frameCuadrado frame = new frameCuadrado();

                //Definimos una accion de cierre
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                //Hacemos visible el frame
                frame.setVisible(true);

                //Definimos el size del frame

                frame.setSize(300, 300);
            }
        }catch (Exception e){
            System.out.println("No se pudo establecer el aspecto deseado");
        }
    }
}
