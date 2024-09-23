public class ClaseAbstracta {
    public static void main(String[] args) {
       // FiguraGeometrica figura = new FiguraGeometrica(); - esto es un error,m no se instancia
        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica = new Circulo(); // se dibujo un circulo porque ahora estamos apunando a otro elemento de memoria
        figuraGeometrica.dibujar();
    }
}


//Clase abstracta
// no se puede instanciar
abstract class FiguraGeometrica {
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica{
    public void dibujar(){
        System.out.println("Se dibuja un rectangulo");
    }
}

class Circulo extends FiguraGeometrica{
    public void dibujar(){
        System.out.println("Se dibuja un circulo");
    }
}
