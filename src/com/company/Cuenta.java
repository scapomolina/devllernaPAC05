package com.company;

import java.util.List;

public class Cuenta {
    // Cuenta attributes.
    private double saldo = 0;
    private Usuario usuario;
    private List<Gasto> gastos;
    private List<Ingreso> ingresos;

    // Constructor with parameter
    public Cuenta(Usuario usuario){}

    // Methods:
    public double getSaldo(){
        double saldo = 0;
        return saldo;
    }

    public void setSaldo(double saldo){

    }

    public Usuario getUsuario(){
       return this.usuario;
    }

    public void setUsuario(Usuario usuario){

    }

    public double addGastos(String description, double cantidad) throws GastoException{
        try{

        }catch (GastoException e){

        }
        return 0;
    }

    public double addIngresos(String description, double cantidad){
        return this.saldo = this.getSaldo() + cantidad;
    }

    public List<Gasto> getGastos(){
        return this.gastos;
    }

    public List<Ingreso> getIngresos(){
        return this.ingresos;
    }
    public String toString(){
        return "String";
    }
}
