package ejercicios.hotel;

public class Main {
    public static void main(String[] args) {
        // aqui creamos objetos de tipo hotel para probar los constructores
        // primer constructor : no la pasamos el precio.

        Hotel hotel1 = new Hotel(1, Zona.MONTAÑA );
        System.out.println(hotel1);
        System.out.println();

        //segundo constructor: le pasamos el precio
        Hotel hotel2 = new Hotel(2,Zona.RURAL, 44.8);
        System.out.println(hotel2);
        System.out.println();


        // prebamos el metodo setPrecio
        hotel1.setPrecio(200);
        System.out.println(hotel1);
        System.out.println();
        hotel2.setPrecio(1000);
        System.out.println(hotel2);
        System.out.println();

    }

}
