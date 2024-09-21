public class Aritmetica {

    int operando1;
    int operando2;

    //Constructor
     public Aritmetica(int op1, int op2){

     }

    void suma(){
        int resultado = operando1 + operando2;
        System.out.println("Resultado de la suma: " + resultado);
    }

    void resta(){
        int resultado = operando1 - operando2;
        System.out.println("EL resultado de la resta: " + resultado);
    }

    public static void main(String[] args) {
        Aritmetica operaciones = new Aritmetica(10,20);
        operaciones.suma();
        operaciones.resta();
    }
}
