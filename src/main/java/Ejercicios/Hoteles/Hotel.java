package Ejercicios.Hoteles;

import java.util.Scanner;



public class Hotel {
    public static Scanner sc = new Scanner(System.in);
    private int idHotel;
    private Zona zona;
    private double precio;


    //constructor

    public Hotel(int idHotel, Zona zona, double precio) {
        this.idHotel = idHotel;
        this.zona = zona;
        this.precio = precio;
    }

    //setter y getter

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
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


}




