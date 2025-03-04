package ejerciciosdaniel.hotel;



/**
 * Crea una clase denominada Hotel con los atributos idHotel (int), zona(enum), y precio (double). Los valores para la zona podrán ser "playa","montaña" o "rural". El precio supondremos que es un dato en euros que podrá tomar valores entre 40 y 500. El precio por defecto (si al crear un hotel no asignamos un valor o asignamos un valor incorrecto será el punto medio entre 40 y 500).
 * Añade métodos para poder crear un hotel, para imprimir los datos de un hotel y para actualizar el precio de un hotel, controlando que el nuevo precio esté dentro de los valores establecidos.
 */
public class Main {
    public static void main(String[] args) {

        Hotel hotel1 = new Hotel(1,Zona.montaña);
        System.out.println(hotel1);


        Hotel hotel2 = new Hotel(2, Zona.rural, 44.8);
        System.out.println();
        System.out.println(hotel2);

        hotel1.setPrecio(200);
        System.out.println(hotel1);
        System.out.println();
        hotel2.setPrecio(1000);
        System.out.println(hotel2);





    }
}
