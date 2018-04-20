package com.teaching.android;

import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {


        /*
        Persona p1 = new Persona(500, "paco");
        Persona p2 = new Persona(500, "pepe");

        p1.pagar(p2, 300);

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        */

        /*
        Punto p1 = new Punto (2, 4);
        //Punto p2 = new Punto (3, 5);
        */

        /*

        System.out.print("Distancia con  método 1 - ");
        System.out.println(p1.distancia(3, 5));

        System.out.println("");

        System.out.print("Distancia con método 2 - ");
        System.out.println(p1.distancia(p2));

        Triangulo t1 = new Triangulo(20, 20);

        t1.area(t1);

        */


        /*
        Circulo c1 = new Circulo(p1, 10);
        Circulo c2 = new Circulo(2, 4, 10);

        System.out.println("área c1 " + c1.getArea());
        System.out.println("radio c1 " + c1.getRadio());

        System.out.println("");

        System.out.println("área c2 " + c2.getArea());
        System.out.println("radio c2 " + c2.getRadio());
        */

        int[][] matriz = {{3, 2, 1}, {1, 2, 3}, {2, 3, 1}};

        for(int i = 0; i<matriz.length; i++)
        {
            System.out.println(" ");
            for(int j = 0; j<matriz[i].length; j++)
            {
                System.out.print(matriz[i][j] + " ");
            }
        }

    }

}