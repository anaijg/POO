package clasesyobjetos.ejercicios.cajero;

public class Gestor {

    //propiedades
    public String nombre;
    private String telefono;

    // el importe maximo sólo será visible por clases que estén en el mismo paquete
    double importeMaximo;



    public Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        //Si no se asigna, el importe máximo autorizado por operación será de 10000 euros. → el valor por defecto será 10000

        this.importeMaximo = 10000;

    }

    //Un gestor, una vez asignado, no podrá cambiar su número de teléfono. Y todo el mundo podrá consultarlo. → me pide un getTelefono pero prohibido el setTeléfono


    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Gestor{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", importeMaximo=" + importeMaximo +
                '}';
    }
}
