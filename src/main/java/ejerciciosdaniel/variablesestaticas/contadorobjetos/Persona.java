package ejerciciosdaniel.variablesestaticas.contadorobjetos;

/**
 * Crea una clase Persona que tenga un atributo de instancia nombre y un atributo estático contadorPersonas, que almacene cuántas instancias de la clase se han creado. Cada vez que se cree un objeto de la clase Persona, el contador debe aumentar en 1.
 */

public class Persona {
    String nombre;
    public static int contadorPersonas = 0;


    public Persona(String nombre) {
        this.nombre = nombre;
        contadorPersonas++;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\''
                +"totalPersonas='" + contadorPersonas + '\'' +
                '}';
    }


}
class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Daniel");
        System.out.println("Aqui debe de dar 1 ya que solo he hecho un objeto persona");
        System.out.println(persona1);
        System.out.println("Aqui debe de dar 10 por que he hecho que contador valga 10");
        Persona.contadorPersonas = 10;
        System.out.println(persona1);
        Persona persona2 = new Persona("Alejandro");
        System.out.println(persona2);
        Persona persona3 = new Persona("Juan");
        System.out.println(persona3);
        Persona persona4 = new Persona("Ana");
        System.out.println(persona4);

    }

}
