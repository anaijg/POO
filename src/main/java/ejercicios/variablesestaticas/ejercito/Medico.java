package ejercicios.variablesestaticas.ejercito;

/**
 * d.     Médico:
 *                                                i. 	Atributos: nombre, médicos (int, estático).
 *                                               ii. 	Constructor: recibe un nombre para el objeto creado e
 */

public class Medico {

    private String nombre;
    static int medico;

    public Medico(String nombre) {
        this.nombre = nombre;
        medico++;
    }
}
