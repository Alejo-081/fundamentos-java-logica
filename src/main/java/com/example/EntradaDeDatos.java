package com.example;

import java.util.Scanner;

public class EntradaDeDatos {
    public static void demostrarEntradaDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println("Ingrese su estatura: ");
        double estatura = scanner.nextDouble();
        System.out.println("Hola " + nombre + " tu edad es " + edad + " y tu estatura es " + estatura);
    }
    public static void manejarsaltodeLineaPendiente(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.print("Ingrese su nombre completo: ");
        String nombre = sc.nextLine(); 
        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + nombre);
        sc.close();
    }
}
