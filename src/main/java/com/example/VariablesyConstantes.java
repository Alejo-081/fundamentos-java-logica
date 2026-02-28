package com.example;

public class VariablesyConstantes {

    public  static void desmotrarDeclaracionAsignacion() {
        System.out.println("Demostrar Declaracion y Asignacion");

        int numero = 10;
        String nombre = "Juan";
        double pi = 3.1416;
        boolean verdadero = true;

        System.out.println(numero);
        System.out.println(nombre);
        System.out.println(pi);
        System.out.println(verdadero);
    }

    public static void demostrarConvencionesNombres(){
        System.out.println("Demostrar Convenciones de Nombres");
        int numeroDeEstudiantes = 10;
        String nombreCompleto = "Juan Perez";
        double precioProducto = 19.99;
        
        System.out.println(numeroDeEstudiantes);
        System.out.println(nombreCompleto);
        System.out.println(precioProducto);

    }

    public static void demostrarConstantes(){
        System.out.println("Demostrar Constantes");
        final int NumeroMaximo = 100;
        final String NombreEmpresa = "Empresa S.A.";

        System.out.println(NumeroMaximo);
        System.out.println(NombreEmpresa);
    }

}

