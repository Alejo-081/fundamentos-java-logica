package com.example;

public class ConversionDeTipos {

    public static void demostrarCastingImplicito(){
        System.out.println("Demostración de casting implícito");
        int numero = 8;
        double numeroDecimal = numero; 

        System.out.println(numeroDecimal);
    }
    public static void demostrarCastingExplicito(){
        System.out.println("Demostración de casting explícito");
        double numeroDecimal = 8.5;
        int numero = (int) numeroDecimal;

        System.out.println(numero);
    }
    public static void demostrarProblemasDePrecision(){
        System.out.println("Demostración de problemas de precisión");
        double numDecimal = 0.1;
        double numDecimal2 = 0.2;
        double suma = numDecimal + numDecimal2;

        System.out.println(suma);
    }
}
