package ejercicios.superheroespracticar;

public class Superheroe {

    //atributos
    private String nombre;
    private String descripcion;
    private boolean capa;

    //constructor que recibe solo el nombre


    public Superheroe(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
        this.capa = false;
    }

    //Programe los get y set para cada propiedad de la clase.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    //Programe el método toString de forma que devuelva una cadena con
    //todas sus propiedades

    @Override
    public String toString() {
        return "Superheroe{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", capa=" + capa +
                '}';
    }

}
