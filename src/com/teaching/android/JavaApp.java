package com.teaching.android;

import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {

        Scanner keyborad = new Scanner(System.in);

        int valor = keyborad.nextInt();


        if(valor %2==0)
        {
            System.out.println("número es par");
        }
        else
        {
            System.out.println("número es impar");
        }

    }

}