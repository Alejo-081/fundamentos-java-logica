package com.example;

public class ManipulacionCadenas {
    public static void DemostrarConcatenacion() {
        int numero = 10;
        String cadena = "Hola";
        String cadena2 = "Mundo";
        String cadena3 = cadena + " " + cadena2 + " " + numero;
        System.out.println(cadena3);
    }
    public static void demostrarMetodosutiles() {
        String cadena = "Hola Mundo";
        System.out.println(cadena.charAt(0));
        System.out.println(cadena.trim());
        System.out.println(cadena.length());
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.indexOf("M"));
        System.out.println(cadena.substring(0, 4));
        System.out.println(cadena.replace("M", "X"));

    }
    public static void demostrarInmutabilidad() {
        String cadena = "Hola";
        cadena = cadena + " Mundo";
        System.out.println(cadena);
    }
    public static void usarsteinRuilder() {
        StringBuilder cadena = new StringBuilder();
        cadena.append("Hola");
        cadena.append(" Mundo");
        System.out.println(cadena);
    }
}
