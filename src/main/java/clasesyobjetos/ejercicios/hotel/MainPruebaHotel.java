package clasesyobjetos.ejercicios.hotel;

/**
 * en esta clase vamos a probar los métodos que hay en la clase Hotel
 */
public class MainPruebaHotel {
    public static void main(String[] args) {
        // aquí creamos objetos de tipo Hotel para probar los constructores
        // primer constructor: no le pasamos un precio
        Hotel hotel1 = new Hotel(1, Zona.MONTAÑA);
        System.out.println(hotel1);

        // segundo constructor: le pasamos los tres atributos como argumento
        Hotel hotel2 = new Hotel(2, Zona.RURAL, 44.8);
        System.out.println();
        System.out.println(hotel2);

        // probamos el método setPrecio
        hotel1.setPrecio(200);
        System.out.println(hotel1);
        System.out.println();
        hotel2.setPrecio(1000);
        System.out.println(hotel2);
    }
}
