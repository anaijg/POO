package ejerciciosdaniel.hoteles;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;

/**
 * Crea una clase denominada Hotel con los atributos idHotel (int), zona(enum), y precio (double). Los valores para la zona podrán ser "playa","montaña" o "rural". El precio supondremos que es un dato en euros que podrá tomar valores entre 40 y 500. El precio por defecto (si al crear un hotel no asignamos un valor o asignamos un valor incorrecto será el punto medio entre 40 y 500).
 * Añade métodos para poder crear un hotel, para imprimir los datos de un hotel y para actualizar el precio de un hotel, controlando que el nuevo precio esté dentro de los valores establecidos.
 */
public class Hotel {
private int idHotel;
private Zona zona;
private double precio;

//random


// constructor

    public Hotel(int idHotel, Zona zona, double precio) {
        this.idHotel = idHotel;
        this.zona = zona;
        if (precio >=40 && precio <=500){
            this.precio = precio;
            System.out.println("precio correcto");
        }else {
            this.precio = random.nextDouble(40,501);
            System.out.println("Precio incorrecto, puesto precio generico entre 40 y 500");

        }

    }


    //constructor sin el precio

    public Hotel(int idHotel, Zona zona) {
        this.idHotel = idHotel;
        this.zona = zona;
        if (precio == 0) {
            this.precio = 270;
            System.out.println("precio puesto por defecto");

        }


    }


    //imprimir los datos del hotel





    @Override

    public String toString() {
        return "Hotel{" +
                "idHotel=" + idHotel +
                ", zona=" + zona +
                ", precio=" + precio +
                '}';
}


    //get y set para poder actualizar el precio

    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }

    Random random = new Random();






}


