package com.company;

public abstract class Dinero {
    protected double dinero;
    protected String description;
    // Métodos getter y setter de los atributos de la clase abstracta Dinero.
    public double getDinero(){
        return this.dinero;
    }
    public void setDinero(double dinero){
        this.dinero=dinero;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description=description;
    }
}
