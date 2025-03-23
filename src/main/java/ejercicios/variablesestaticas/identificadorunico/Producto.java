package ejercicios.variablesestaticas.identificadorunico;

/**
 * Crea una clase Producto con un atributo de instancia nombre y un atributo estático contadorId que se incremente con cada nuevo producto creado. Cada producto debe tener un identificador único basado en el valor de contadorId.
 */

public class Producto {
    private String nombre;
    public static int contadorId;
    // si tenemos un identificador unico tenemos que ponerlo aqui
    private  int idProducto;

    //constructor


    public Producto(String nombre) {
        this.nombre = nombre;
        //cada vez que se crea un producto se incrementa contadoID
        contadorId++;
        idProducto = contadorId;// asiganmos el valor al id para
    }


}
