package clasesyobjetos.ejercicios.ejercitovariablesestaticas;

public class Unidad {
    private String nombre;
    private static int unidades;

    // constructor

    public Unidad(String nombre) {
        this.nombre = nombre;
        unidades++;
    }
}
