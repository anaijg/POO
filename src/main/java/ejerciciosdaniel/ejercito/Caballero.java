package ejerciciosdaniel.ejercito;

public class Caballero {
    private String nombre;
    static int caballeros;

    public Caballero(String nombre) {
        this.nombre = nombre;
        caballeros++;
    }
}
