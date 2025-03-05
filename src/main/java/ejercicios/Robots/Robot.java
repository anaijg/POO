package ejercicios.Robots;

public class Robot {
    private String nombre;
    private String modelo;
    private int duracion;

    public Robot() {
        this.nombre = "Anónimo";
        this.modelo = "Desconocido";
    }

    public Robot(String nombre, String modelo, int duracion) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.duracion = duracion;
    }

    public Robot(String nombre, String modelo) {
        this(nombre, modelo, 20);
        this.nombre = nombre;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
