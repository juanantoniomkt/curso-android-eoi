package com.teaching.android;

import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {

        int cont = 0;

        int numeroAleatorio = (int) (Math.random()* 10 + 1);

        boolean acertado = false;
        String jugar = "no";

        do {

            cont = cont + 1;

            Scanner keyborad = new Scanner(System.in);

            System.out.println("Escribe un número: ");
            System.out.println("------------------------------------------------");
            int valor = keyborad.nextInt();

            if(valor > numeroAleatorio)
            {
                System.out.println("es aleatorio es menor!!");
            }

            else if(valor < numeroAleatorio)
            {
                System.out.println("es aleatorio es mayor!!");
            }

            else
            {
                acertado = true;
                System.out.println("Bien!! Has acertado");
            }

            if(cont == 3)
            {

                if(acertado == false)
                {
                    System.out.println("has perdido...");
                }

                cont = 0;
                System.out.println("repetir el juego??");

                jugar = keyborad.next();

                if (jugar.equals("no"))
                {
                    break;
                }
            }

        } while(jugar != "si");


    }

}