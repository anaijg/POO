package ejerciciosPooJeremias.hotel;

public class Hotel {
    /*Crea una clase denominada Hotel con los atributos idHotel (int), zona(enum), y precio (double).

    Los valores para la zona podrán ser "playa","montaña" o "rural".

    El precio supondremos que es un dato en euros que podrá tomar valores entre 40 y 500.

    El precio por defecto (si al crear un hotel no asignamos un valor o asignamos un valor incorrecto
    será el punto medio entre 40 y 500).

    Añade métodos:
    para poder crear un hotel, para imprimir los datos de un hotel, para
    actualizar el precio de un hotel controlando que el nuevo precio esté dentro
    de los valores establecidos.*/

    private int idHotel;
    private Zona zona;
    private double precio;

    //Constructor sin precio (establece el precio medio)
    public Hotel(int idHotel, Zona zona){
        this.idHotel = idHotel;
        this.zona = zona;
        this.precio = (40.0+500.0)/2.0;
    }

    //Constructor con precio (y establece si el precio esta dentro del rango o no)
    public Hotel(int idHotel, Zona zona, double precio){
        this.idHotel = idHotel;
        this.zona = zona;
        if (precio>=40 && precio<=500){
            this.precio = precio;
        }else{
            this.precio = (40.0+500.0)/2.0;
        }
    }

    public String mostrarHotel(){ //Getter datos del hotel
        return "El id del hotel es: " + this.idHotel + " ubicacion: " + this.zona + " el precio por noche es: " + this.precio +"€";
    }

    public void actualizarPrecio(double precio){
        if (precio>=40 && precio<=500){
            this.precio = precio;
            System.out.println("El nuevo precio de la habitacion es " + this.precio + "€");
        }else{
            System.out.println("El precio introducido no esta dentro del rango permitido. Se queda como estaba");
        }
    }
}
