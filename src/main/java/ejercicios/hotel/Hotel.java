package ejercicios.hotel;

import java.util.zip.ZipEntry;

public class Hotel {
    private int idHotel;
    private Zona zona;
    private double precio;

    public Hotel(int idHotel,Zona zona, double precio) {
        this.idHotel = idHotel;
        this.precio = precio;
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "idHotel=" + idHotel +
                ", zona=" + zona +
                ", precio=" + precio +
                '}';
    }

    public Hotel(int idHotel, Zona zona) {
        this.idHotel = idHotel;
        this.zona = zona;
    }

    public double getPrecio() {
        return precio;
    }
    public int comprobarPrecio () {
       if (precio >= 40.0 && precio <= 500.0){
           System.out.println("El precio del hotel es: " + comprobarPrecio());
        }
        return comprobarPrecio();
    }
    public void crearHotel(int idHotel,Zona zona, double precio){

    }
}
