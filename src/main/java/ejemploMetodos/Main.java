package ejemploMetodos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // creamos un propietario
        Propietario ana = new Propietario("Ana", "Álvarez", "Ares", Licencia.B, LocalDate.of(1978, 10, 10));

        // creamos un coche
        Vehiculo coche1 = new Vehiculo("5454-BXZ" ,Combustible.HIBRIDO, 4, 136, true, Color.AZUL, ana);
        System.out.println(coche1);

        // 1) Crear un método estático que cree un coche, pasándole los parámetros y lo devuelva.
        // como es un método estático y está en esta misma clase, para llamarlo basta con escribir su nombre
        Vehiculo coche2 = crearVehiculo("1234-CCC", Combustible.ELECTRICO, 4, 120, true, Color.ROJO, ana);
        System.out.println(coche2);

        // 2) Crear un método estático que cree un propietario, pasándole los parámetros necesarios, y lo devuelva. Este nuevo propietario nos servirá para crear el siguiente coche.

        // 3) Crea una flota de vehículos


        // 4) Añade los tres vehículos a esta flota

        // 5) Crea un nuevo propietario

        // 6) Cambia el propietario de alguno de los coches de la flota.

        // 7) Elimina uno de los coches de la flota




    }

    /**
     *  Método que crea un vehículo pasándole como parámetros:
     * @param combustible
     * @param ruedas
     * @param potencia
     * @param automatico
     * @param color
     * @param propietario
     * @return el vehículo creado
     */
    public static Vehiculo crearVehiculo(String matricula, Combustible combustible, int ruedas, int potencia, boolean automatico, Color color, Propietario propietario) {
        return new Vehiculo(matricula, combustible, ruedas, potencia, automatico, color, propietario);
    }

    // método estático para crear un propietario (y lo devuelve)


}
