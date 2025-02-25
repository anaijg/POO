package Ejercicios.Hoteles;

import java.util.Scanner;

public class HotelMain {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        // no le pasamos precio para probar el que viene de base
    Hotel hotel_Royal = new Hotel(1, Zona.Playa );

        System.out.println(hotel_Royal);


            Hotel hotel2 = new Hotel(2, Zona.Montania, 44.8);
        System.out.println("\n" + hotel2);


        hotel_Royal.setPrecio(200);
        System.out.println("\n\n" + hotel_Royal);
        System.out.println();
        hotel_Royal.setPrecio(1000);
        System.out.println(hotel_Royal);
        System.out.println();
    }





}
