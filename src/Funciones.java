public class Funciones {

    //defino fun saludo
    // public static String saludo(String nombre) {
    //     return "Hola " + nombre + "!";
    // }
    static void saludar(String mensaje){
        System.out.println("Mensaje: " + mensaje);
    }

    static int sumar(int a, int b){
        int resultado = a + b;
        return resultado;
    }

    static boolean esPar(int nro){
        return (nro % 2 == 0)? true: false;
    }

    static void fucionRecursiva(int numero){
        //caso base 
        if(numero == 1){
            System.out.println("Caso base: " + numero);
        }else{
            //caso recursivo 
            System.out.println("Caso recursivo: " + numero);
            fucionRecursiva(numero - 1);
        }
    }

    public static void main(String[] args) {
        saludar("Hola");
        
        int arg1 = 5, arg2 = 7;
        //System.out.println(sumar(arg1,arg2));
        //System.out.println(esPar(3));
        fucionRecursiva(5);
    }
}
