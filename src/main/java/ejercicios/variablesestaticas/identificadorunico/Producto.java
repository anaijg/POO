package ejercicios.variablesestaticas.identificadorunico;

/**
 * Crea una clase Producto con un atributo de instancia nombre y un atributo estático contadorId que se incremente con cada nuevo producto creado. Cada producto debe tener un identificador único basado en el valor de contadorId.
 */

public class Producto {
    private String nombre;
    public static int contadorID;

    // si tenemos un identificador único tenemos que ponerlo aquí y
    private int idProducto;

    public int getIdProducto() {
        return idProducto;
    }



    public Producto(String nombre) {
        this.nombre = nombre;
        // cada vez que se crea un producto se incrementa contadorID
        contadorID++; // esta es común para todos los objetos, no puede valer como identificador de un objeto
        idProducto = contadorID; // asignamos el valor al id para este objeto

    }
}
