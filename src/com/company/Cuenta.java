package com.company;


import java.util.List;

public class Cuenta {
    // Cuenta attributes.
    private double saldo = 0;
    private Usuario usuario;
    private List<Gasto> gastos;
    private List<Ingreso> ingresos;
    private int index = 0;

    // Constructor with parameter
    public Cuenta(Usuario usuario) {
        this.usuario = usuario;
    }

    // Getters methods:
    public double getSaldo() {
        return this.saldo;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double addGastos(String description, double cantidad){
        try {
            if (cantidad > getSaldo()) {
                throw  new GastoException("Saldo insuficiente.");
            } else {
                gastos.add(new Gasto(cantidad, description));
                this.saldo = getSaldo() - cantidad;
                System.out.println("Saldo restante: "+ getSaldo());
            }
        } catch (GastoException ignored) {

        }
        return this.saldo;
    }

    public double addIngresos(String description, double cantidad) {
        Ingreso ingreso = new Ingreso(cantidad, description);
        this.ingresos.add(index, ingreso);
        this.saldo = this.getSaldo() + cantidad;
        this.index= this.index +1;
        return this.saldo;
    }

    public List<Gasto> getGastos() {
        return this.gastos;
    }

    public List<Ingreso> getIngresos() {
        return this.ingresos;
    }

    public String toString() {
        return "Usuario: "+ this.usuario.getNombre() + "Saldo : " + this.saldo;
    }
}
