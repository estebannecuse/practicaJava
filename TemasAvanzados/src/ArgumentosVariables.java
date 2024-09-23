import javax.tools.SimpleJavaFileObject;

public class ArgumentosVariables {
    public static void main(String[] args) {
        variosParametros("Esteban", 1,2,3,4,5,8);
    }

    static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre: " + nombre);
        imprimirNumeros(numeros);
    }

    static void imprimirNumeros(int... numeros){
        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]+ " ");
        }

    }
}
