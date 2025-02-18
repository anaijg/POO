package ejemplometodos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //creo un objeto de propietario
        Propietario pablo = new Propietario("Pablo", "Carrillo", "Punina", Licencia.B, LocalDate.of(1990, 03, 24));
        //creamos un coche
        Vehiculo coche1 = new Vehiculo("5454-BXZ", Combustible.DIESEL, 4, 130, false, Color.NEGRO, pablo);
        System.out.println(coche1);


        // pero para eso debemos:
        //1) crear un método estatico que cree un coche, pasandole los parametros y lo devuelva.
        //como es un metodo estatico y está en esta misma clase, para llamarlo basta con escribir su nombre
        Vehiculo coche2 = crearVehiculo("1234-CCC", Combustible.DIESEL, 4, 120, true, Color.ROJO, pablo);
        System.out.println(coche2);

        //2) Crear un método estático que cree un propietario, pasándole los parametros
        //necesarios, y los devuelva, Este nuevo propietario nos servirá para crear el siguiente

        // 3) Crea una flota de vehículos

        // 4) Añade los tres vehículos a esta flota

        // 5)crea un nuevo propietario
        Propietario luci = new Propietario("Lucifer", "Fernandez", "Flores", Licencia.B, LocalDate.of(1956, 8, 2));
        System.out.println("\n\nDatos del propietario luci: ");
        System.out.println(luci);
        // 6) cambia el propietario de alguno de los chcohes de la flota
        // aqui es donde probamos el método transferirPropiedad
        System.out.println("\n\n transferimos el coche1 de ana a luci");
        System.out.println(luci);
        System.out.println(coche1);


        // 7) Elimina uno de los vehiculos de la flota.

        // 8) comprueba si los coches que tenemos hasta ahora son de alta potencia.
        System.out.println("\n\nComprobamos si coche1 y coche2 son de alta potencia");
        if (coche1.esDeAltaPotencia()){
            System.out.println("coche1 es de alta potencia");
        }
        if (coche2.esDeAltaPotencia()){
            System.out.println("coche2 es de alta potencia");
        }
        System.out.println(coche1);

        //9 cmabiamos el color del coche2
        System.out.println("\n\n cambiamos el color del coche2");
        coche2.cambiarColor(Color.PLATEADO);

        // 10 ) probamos el método esElectrico()
        System.out.println("\n\n probamos si esElectrico()");
        System.out.println("coche 1 es eléctrico : " + coche1.esEletrico());
        System.out.println("coche 2 es eléctrico: " + coche2.esEletrico());


    }


    /**
     * Método que crea un vehiculo pasándole todos los parametros
     *
     * @param combustible
     * @param ruedas
     * @param potencia
     * @param automatico
     * @param color
     * @param propietario
     * @return el vehiculo creado
     */
    public static Vehiculo crearVehiculo(String matriucula, Combustible combustible, int ruedas, int potencia, boolean automatico, Color color, Propietario propietario) {
        return new Vehiculo(matriucula, combustible, ruedas, potencia, automatico, color, propietario);


    }

    /**
     *
     */

    //método statico para crear un propietario
    public static Propietario crearPropietario(String nombre, String apellido, String apellido2, Licencia licencia, LocalDate fechaNacimiento) {

        return new Propietario(nombre, apellido, apellido2, licencia, fechaNacimiento);
    }
}
