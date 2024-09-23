import java.sql.SQLOutput;
import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
//        System.out.println("Ingrese el nombre: ");
//        var consola = new Scanner(System.in);
//        String nombre = consola.nextLine();
//
//        System.out.println("Ingresa la edad");
//        int edad = consola.nextInt();
//
//        System.out.println("Ingrese el sueldo: ");
//        double sueldo = consola.nextFloat();
//
//        System.out.println("Empleado de confianza? (true/false): ");
//        boolean confianza = consola.nextBoolean();
//
//        System.out.println("nombre: " + nombre);
//        System.out.println("Edad: " + edad);
//        System.out.println("Sueldo: " + sueldo);
//        System.out.println("Confianza: " + confianza);
//
////----------------------------------------------------------------------
//        final int MINIMO = 0;
//        final int MAXIMO = 5;
//
//        System.out.println("Proporcione un valor entre 0 y 5 ");
 //       int dato = consola.nextInt();
//        boolean dentroRango = dato >= MINIMO && dato <= MAXIMO;
//        System.out.println("Valor dentro de rango? : " + dentroRango);

//        String cadena1 = "Hola";
//        String cadena2 = "HOla";
//        if(cadena1.equals(cadena2)){
//            System.out.println("las cadenas son iguales en su contenido");
//        }else{
//            System.out.println("las cadenas son diferentes en su contenido");
//        }
//
//        if(cadena1 == cadena2){
//            System.out.println("las variables apunan a la misma unidad de memoria");
//        }else{
//            System.out.println("las cadenas no apuntan a la misma unidad de memoria");
//        }

        // sistema de calificaciones
        System.out.println("Proporciona una calificacion entre 0 y 10");
        double calificacion = Double.parseDouble(new Scanner(System.in).nextLine());
        if(calificacion >= 9 && calificacion <= 10){
            System.out.println("A");
        }else if(calificacion >= 8 && calificacion < 9){
            System.out.println("B");
        }else if(calificacion >=7 && calificacion < 8){
            System.out.println("C");
        }else if(calificacion >= 6 && calificacion < 7){
            System.out.println("D");
        }else if(calificacion >=0 && calificacion < 6){
            System.out.println("F");
        }else{
            System.out.println("Valor descocnocido");
        }
    }
}
