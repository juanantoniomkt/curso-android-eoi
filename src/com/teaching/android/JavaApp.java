package com.teaching.android;

import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {

        int valor = 0;

       for(int i = 1; i <= 20; i++)
       {
           valor = valor + 2;

           System.out.println(i+" - "+valor);
       }

    }

}