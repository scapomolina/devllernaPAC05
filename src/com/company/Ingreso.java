package com.company;

public class Ingreso extends Dinero {

    public Ingreso(double ingreso, String description){
        super.dinero=ingreso;
        super.description=description;
    }
    public String toString(){
        return  "Descripción del ingreso: "+ super.description + " Cantidad: " + super.dinero;
    }
}
