package ejemplometodos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //creo un objeto de propietario
        Propietario pablo = new Propietario("Pablo", "Carrillo", "Punina", Licencia.B, LocalDate.of(1990, 03, 24));
        //creamos un coche
        Vehiculo coche1 = new Vehiculo("2345-455", Combustible.DIESEL, 4, 130, false, Color.NEGRO, pablo);
        System.out.println(coche1);

        // pero para eso debemos:
        //1) crear un método estatico que cree un coche, pasandole los parametros y lo devuelva.
        //como es un metodo estatico y está en esta misma clase, para llamarlo basta con escribir su nombre
        Vehiculo coche2 = crearVehiculo("ooj.645", Combustible.DIESEL, 4, 120, true, Color.ROJO, pablo);
        System.out.println(coche2);

        //2) Crear un método estático que cree un propietario, pasándole los parametros
        //necesarios, y los devuelva, Este nuevo propietario nos servirá para crear el siguiente

        // 3) Crea una flota de vehículos

        // 4) Añade los tres vehículos a esta flota

        // %) crea un nuevo propietario

        // 6) cambia el propietario de alguno de los chcohes de la flota

        // 7) Elimina uno de los vehiculos de la flota.


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
