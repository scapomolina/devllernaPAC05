package com.company;


import java.util.List;

public class Cuenta {
    // Cuenta attributes.
    private double saldo = 0;
    private Usuario usuario;
    private List<Gasto> gastos;
    private List<Ingreso> ingresos;

    // Constructor with parameter
    public Cuenta(Usuario usuario) {
    }

    // Getters methods:
    public double getSaldo() {
        return saldo;
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

    public double addGastos(String description, double cantidad) throws GastoException {
        try {
            if (cantidad > getSaldo()) {
                throw new GastoException("Saldo insuficiente.");
            } else {
                this.saldo = getSaldo() - cantidad;
            }
        } catch (GastoException ignored) {

        }
        return this.saldo;
    }

    public double addIngresos(String description, double cantidad) {
        return this.saldo = this.getSaldo() + cantidad;
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
