package clasesyobjetos.ejercicios.cajero;

public class Gestor {
    // Diseñar la clase Gestor de la que interesa guardar su nombre, teléfono y el importe máximo autorizado con el que pueden operar.
    // El nombre será público
    public String nombre;
    private String telefono;
    // el importe máximo sólo será visible por clases que estén en el mismo paquete.
    double importeMaximoAutorizado;

    // Un gestor tendrá siempre un nombre y un teléfono. -> obligamos a esto en el constructor
    public Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        // Si no se asigna, el importe máximo autorizado por operación será de 10000 euros. → el valor por defecto será 10000
        this.importeMaximoAutorizado = 10000;
    }
    // Un gestor, una vez asignado, no podrá cambiar su número de teléfono. Y todo el mundo podrá consultarlo. → me pide un getTelefono pero prohibido el setTeléfono
    public String getTelefono() {
        return telefono;
    }


}
