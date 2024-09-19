import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        int[] enteros;
        enteros = new int[5]; // entre corchetes indico la cantidad de elementos
        enteros[0] = 21;
        // sintaxis simplificada de arreglos 
        int[] enterosSimplificados = {100,200,300,400,500};
        System.out.println(enterosSimplificados[0]); // imprime 100
        for(int i =0;i<enterosSimplificados.length;i++){
            System.out.println("El valor del indice" + i + "es: "+ enterosSimplificados[i]); // imprime cada elemento del arreglo
        }

        //introducir valores a un arreglo 
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el largo del arreglo");
        int largoArreglo = Integer.parseInt(consola.nextLine());
        int[] arreglo = new int[largoArreglo];
        for(int i = 0;i<arreglo.length;i++){
            System.out.println("Proporciona enteros["+i+"] = ");
            arreglo[i] = Integer.parseInt(consola.nextLine());
        }
        // imprimo los valores 
        System.out.println("\n Impresion del arreglo");
        for(int i = 0;i<arreglo.length;i++){
            System.out.println("arreglo[" + i + "] = " + arreglo[i]);
        }

        //promedio calificaciones 

        System.out.println("Cuantas calificaciones deseas agregar?");
        int totalCalificaciones = Integer.parseInt(consola.nextLine());

        int[] calificaciones = new int[totalCalificaciones];
        for(int i = 0;i<calificaciones.length;i++){
            System.out.println("Proporciona la calificacion [" + i + "]");
            calificaciones[i] = Integer.parseInt(consola.nextLine());
        }
        int sumaCalificaciones = 0;
        for(int i = 0;i<calificaciones.length;i++){
            sumaCalificaciones += calificaciones[i];
        }
        double promedio = sumaCalificaciones / totalCalificaciones;
        System.out.println("El promedio de las calificaciones es: " + promedio);
    }
}
