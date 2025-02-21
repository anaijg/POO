package ejercicios.hotel;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        Hotel Palas = new Hotel(123, Zona.PLAYA,50.0);
        Hotel Palas1 = new Hotel(1234,Zona.MONTAÑA, 100.0);
        Hotel Palas2 = new Hotel(12345,Zona.RURAL, 300.0);

        System.out.println(Palas);
        System.out.println(Palas1);
        System.out.println(Palas2);
    }
}