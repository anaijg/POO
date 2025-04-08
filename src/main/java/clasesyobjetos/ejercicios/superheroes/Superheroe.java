package clasesyobjetos.ejercicios.superheroes;

/**
 * Esta clase definirá las características de un superhéroe.
 */
public class Superheroe {
    // Propiedades
    //Sus propiedades serán:
    // Nombre (nombre del superhéroe)
    private String nombre;

    // Descripción (cadena para describir brevemente su aspecto)
    private String descripcion;

    // Capa (booleano que indica si el superhéroe lleva o no capa)
    private boolean capa;

    // Constructores
    //Haga un constructor con parámetros que reciba solo el nombre del
    //superhéroe. La descripción se inicializará a vacío (cadena vacía) y la capa
    //se inicializará al valor false (sin capa)

    public Superheroe(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
        this.capa = false;
    }

    // Métodos get y set
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

    @Override
    public String toString() {
        return "Superheroe{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", capa=" + capa +
                '}';
    }


}
