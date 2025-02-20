package ejemplometodosdaniel;

import ejemplometodos.Color;
import ejemplometodos.Combustible;
import ejemplometodos.Licencia;
import ejemplometodos.Propietario;
import ejemplometodos.Vehiculo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // creamos un propietario
        ejemplometodos.Propietario ana = new ejemplometodos.Propietario("Ana", "Álvarez", "Ares", ejemplometodos.Licencia.B, LocalDate.of(1978, 10, 10));

        // creamos un coche
        System.out.println("Datos de coche1:");
        ejemplometodos.Vehiculo coche1 = new ejemplometodos.Vehiculo("5454-BXZ" , ejemplometodos.Combustible.HIBRIDO, 4, 136, true, ejemplometodos.Color.AZUL, ana);
        System.out.println(coche1);


        // 1) Crear un método estático que cree un coche, pasándole los parámetros y lo devuelva.
        // como es un método estático y está en esta misma clase, para llamarlo basta con escribir su nombre
        System.out.println("\n\nDatos de coche2: ");
        ejemplometodos.Vehiculo coche2 = crearVehiculo("1234-CCC", ejemplometodos.Combustible.ELECTRICO, 4, 150, true, ejemplometodos.Color.ROJO, ana);
        System.out.println(coche2);

        // 2) Crear un método estático que cree un propietario, pasándole los parámetros necesarios, y lo devuelva. Este nuevo propietario nos servirá para crear el siguiente coche.

        // 3) Crea una flota de vehículos


        // 4) Añade los tres vehículos a esta flota

        // 5) Crea un nuevo propietario
        ejemplometodos.Propietario luci = new ejemplometodos.Propietario("Lucifer", "Fernández", "Flórez", Licencia.B, LocalDate.of(1549, 8, 24));
        System.out.println("\n\nDatos del propietario luci: ");
        System.out.println(luci);
        // 6) Cambia el propietario de alguno de los coches de la flota.
        // aquí es donde probamos el método transferirPropiedad
        System.out.println("\n\nTransferimos el coche1 de ana a luci:");
        coche1.transferirPropiedad(luci);
        System.out.println(coche1);

        // 7) Elimina uno de los coches de la flota


        // 8) Comprueba si los coches que tenemos hasta ahora son de alta potencia.
        System.out.println("\n\nComprobamos si coche1 y coche2 son de alta potencia: ");
        if (coche1.esDeAltaPotencia()) {
            System.out.println("coche1 es de alta potencia");
        }
        if (coche2.esDeAltaPotencia()) {
            System.out.println("coche2 es de alta potencia");
        }

        // 9) Cambiamos el color del coche 2
        System.out.println("\n\nCambiamos el color del coche2");
        coche2.cambiarColor(ejemplometodos.Color.PLATEADO);

        // 10) Probamos el método esElectrico()
        System.out.println("\n\nProbamos esElectrico(): ");
        System.out.println("coche 1 es eléctrico: " + coche1.esElectrico());
        System.out.println("coche 2 es eléctrico: " + coche2.esElectrico());

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
    public static ejemplometodos.Vehiculo crearVehiculo(String matricula, Combustible combustible, int ruedas, int potencia, boolean automatico, Color color, Propietario propietario) {
        return new Vehiculo(matricula, combustible, ruedas, potencia, automatico, color, propietario);
    }

    // método estático para crear un propietario (y lo devuelve)


}
