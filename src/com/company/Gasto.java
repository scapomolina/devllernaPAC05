package com.company;

public class Gasto extends Dinero{
    public Gasto(double gasto, String description){
        super.dinero=gasto;
        super.description=description;
    }
    public String toString(){
        return "Descripción de gasto: "+ super.description + " Cantidad: " + super.dinero;
    }
}
