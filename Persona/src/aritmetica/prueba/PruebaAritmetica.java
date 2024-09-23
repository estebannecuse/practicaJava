package aritmetica.prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica operaciones = new Aritmetica(11,20);
        System.out.println("Operando1: " + operaciones.getOperando1());
        operaciones.setOperando1(5);
        System.out.println("Operando1: " + operaciones.getOperando1());
        operaciones.suma();
        operaciones.resta();

        Aritmetica operaciones2 = new Aritmetica(2,2);
        operaciones2.suma();
        operaciones2.resta();

    }
}
