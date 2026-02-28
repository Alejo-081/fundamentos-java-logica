package com.example;

public class EstructurasCondicionales {
    public static void ejemploIf() {
        if (10 >= 8) {
            System.out.println("Es mayor");
            
        }
    }

    public static void ejemploIfElse() {
        if (10 >= 8) {
            System.out.println("Es mayor");

        } else {
            System.out.println("Es menor");
        }
    }

    public static void ejemploIfElseIf() {
        int numero = 10;
        if (numero == 10) {
            System.out.println("Es igual a 10");
    }
        else if (numero > 10) {
            
        }
    }
    public static void ejemploSwitch() {
        int numero = 10;
        switch (numero) {
            case 10:
                System.out.println("Es igual a 10");
                break;
            case 20:
                System.out.println("Es igual a 20");
                break;
            default:
                System.out.println("No es igual a 10 ni a 20");
                break;
        }
    }
    public static void ejemploSwitchExpression() {
        String nombre = "Juan";
        switch (nombre) {
            case "Juan":
                System.out.println("Es igual a Juan");
                break;
            case "Pedro":
                System.out.println("Es igual a Pedro");
                break;
            default:
                System.out.println("No es igual a Juan ni a Pedro");
                break;
        }
    }
}