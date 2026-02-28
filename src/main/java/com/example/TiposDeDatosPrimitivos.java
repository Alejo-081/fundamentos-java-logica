package com.example;

public class TiposDeDatosPrimitivos {

    public static void demostrarEnteros(){
        System.out.println("Mostrar enteros");
        byte  numMuyChicos = 112;
        short numChicos = 31493;
        int numEntero = 3149384;
        long numGrandes = 3149384123123123L;

        System.out.println(numMuyChicos);
        System.out.println(numChicos);
        System.out.println(numEntero);
        System.out.println(numGrandes);
    }
    public static void demostrarFlotantes(){
        System.out.println("Mostrar flotantes");
        float numCorto = 3.14F;
        double numLargo = 3.141592;

        System.out.println(numCorto);
        System.out.println(numLargo);
    }
    public static void demostrarCaracteres(){
        System.out.println("Mostrar caracteres");
        char caracter = 'a';
        char codigoAscii = 68;

        System.out.println(caracter);
        System.out.println(codigoAscii);
    }
    public static void demostrarBooleanos(){
        System.out.println("Mostrar booleanos");
        boolean verdadero = true;
        boolean falso = false;

        System.out.println(verdadero);
        System.out.println(falso);
    }
    public void  demostrarValoresPorDefecto(){
    }
}
