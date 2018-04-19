package com.teaching.android;

public class Circulo {

    private Punto centro;
    private double radio;

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public Circulo(int x, int y, double radio) {

        //Composición en POO
        this.centro = new Punto(x, y);

        this.radio = radio;

    }

    public Circulo() {
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea()
    {

        double result = Math.PI * Math.pow(this.radio, 2);

        return result;
    }

    public double getCircumference()
    {

        double result = 2* Math.PI * this.radio;

        return result;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "centro=" + centro +
                ", radio=" + radio +
                '}';
    }
}