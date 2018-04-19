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

        Punto p1 = new Punto (12, 12);

        System.out.print("Distancia - ");
        Punto.distancia(12, 12);

        System.out.println("");

        System.out.print("Distancia - ");
        p1.distancia(p1);

    }

}