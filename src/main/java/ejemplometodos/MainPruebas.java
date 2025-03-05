package ejemplometodos;

import java.time.LocalDate;

import static ejemplometodos.MainPruebasVehiculo.crearVehiculo;

public class MainPruebas {
    public static void main(String[] args) {
        // aquí probamos lo de la flota
        // 1) creamos la flota (creamos una instancia
        FlotaVehiculo flota = new FlotaVehiculo();
        Propietario pablo = new Propietario("Pablo", "Carrillo", "Punina", Licencia.B, LocalDate.of(1990, 03, 24));

        Vehiculo coche1 = new Vehiculo("5454-BXZ", Combustible.DIESEL, 4, 130, false, Color.NEGRO, pablo);

        



        // voy a añdor el vehiculo a la flota
        flota.añadirVehiculo(coche1);
        System.out.println(flota);
        Vehiculo coche2 = crearVehiculo("1234-CCC", Combustible.DIESEL, 4, 120, true, Color.ROJO, pablo);

        flota.añadirVehiculo(coche2);
        System.out.println(flota);

        flota.eliminarVehiculo("1234-CCC");
        System.out.println(flota);
        flota.eliminarVehiculo("1325-AAA");

    }
}
