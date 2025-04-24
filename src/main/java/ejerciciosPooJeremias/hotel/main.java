package ejerciciosPooJeremias.hotel;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //Primero el constructor sin precio
        Hotel hotel1 = new Hotel(1, Zona.MONTAÑA);
        //Ahora el constructor full
        Hotel hotel2 = new Hotel(2,Zona.PLAYA,85.0);

        //Metodo para mostrar los datos del hotel
        System.out.println(hotel1.mostrarHotel() + "\n" + hotel2.mostrarHotel());

        //Actualizar el precio del hotel
        hotel1.actualizarPrecio(60);
        hotel2.actualizarPrecio(300);
        System.out.println(hotel1.mostrarHotel() + "\n" + hotel2.mostrarHotel());
    }
}
