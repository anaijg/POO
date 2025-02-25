package ejemplometodos;

import java.time.LocalDate;

import static ejemplometodos.MainPruebasVehiculo.crearVehiculo;

public class MainPruebasFlotaVehiculo {
    public static void main(String[] args) {
        // aquí probamos lo de la flota
        // 1) creamos la flota (creamos una instancia u objeto de tipo FlotaVehiculo
        FlotaVehiculo flota = new FlotaVehiculo();

        // ahora vamos a añadir un coche a la flota, que tenemos vacía. Para crear un coche tengo que tener un propietario.
        Propietario ana = new Propietario("Ana", "Álvarez", "Ares", Licencia.B, LocalDate.of(1978, 10, 10));

        Vehiculo coche1 = new Vehiculo("5454-BXZ" ,Combustible.HIBRIDO, 4, 136, true, Color.AZUL, ana);

        // voy a añadir el vehículo a la flota
        flota.añadirVehiculo(coche1);
        System.out.println(flota);

        Vehiculo coche2 = crearVehiculo("1234-CCC", Combustible.ELECTRICO, 4, 150, true, Color.ROJO, ana);

        flota.añadirVehiculo(coche2);
        System.out.println(flota);

        flota.eliminarVehiculo("1234-CCC");
        System.out.println(flota);

        flota.eliminarVehiculo("1325-AAA");

    }
}