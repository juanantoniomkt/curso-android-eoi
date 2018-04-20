package com.teaching.android;

import java.util.Arrays;

public class Matriz {

    private int[][] matriz;

    public Matriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public void asignarDatos(int[] vector)
    {
        int cont = 0;

        for(int i = 0; i<this.matriz.length; i++)
        {
            for(int j = 0; j<this.matriz[i].length; j++)
            {
                this.matriz[i][j] = vector[cont++];
            }
        }

    }

    public void mostrar()
    {
        for(int i = 0; i<this.matriz.length; i++)
        {
            System.out.println("");
            for(int j = 0; j<this.matriz.length; j++)
            {
                System.out.print(this.matriz[i][j]);
            }
        }
    }

    public void suma(Matriz m)
    {

        int[][] matrizDevuelta = new int [m.matriz.length][m.matriz.length];

        for(int i = 0; i<this.matriz.length; i++)
        {
            for(int j = 0; j<this.matriz.length; j++)
            {
                matrizDevuelta[i][j] = this.matriz[i][j] + m.matriz[i][j];

                System.out.print(matrizDevuelta[i][j]);
            }
        }
    }

    public void producto(Matriz m)
    {

        int[][] matrizDevuelta = new int [m.matriz.length][m.matriz.length];

        for(int i = 0; i<this.matriz.length; i++)
        {
            for(int j = 0; j<this.matriz.length; j++)
            {
                matrizDevuelta[i][j] = this.matriz[i][j] * m.matriz[i][j];

                System.out.print(matrizDevuelta[i][j]);
            }
        }
    }

}