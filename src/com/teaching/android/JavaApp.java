package com.teaching.android;

import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {


        Persona p1 = new Persona(500, "paco");
        Persona p2 = new Persona(500, "pepe");

        p1.pagar(p2, 300);

        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }

}