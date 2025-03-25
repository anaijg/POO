package ejerciciosdaniel.ejercito;

public class General {
    private String nombre;
    static int generales;

    public General(String nombre) {
        this.nombre = nombre;
        generales++;
    }
}
