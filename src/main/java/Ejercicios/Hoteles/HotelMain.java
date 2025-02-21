package Ejercicios.Hoteles;

import java.util.Scanner;

public class HotelMain {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {



    Hotel hotel_Royal = new Hotel(1, Zona.Playa, 21 );

        System.out.println(hotel_Royal);



    }

    public double cambioPrecio (double nuevoPrecio ) {
        System.out.println("Introduce el precio del Hotel entre 40€ y 500€");
        nuevoPrecio = sc.nextDouble();
        if (!(nuevoPrecio > 39 && nuevoPrecio < 501)) {
            nuevoPrecio = 270;
        }
        return nuevoPrecio;
    }


}
