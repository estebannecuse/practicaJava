package Excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        try{
            var resultado = Aritmetica.division(10,2);
            System.out.println(resultado);
        }catch(Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Se reviso la division entre cero");
        }
    }
}
