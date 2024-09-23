import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");

//        for(String elemento : miLista){
//            System.out.println(elemento);
//        }

        miLista.forEach(elemento ->{
            System.out.println(elemento);
        });

        // codigo simplificado com lambda

        miLista.forEach(System.out::println);
        // con :: accedo a println que es un metodo estatico y el automagicamente
        //accede a cada elemento del forEach y lo imprime sin necesidad de explicitarlo

        // otra forma de declarar la lista :

        List<String> nombres = Arrays.asList("Pedro","Juan","Manuel");
        nombres.forEach(System.out::println);
    }
}
