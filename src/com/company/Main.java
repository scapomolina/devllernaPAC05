package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world!");
        Usuario newUser = new Usuario();
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introduce el DNI del usuario \n");
        newUser.setDNI(miScanner.nextLine());
       /* while(!newUser.setDNI(miScanner.nextLine())){

            System.out.println("El Dni introducido es incorrecto, por favor "

                    + "introduzca un Dni válido.");
            newUser.setDNI(miScanner.nextLine());
        }*/


    }
}
