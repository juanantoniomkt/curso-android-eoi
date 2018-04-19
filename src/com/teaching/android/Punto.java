package com.teaching.android;

public class Punto {

    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void distancia(int x, int y)
    {



        double distancia =  (Math.pow(2, ((x * x) - x))) + (Math.pow(2, ((x * x) - x)));
        double total = Math.sqrt(distancia);

        System.out.println(total);
    }

    public void distancia(Punto p)
    {
        double distancia =  (Math.pow(2, ((p.x * p.x) - p.x))) + (Math.pow(2, ((p.x * p.x) - p.x)));
        double total = Math.sqrt(distancia);

        System.out.println(total);
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
