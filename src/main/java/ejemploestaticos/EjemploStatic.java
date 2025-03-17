package ejemploestaticos;

import java.util.Scanner;

class EjemploStatic {
    // si quiero que una variable sea visible en toda la clase,
    // la declaramos aquí (dentro de la clase pero no dentro de ningún método)
    static Scanner scanner = new Scanner(System.in); // el scanner estático se puede utilizar en toda esta clase y en cualquier otra dentro del mismo paquete

    /** método main
     *
     * @param args
     */
    public static void main(String[] args) {

        // si creo aquí el scanner, sólo lo puedo utilizar dentro del método main
        //Scanner scanner = new Scanner(System.in);

        // quiero llamar a mi método estático
        metodoEstatico();

        // quiero llamar a mi método de instancia
        EjemploStatic objeto = new EjemploStatic(); // creo un objeto
        objeto.metodoDeInstancia(); // con ese objeto, llamo al método
    }


    /**
     * ejemplo método estático
     */
    public static void metodoEstatico() {
        System.out.println("Introduce un String para el método estático: ");
        String cadena = scanner.nextLine();
        System.out.println("Desde el método estático te digo esto: ");
        System.out.println(cadena);
    }


    /**
     * ejemplo método de instancia
     */
    public void metodoDeInstancia() {
        System.out.println("Y desde el método de instancia te digo: ");
        System.out.println("Para llamarme, crea antes un objeto de esta clase.");
        System.out.println("Y luego escribe nombre el objeto y a continuación un .");
        System.out.println("Ahí estaré. (Salvo que me llames desde otra clase y el método sea private");
    }

}
