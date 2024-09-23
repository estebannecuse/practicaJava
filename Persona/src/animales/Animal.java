package animales;

public class Animal {
 public void hacerSonido(){
     System.out.println("El animal hace un sonido");
 }
}

// podemos agregar mas clases pero solo una es publica, la que coincida con el archivo

class Perro extends Animal{
    public void hacerSonido(){
        System.out.println("Puedo ladrar");
    }

}
class Gato extends Animal{
    @Override
    public void hacerSonido() {
        System.out.println("El gato hace miau");
    }
}

class PruebaAnimal{
    public static void main(String[] args) {
        System.out.println("***Ejemplo de polimorfismo");
        Animal animal = new Perro();
        animal.hacerSonido(); // ejecuta puedo ladrar porque por referencia de memoria, apunta a perro.
    }
}