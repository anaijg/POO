package clasesyobjetos.ejercicios.variablesestaticas.contadordeinstancias;

/**
 * Crea una clase Persona que tenga un atributo de instancia nombre y un atributo estático contadorPersonas, que almacene cuántas instancias de la clase se han creado. Cada vez que se cree un objeto de la clase Persona, el contador debe aumentar en 1.
 */

public class Persona {
    private String nombre;
    private static int contadorPersona;//almacena el numero de objetos que se crean de esta clase


    public Persona(String nombre) {
        this.nombre = nombre;
        contadorPersona++;// cada vez que se crea un objeto se incrementa el contador de objetos
    }

    //metodos get

    public String getNombre() {
        return nombre;
    }

    public static int getContadorPersona() {
        return contadorPersona;
    }

    //metodo toString

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
