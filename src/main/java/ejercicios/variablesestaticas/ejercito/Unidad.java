package ejercicios.variablesestaticas.ejercito;

/**
 * a.     Unidad:
 *     i. 	Atributos: nombre, unidades (int, estático).
 *     ii. 	Constructor: recibe un nombre para la unidad que se crea, e incrementa cada vez el número de unidades.
 */
public class Unidad {
   private String nombre;
   static int unidades; // funciona a modo de contador de unidades

    public Unidad(String nombre) {
        this.nombre = nombre;
        unidades++;
    }
}
