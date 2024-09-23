public interface Traductor {
    // por default son publicos y abstractos
    void traducir(); // este metodo es obligatorio

    // metodos con implementacion por default
    default void iniciarTraductor(){ // este metodo no es obligatorio
        System.out.println("Iniciando traductor");
    }
}

class Ingles implements Traductor{
    public void traducir(){
        System.out.println("traduzco a ingles");
    }
}

class Frances implements Traductor{
    public void traducir(){
        System.out.println("traduzco a frances");
    }

    @Override
    public void iniciarTraductor(){
        System.out.println("Iniciando traductor en frances");
    }
}


class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.traducir();
        ingles.iniciarTraductor();

        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();

    }
}