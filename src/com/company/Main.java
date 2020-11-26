package com.company;

import java.util.Scanner;

public class Main {
    private final static String INPUT_DESCRIPTION = "Introduce la descripción:\n";
    private final static String INPUT_CANTIDAD = "Introduce la cantidad:\n";


    public static void main(String[] args) {
        Integer menuOption = null;
        // new Usuario Object instance
        Usuario newUser = new Usuario();
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el nombre de usuario:\n");
        newUser.setNombre(input.nextLine());
        System.out.println("Introduce la edad del usuario:\n");
        newUser.setEdad(input.nextInt());
        System.out.println("Introduce el DNI del usuario:\n");
        newUser.setDNI(input.nextLine());

        // Repeat the input DNI until newUser.setDNi method return true value.
        boolean isCorrectDNI;
        do {
            isCorrectDNI = newUser.setDNI(input.nextLine());
            if(!isCorrectDNI) {
                System.out.println("DNI introducido incorrecto.");
                System.out.println("Introduce el DNI del usuario válido \n");
            }
        } while (!isCorrectDNI);

        System.out.println("Usuario creado correctamente.");

        // New instance of the object Cuenta.
        Cuenta newCuenta = new Cuenta(newUser);
        String description;
        double cantidad;

        do {
            menuOptionsFrame();
            menuOption = input.nextInt();
            switch (menuOption) {
                case 1:
                    Scanner inpout = new Scanner(System.in);
                    System.out.println("----------------------------------");
                    // Add a new spending to the user account
                    System.out.println(INPUT_DESCRIPTION);
                    description = input.next();
                    System.out.println(INPUT_CANTIDAD);
                    cantidad = inpout.nextDouble();
                    newCuenta.addGastos(description, cantidad);
                    break;
                case 2:

                    Scanner inn = new Scanner(System.in);
                    System.out.println("----------------------------------");
                    // Add a new entry to the user account
                    System.out.println(INPUT_DESCRIPTION);
                    description = input.next();
                    System.out.println(INPUT_CANTIDAD);
                    cantidad = inn.nextDouble();
                    newCuenta.addIngresos(description, cantidad);
                    break;
                case 3:
                    //Show spendins
                    System.out.println("----------------------------------");
                    newCuenta.getGastos().stream().map(gasto -> gasto.description + gasto.dinero).forEach(System.out::println);
                    break;
                case 4:
                    //Show entries
                    System.out.println("----------------------------------");
                    newCuenta.getIngresos().stream().map(ingreso -> ingreso.description + ingreso.dinero).forEach(System.out::println);
                    break;
                case 5:
                    //show total saldo
                    System.out.println("----------------------------------");
                    double saldo = newCuenta.getSaldo();
                    System.out.println("Saldo total: "+ saldo);
                    break;
                case 0:
                    System.out.println("Fin del programa");
                    System.out.println("Gracias por utilizar la aplicación.");
                    break;
                default:
                    break;
            }

        } while (menuOption != 0);

    }

    // Method created per the Menu User Interface in console.
    private static void menuOptionsFrame() {
        System.out.println("Realiza una nueva acción.");
        System.out.println("1 Introduce un nuevo gasto");
        System.out.println("2 Introduce un nuevo ingreso");
        System.out.println("3 Mostrar gastos");
        System.out.println("4 Mostrar ingresos");
        System.out.println("5 Mostrar saldo");
        System.out.println("0 Salir ");
    }
}
