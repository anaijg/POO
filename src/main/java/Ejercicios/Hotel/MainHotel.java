package Ejercicios.Hotel;

public class MainHotel {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel(234, 670, Zonas.PLAYA);
        Hotel hotel2 = new Hotel(74, 345.95, Zonas.MONTAÑA);
        Hotel hotel3 = new Hotel(24, 70, Zonas.RURAL);

        hotel3.cambiarPrecio(840);
        hotel1.cambiarPrecio(397);

        System.out.println(hotel1);
        System.out.println(hotel2);
        System.out.println(hotel3);
    }
}
