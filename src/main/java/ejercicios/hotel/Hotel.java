package ejercicios.hotel;

/**
 * Crea una clase denominada Hotel con los atributos idHotel (int), zona(enum), y precio (double). Los valores para la zona podrán ser "playa","montaña" o "rural". El precio supondremos que es un dato en euros que podrá tomar valores entre 40 y 500. El precio por defecto (si al crear un hotel no asignamos un valor o asignamos un valor incorrecto será el punto medio entre 40 y 500).
 * Añade métodos para poder crear un hotel, para imprimir los datos de un hotel y para actualizar el precio de un hotel, controlando que el nuevo precio esté dentro de los valores establecidos.
 */
public class Hotel {
    private int idHotel; // this.idHotel
    private Zona zona;  // this.zona
    private double precio; // this.precio

    // para crear un hotel = new Hotel() (es decir llamamos al constructor de Hotel
    // si al crear un hotel no asignamos un valor o asignamos un valor incorrecto será el punto medio entre 40 y 500


    // si al crear un hotel no asignamos un valor --> constructor sin precio
    public Hotel(int idHotel, Zona zona) {
        this.idHotel = idHotel;
        this.zona = zona;
        // como no asignamos un precio en el constructor, será la media entre 40 y 500
        this.precio = (40.0 + 500.0) / 2.0; // o sea, 270
    }

    // también se deduce que habrá un constructor con precio (además de los otros dos)
    // ...o asignamos un valor incorrecto
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
        // otra forma de hacer el toString, más personalizada
        String caracteristicasObjetoHotel = "ID del Hotel: " + idHotel + "\n Está ";

        switch (this.zona) {
            case PLAYA -> caracteristicasObjetoHotel += " en la playa";
            case RURAL -> caracteristicasObjetoHotel += " en el campo";
            case MONTAÑA -> caracteristicasObjetoHotel += " en la montaña";
        }

        caracteristicasObjetoHotel += "\nPrecio por noche: " + this.precio + "€";

        return caracteristicasObjetoHotel;
    }

    //actualizar el precio de un hotel, controlando que el nuevo precio esté dentro de los valores establecidos. = meter un setter o método setPrecio
    public void setPrecio(double precio) {
        if (precio >= 40 && precio <= 500) {
            this.precio = precio;
            System.out.println("El nuevo precio de la habitación es " + this.precio + "€");
        } else {
            System.out.println("El precio introducido no es correcto. Se queda como está.");
        }

    }


}
