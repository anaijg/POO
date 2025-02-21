package ejercicios.hotel;

import java.util.Scanner;

//Crea una clase denominada Hotel con los atributos idHotel (int), zona(enum), y precio (double).
// Los valores para la zona podrán ser "playa","montaña" o "rural". El precio supondremos que es un dato en euros que
// podrá tomar valores entre 40 y 500.
//Añade métodos para poder crear un hotel, para imprimir los datos de un hotel y para actualizar el precio de un hotel,
// controlando que el nuevo precio esté dentro de los valores establecidos.
public class Hotel {
    private int idHotel;
    private Zona zona;
    private int precio;
    static Scanner sc = new Scanner(System.in);

    public Hotel(int idHotel, Zona zona, int precio) {
        this.idHotel = idHotel;
        this.zona = zona;
        if (precio >= 40 && precio <= 500){
            this.precio = precio;
        }
    }

    static public int idHotelInicial(){
        System.out.println("Introduce la id del hotel: ");
        return sc.nextInt();
    }

    static public Zona elegirZona(){
        System.out.println("Elige la zona del hotel:");
        System.out.println("1.PLAYA\n2.MONTAÑA\n3.RURAL");
        int zonaNum = sc.nextInt();
        switch (zonaNum){
            case 1 -> {
                return Zona.PLAYA;
            }
            case 2 ->{
                return Zona.MONTANIA;
            }
            case 3-> {
                return Zona.RURAL;
            }
            default -> {
                final String s = "No una opción válida";
            }

        }
        return Zona.PLAYA;
    }

    static public int precioInicial(){
        int precioInicial;
        do {
            System.out.println("Elija el nuevo precio del hotel (Aseguresé de que está entre 40 y 500)");
            precioInicial = sc.nextInt();
        } while(precioInicial < 40 || precioInicial > 500);
        return precioInicial;
    }

    public void cambiarPrecio(){
        int nuevoPrecio;
        do {
            System.out.println("Elija el nuevo precio del hotel (Aseguresé de que está entre 40 y 500)");
            nuevoPrecio = sc.nextInt();
            if(nuevoPrecio < 40 || nuevoPrecio > 500){
                System.out.println("Nuevo precio inváido.");
            }
        }while(nuevoPrecio < 40 || nuevoPrecio > 500);
        this.precio = nuevoPrecio;
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
