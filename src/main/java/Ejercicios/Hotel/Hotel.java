package Ejercicios.Hotel;

/**
 * Crea una clase denominada Hotel con los atributos idHotel (int), zona(enum), y precio (double).
 * Los valores para la zona podrán ser "playa","montaña" o "rural".
 * El precio supondremos que es un dato en euros que podrá tomar valores entre 40 y 500.
 */

/**
 * Añade métodos para poder crear un hotel, para imprimir los datos de un hotel y
 * para actualizar el precio de un hotel,
 * controlando que el nuevo precio esté dentro de los valores establecidos.
 */
public class Hotel {
    private int idHotel;
    private double precio;
    private Zonas zonas;

    public Hotel(int idHotel, double precio, Zonas zonas) {
        this.idHotel = idHotel;
        this.precio = validarPrecio(precio);
        this.zonas = zonas;
    }
        private double validarPrecio(double precio) {
            if (precio < 40 || precio > 500) {
                return 270;
            }
            return precio;
        }


    @Override public String toString() {
        return "Hotel{" + "idHotel=" + idHotel + ", precio=" + precio + "€, zonas=" + zonas + '}';
    }

    public int getIdHotel() {
        return idHotel;
    }
    public Zonas getZonas() {
        return zonas;
    }
    public double getPrecio() {
        return precio;
    }

    public void cambiarPrecio(double nuevoPrecio) {
        if (nuevoPrecio < 40 || nuevoPrecio > 500) {
            nuevoPrecio = 270;
        }
        this.precio = nuevoPrecio;
        System.out.println("El precio nuevo del hotel " + idHotel + " es " + nuevoPrecio + "€");

    }

    public void nuevoHotel(String nuevoHotel) {}


}

