package ejerciciosdaniel.ejercito;

public class Unidad {
    private String nombre;
    static int unidades;

    public Unidad(String nombre) {
        this.nombre = nombre;
        unidades++;
    }
}
