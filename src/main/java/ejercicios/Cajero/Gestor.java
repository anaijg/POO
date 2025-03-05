package ejercicios.Cajero;

public class Gestor {
    public String nombre;
    private int telefono;
    double importeMaximo;

    public Gestor(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = 10000;
    }

    public Gestor(String nombre, int telefono, double importeMaximo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = importeMaximo;
    }

    public int getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Gestor{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", importeMaximo=" + importeMaximo +
                '}';
    }
}
