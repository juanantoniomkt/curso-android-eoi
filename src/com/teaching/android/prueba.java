package com.teaching.android;

public class prueba {

    public static void main(String[] args) {

        int [] r1 = {3, 2, 1, 1, 2 , 3, 2, 3, 1};
        int [] r2 = {1, 1, 2, 2, 1 , 1, 1, 2, 1};

        int[][] m1 = new int [3][3];
        int[][] m2 = new int [3][3];

        Matriz matriz1 = new Matriz (m1);
        Matriz matriz2 = new Matriz (m2);

        matriz1.asignarDatos(r1);
        matriz2.asignarDatos(r2);

        matriz1.mostrar();
        System.out.println("");
        matriz2.mostrar();

        System.out.println("");
        System.out.println("");
        System.out.println("suma");
        matriz1.suma(matriz2);

        System.out.println("");
        System.out.println("");
        System.out.println("multiplicación");
        matriz1.producto(matriz2);

    }

}
