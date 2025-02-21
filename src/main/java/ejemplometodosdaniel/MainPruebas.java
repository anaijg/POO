package ejemplometodosdaniel;

import java.time.LocalDate;

import static ejemplometodosdaniel.Main.crearVehiculo;

public class MainPruebas {
    public static void main(String[] args) {
        // aqui probamos los metodos y demas
        // probamos lo de la flota
        // 1 creamos lo de la flota(creamos una instancia u objeta de tipo FlotaVehiculo)
        FlotaVehiculo flota = new FlotaVehiculo();

        Propietario ana = new Propietario("Ana", "Álvarez", "Ares", Licencia.B, LocalDate.of(1978, 10, 10));

        Vehiculo coche1 = new Vehiculo("5454-BXZ" , Combustible.HIBRIDO, 4, 136, true, Color.AZUL, ana);

        Vehiculo coche2 = crearVehiculo("1234-CCC", Combustible.ELECTRICO, 4, 150, true, Color.ROJO, ana);

        // voy a añadir el vehiculo a la flota

        flota.añadirVehiculo(coche1);
        System.out.println(flota);

    }
}
