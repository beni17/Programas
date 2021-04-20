/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication92;

import java.util.Random;

/**
 *
 * @author HP
 */
public class Carrera extends Thread {
      String nombre;
    int velocidad;

    public Carrera(String nombre,int velocidad) 
    {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public void run()
    {
        for(int i=1;i<=25;i++)
        {
            System.out.print(nombre+" ");
            try {
                sleep(1000/velocidad);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
        System.out.println("Terminó: "+nombre+"\n");
    }

    public static void main(String[] args)
    {
        Random random = new Random();
        Carrera friki1 = new Carrera("f1", random.nextInt(10));
        Carrera friki2 = new Carrera("f2", random.nextInt(10));
        Carrera friki3 = new Carrera("f3", random.nextInt(10));

        friki1.start();
        friki2.start();
        friki3.start();
    }
}

