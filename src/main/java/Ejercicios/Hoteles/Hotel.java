package Ejercicios.Hoteles;

import java.util.Scanner;



public class Hotel {
    public static Scanner sc = new Scanner(System.in);
    private int idHotel;
    private Zona zona;
    private double precio;


    //constructor

    public Hotel(int idHotel, Zona zona) {
        this.idHotel = idHotel;
        this.zona = zona;
        this.precio = (40.0 + 500.0) / 2.0;
    }

    public Hotel(int idHotel, Zona zona, double precio) {
        this.idHotel = idHotel;
        this.zona = zona;
        if (precio >= 40 && precio <= 500) {
            this.precio = precio;
        } else {
            this.precio = 270;
        }
    }


    @Override
    public String toString() {
        String caracteristicasObjetoHotel = "ID del Hotel: " + idHotel + "\n Zona en la que esta: ";

        switch (this.zona) {
            case Playa -> caracteristicasObjetoHotel += "En la playa";
            case Rural -> caracteristicasObjetoHotel += "En el campo";
            case Montania -> caracteristicasObjetoHotel += "En la montaña";
        }

        caracteristicasObjetoHotel += "\nPrecio por noche: " + this.precio ;


        return caracteristicasObjetoHotel;
    }

    //actualizacion precio hotel (actualizar = setter o metodo setPrecio)

    public void setPrecio (double precio) {
        if (precio >= 40 && precio <= 500) {
            this.precio = precio;
            System.out.println("El nuevo precio de la habitacion es: " + this.precio + "€");
        } else {
            System.out.println("El precio introducido no es valido");
        }
    }


}




