package ejerciciosdaniel.hoteles;

import ejerciciosdaniel.banco.Cuenta;

import java.util.Random;

/**
 *Crea una clase denominada Hotel con los atributos idHotel (int), zona(enum), y precio (double). Los valores para la zona podrán ser "playa","montaña" o "rural". El precio supondremos que es un dato en euros que podrá tomar valores entre 40 y 500. El precio por defecto (si al crear un hotel no asignamos un valor o asignamos un valor incorrecto será el punto medio entre 40 y 500).
 * Añade métodos para poder crear un hotel, para imprimir los datos de un hotel y para actualizar el precio de un hotel, controlando que el nuevo precio esté dentro de los valores establecidos.
 */
public class Main {
    public static void main(String[] args) {
        //creamos el random
        Random random = new Random();


        //crear el 1 hotel
        Hotel hotel1 = new Hotel(1,Zona.montaña,13);
        System.out.println(hotel1);
        System.out.println("\t");

        //crear el 2 hotel
        Hotel hotel2 = new Hotel(2, Zona.playa, 150);
        System.out.println(hotel2);
        System.out.println("\t");

        //crear el 3 hotel sin el precio
        Hotel hotel3 = new Hotel(3,Zona.rural);
        System.out.println(hotel3);


    }

    public static void mostrarHotel(Hotel hotel) {
        System.out.println("Cuenta{" +
                "idHotel='" + cuenta.getCodigo() + '\'' +
                ", zona=" + cuenta.getBalance() +
                ", precio=" + cuenta.getPropietario() +
                '}');
    }
}
