package clasesyobjetos.ejercicios.variablesestaticas.contadorobjetos;

/**
 * Crea una clase Persona que tenga un atributo de instancia nombre y un atributo estático contadorPersonas, que almacene cuántas instancias de la clase se han creado. Cada vez que se cree un objeto de la clase Persona, el contador debe aumentar en 1.
 */

public class Persona {
    private String nombre;
    public static int contadorPersonas; // almacena el número de objetos que se crean de esta clase
    public int contadorFull;

    public Persona(String nombre) {
        this.nombre = nombre;
        contadorPersonas++; // cada vez que se crea un objeto se incrementa el contador de objetos
        contadorFull++;
    }
}
