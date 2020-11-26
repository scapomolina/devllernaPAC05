package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {
    //Attributes of the object Usuario
    private String nombre;
    private int edad;
    private String DNI;

    // Usuario empty params constructor.
    public Usuario() {
    }

    //  Getters attributes methods.
    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getDNI() {
        return this.DNI;
    }

    // Setters methods of the class attributes
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // DNI Format checker method.
    public boolean setDNI(String dni) {
        if (dni.isEmpty()) return false;
        char simbol = dni.charAt(8);
        // check if the string at the position 8 keeps a dash sign
        if (simbol == '-') {
            // Replace dash per space.
            dni = dni.replace('-', ' ');
            // Erase spaces in the dni String.
            dni = dni.trim().replaceAll("\\s+", "");
        }
        /* Regex DNI format : first 8 digits should be a number between 0 and 9 :[0-9]{8}
        then the last char should be an upperCase char from A to Z alphabet --> [A-Z]*/
        Pattern dniFormatPattern = Pattern.compile("[0-9]{8}[A-Z]");

        // Check  whether the dni string matches with the Regex DNI format.
        Matcher isCorrectFormat = dniFormatPattern.matcher(dni);
        return isCorrectFormat.matches();
    }

    public String toString() {
        return "Nombre: "+ getNombre() + " Edad: " + getEdad() + " DNI: " + getDNI();
    }

}
