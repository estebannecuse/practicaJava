//import java.util.Scanner;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        //defino como constante 
        final int Renglones = 2;
        final int Columnas = 3;
        //creo un array bidimensional
        int[][] matriz = new int[Renglones][Columnas];
        // lleno la matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        //accedo a valores
        System.out.println("Valor 1 [0][0] = " + matriz[0][0]);
        System.out.println("Valor 5 [1][1] = " + matriz[1][1]);
        
        //recorrer matriz
        for (int i = 0; i < Renglones; i++) {
            for (int j = 0; j < Columnas; j++) {
                System.out.println("Valor ["+ i + "]["+j+"} = " + matriz[i][j]);
            }
        }

        //defino matriz simplificado - misma matriz de otra forma.

        int[][] matriz2 = {{100,200,300},{400,500,600}};

        //recorrer matriz2
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.println("Valor ["+ i + "]["+j+"} = " + matriz2[i][j]);            }
        }

        int renglones2, columnas2;
        var consola = new Scanner(System.in);

        //defino la matriz
        System.out.print("Proporciona los renglones de la matriz");
        renglones2 = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona las columnas de la matriz");
        columnas2 = Integer.parseInt(consola.nextLine());

        int[][] matriz3 = new int[renglones2][columnas2];
        //solicitar los valores
        for(int ren=0;ren<renglones2;ren++){
            for(int col = 0; col < columnas2; col++){
                System.out.print("Proporciona el valor ["+ren+"]["+col+"]");
                matriz3[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }
        //itero los valores 
        for (int ren = 0; ren< renglones2; ren++) {
            for (int col = 0; col < columnas2; col++) {
                System.out.println("Matriz ["+ren+"]["+col+"] = " + matriz3[ren][col] + " ");
                System.out.println();
            }
        }


        //ejercicio sumar diagonal 
        int[][] matrizSuma = {{100,200,300},{400,500,600},{700,800,900}};
        int total = 0;
        for(int ren = 0; ren < matrizSuma.length ; ren++){
            for(int col = 0; col< matrizSuma[ren].length ; col++){
                if(ren == col){
                    total += matrizSuma[ren][col];
                }
            }
        }
        System.out.println("Total suma : " + total);

    }
}
