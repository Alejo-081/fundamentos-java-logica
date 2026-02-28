package com.example;

public class Operadores {
    public  static void demostrarAritmeticos(){
        System.out.println("Operadores aritmeticos");
        int i = 10;
        int n = 20;

        System.out.println("Suma:" + (i + n));
        System.out.println("Resta:" + (i - n));
        System.out.println("Multiplicacion:" + (i * n));
        System.out.println("Division:" + (i / n));
        System.out.println("Modulo:" + (i % n));

 }
    public static void demostrarIncrementoDecremento(){
        System.out.println("Operadores Incremento y Decremento");
        int k = 10;
        int l = 20;

        System.out.println("Incremento:" + (++k));
        System.out.println("Decremento:" + (--l));

    }
    
    public static void demostrarRelacionales(){
        System.out.println("Operadores Relacionales");
        int i = 10;
        int n = 20;

        System.out.println("Mayor:" + (i > n));
        System.out.println("Menor:" + (i < n));
        System.out.println("Menor o igual:" + (i <= n));
        System.out.println("Mayor o igual:" + (i >= n));
        System.out.println("Igual:" + (i == n));
        System.out.println("Diferente:" + (i != n));
        
    }
    public static void demostrarLogicos(){
        System.out.println("Operadores Logicos");
        int i = 10;
        int n = 20;

        System.out.println("AND:" + (i > 5 && n > 10));
        System.out.println("OR:" + (i > 5 || n > 10));
        System.out.println("NOT:" + !(i > 5 && n > 10));
    }
    public static void demostrarAsignacionCompuesta(){
        System.out.println("Operadores de Asignacion Compuesta");
        int i = 10;
        int n = 20;

        System.out.println("Suma:" + (i += n));
        System.out.println("Resta:" + (i -= n));
        System.out.println("Multiplicacion:" + (i *= n));
        System.out.println("Division:" + (i /= n));
        System.out.println("Modulo:" + (i %= n));   
        
    }
    public static void demostraroperadorternario(){
        System.out.println("Operador Ternario");
        int i = 10;
        int n = 20;

        System.out.println("Mayor:" + (i > n ? "i es mayor que n" : "i es menor que n"));
        
    }

}
