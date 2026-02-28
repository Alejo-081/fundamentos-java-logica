package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejobasicoExcepciones {
    public static void ejemploTryCatchDivision(){
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        }
    }
    public static void ejemploTryCatchInput(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un numero");
            int numero = scanner.nextInt();
            System.out.println("El numero ingresado es: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un numero");
        }
        
    }
    public static void ejemploBloqueFinally(){
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        } finally {
            System.out.println("Este bloque se ejecuta siempre");
        }
        
    }
    public static void evitarCierrePrograma(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un numero");
            int numero = scanner.nextInt();
            System.out.println("El numero ingresado es: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un numero");
        } finally {
            System.out.println("Este bloque se ejecuta siempre");
        }

    }
}
