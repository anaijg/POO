package ejerciciosdaniel.hotel;

/**
 * Crea una clase denominada Hotel con los atributos idHotel (int), zona(enum), y precio (double). Los valores para la zona podrán ser "playa","montaña" o "rural". El precio supondremos que es un dato en euros que podrá tomar valores entre 40 y 500. El precio por defecto (si al crear un hotel no asignamos un valor o asignamos un valor incorrecto será el punto medio entre 40 y 500).
 * Añade métodos para poder crear un hotel, para imprimir los datos de un hotel y para actualizar el precio de un hotel, controlando que el nuevo precio esté dentro de los valores establecidos.
 */
public class Hotel {
    private int idHotel;
    private Zona zona;
    private double precio;


    //constructor sin precio asignado por usuario
    public Hotel(int idHotel, Zona zona) {
        this.idHotel = idHotel;
        this.zona = zona;
        this.precio = (40.0 + 500.0) / 2.0;
    }


    //constrctor con precio asignado por usuario
    public Hotel(int idHotel, Zona zona, double precio) {
        this.idHotel = idHotel;
        this.zona = zona;
        // aquí tenemos que comprobar si el precio es correcto (entre 40 y 500)
        if (precio >= 40 && precio <= 500) { // precio correcto
            this.precio = precio;
        } else { // precio incorrecto
            this.precio = 270;
        }
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "idHotel=" + idHotel +
                ", zona=" + zona +
                ", precio=" + precio +
                '}';
    }


    public void setPrecio(double precio) {
        if (precio >= 40 && precio <= 500) {
            this.precio = precio;
            System.out.println("El nuevo precio de la habitación es " + this.precio + "€");
        } else {
            System.out.println("El precio introducido no es correcto. Se queda como está.");
        }
    }
}


