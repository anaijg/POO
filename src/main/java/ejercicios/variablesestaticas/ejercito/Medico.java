package ejercicios.variablesestaticas.ejercito;

/**
 * d.     Médico:
 * i. 	Atributos: nombre, médicos (int, estático).
 * ii. 	Constructor: recibe un nombre para el objeto creado e incrementa cada vez el número de médicos.
 */
public class Medico {
    private String nombre;
    static int medicos;

    public Medico(String nombre) {
        this.nombre = nombre;
        medicos++;
    }
}
