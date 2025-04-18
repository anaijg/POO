package clasesyobjetos.ejercicios.variablesestaticas.ejercito;

/**
 * c.      General:
 *                                                i. 	Atributos: nombre, generales (int, estático).
 *                                               ii. 	Constructor: recibe un nombre para el objeto creado e incrementa cada vez el número de generales.V
 */

public class General {
    private String nombre;
    static int generales;

    public General(String nombre) {
        this.nombre = nombre;
        generales++;
    }
}
