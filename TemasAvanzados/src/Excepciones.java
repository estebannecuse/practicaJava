public class Excepciones {
    public static void main(String[] args) {
        int valor1 = 10;
        int valor2 = 0;
        try{
            int resultado = valor1/valor2;
            System.out.println(resultado);
        }catch(Exception e){
            System.out.println("Ocurrio un error: " +e);
        }
    }
}
