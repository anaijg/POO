package ejercicios.variablesestaticas.ejercito;

/**
 * b.     Caballero:
 *                                                i. 	Atributos: nombre, caballeros (int, estático)
 *                                               ii. 	Constructor: recibe un nombre para el objeto creado e incrementa cada vez el número de caballeros.
 */

public class Caballero {

    private String nombre;
    static int caballeros;

    public Caballero(String nombre) {
        this.nombre = nombre;
        caballeros++;
    }
}
