package aritmetica.prueba;

import persona.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("Creacion de objetos de la clase persona");
        Persona objeto1 = new Persona("Esteban", "Necuse");
        objeto1.mostrarPersona();

        objeto1.setNombre("Carlos");
        objeto1.setApellido("Giro");

        Persona objeto2 = new Persona();
        objeto2.setNombre("Juan");
        objeto2.setApellido("Perez");
        objeto2.mostrarPersona();
    }
}
