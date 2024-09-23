import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
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

    }
}
