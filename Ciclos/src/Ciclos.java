import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        System.out.println("CAJERO AUTOMATICO");
        boolean salir = false;
        double saldo = 1000.00;
        var consola = new Scanner(System.in);

        while(!salir){
            System.out.println("""
                    Menu:
                    1. Consultar Saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opcion: \s""");
            int opcion = Integer.parseInt(consola.nextLine());
            switch(opcion){
                case 1 -> System.out.println("Tu saldo actual es: $" + saldo);
                case 2-> {
                    System.out.print("Ingrese el importe a retirar: ");
                    double retiro =  Double.parseDouble(consola.nextLine());
                    if(retiro <= saldo){
                        saldo -= retiro;
                        System.out.println("el nuevo saldo es :$" + saldo);
                    }else {
                        System.out.println("No hay suficiente saldo");
                    }
                }
                case 3 ->{
                    System.out.println("Ingrese el monto a depositar: ");
                    double deposito = Double.parseDouble(consola.nextLine());
                    saldo += deposito;
                    System.out.println("Tu nuevo saldo es : $" + saldo);
                }
                case 4 -> {
                    System.out.println("Saliendo del cajero. Hasta pronto");
                    salir = true;
                }
                default -> System.out.println("Opcion no valida" + opcion);
            }
            System.out.println();
        }
    }
}
