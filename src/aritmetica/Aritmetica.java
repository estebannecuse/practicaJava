package aritmetica;
public class Aritmetica {

    int operando1;
    int operando2;

    //Constructor se llaman igual que la clase.
     public Aritmetica(int op1, int op2){
        operando1 = op1;
        operando2 = op2;
     }
     public Aritmetica(){

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

        // si quiero usar un constructor vacio cuando ya tengo uno que espera parametros
        //tengoq ue crear otro constructor : sobrecarga de constructores
        Aritmetica operaciones2 = new Aritmetica();
        operaciones2.operando1 = 12;
        operaciones2.operando2 = 16;
        operaciones2.suma();
    }
}
