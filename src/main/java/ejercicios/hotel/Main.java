package ejercicios.hotel;

public class Main {
    static Hotel hotel;

    public static void main(String[] args) {
        hotel = new Hotel(Hotel.idHotelInicial(),Hotel.elegirZona(), Hotel.precioInicial());
        System.out.println(hotel);
        hotel.cambiarPrecio();
        System.out.println("Precio cambiado: " + hotel);
    }
}
