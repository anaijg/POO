package clasesyobjetos.ejemploestaticos;

import java.util.Scanner;

public class EjemploStatic {
    //si quiero que una variable sea visible en toda la clase,
    //la declaramos aquí ( dentro de la clase pero no dentro de ningún método).
     static Scanner sc = new Scanner(System.in);// el scanner statico se puede utilizar en toda la clase y en cualquier otra dentro del mismo paquete.


    /**
     * método main
     *
     * @param args
     */
    public static void main(String[] args) {
        //si declaro aqui en el scnner, sólo lo puedo utilizar dentro del método main
        //Scanner sc = new Scanner(System.in);

        // quiero llamar al metodo estático
        metodoEstatico();

        // quiero llamar a mi metodo de instancia
        EjemploStatic ejemploStatic = new EjemploStatic(); // creo objetos
        ejemploStatic.metodoDeInstancia();// con ese objeto llamo al método.
    }

    /**
     * ejemplo de metodo estatico
     */
    public static void metodoEstatico() {
        System.out.println("Introduce un String para el método estático: ");
        String cadena = sc.nextLine();
        System.out.println("Desde el método estatico de digo esto. ");
        System.out.println(cadena);
    }

    /**
     * ejemplo de método de instancia
     */


    public void metodoDeInstancia() {
        System.out.println("Y desde el metodo de instancia te digo: ");
        System.out.println("Para llamarme, crea antes un objeto de esta clase.");
        System.out.println("Y luego escribo el nombre del  objeto y a continuacion un . ");
        System.out.println("Ahí estaré (salvo que me llamen desde otra clase)");
    }
}
