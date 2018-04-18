package com.teaching.android;

public class Persona {


    private float dinero;
    private String nombre;

    public Persona(float dinero, String nombre) {
        this.dinero = dinero;
        this.nombre = nombre;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void pagar(Persona quien, float cantidad)
    {
        quien.dinero = quien.getDinero() + cantidad;
        this.dinero = this.dinero - cantidad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dinero=" + dinero +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
