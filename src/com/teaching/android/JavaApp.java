package com.teaching.android;

import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {

        int cont = 0;

       for(int i = 0; i < 40; i = i+2)
       {
           cont = cont + 1;

           System.out.println(cont + " - num " + i);
       }

    }

}