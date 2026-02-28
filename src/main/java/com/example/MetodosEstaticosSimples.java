    package com.example;

public class MetodosEstaticosSimples {
     public static void ejemploDeclaracionLlamada() {
        System.out.println("Hola, este es un método estático.");
        System.out.println("No recibe parámetros y no retorna nada.");
    }

    public static void ejemploPasoParametros(String nombre, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static int ejemploRetornoValores(int a, int b) {
        return a + b; // Retorna la suma de a y b

    }
    public static void ejemplosobrecarga() {
        // Llamadas a los métodos con diferentes parámetros
        ejemploPasoParametros("Juan", 25);
        ejemploPasoParametros("Ana", 30); 
        
    }

}
