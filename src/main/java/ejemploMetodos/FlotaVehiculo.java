package ejemploMetodos;

import java.util.ArrayList;

public class FlotaVehiculo {
    ArrayList<Vehiculo> flotaVehiculos = new ArrayList<>();

    // en el constructor inicializas el arraylist vacío
    public FlotaVehiculo(ArrayList<Vehiculo> flotaVehiculos) {
        this.flotaVehiculos = flotaVehiculos;
    }

    // toString()
    @Override
    public String toString() {
        return "FlotaVehiculo{" +
                "flotaVehiculos=" + flotaVehiculos +
                '}';
    }

    // añadir método de instancia para añadir un vehículo a la flota
    public void agregarVehiculo(Vehiculo vehiculo){
        flotaVehiculos.add(vehiculo);
    }

    // añadir método de instancia para eliminar un vehículo de la flota
    public boolean eliminarVehiculo(Vehiculo vehiculo){
        return flotaVehiculos.remove(vehiculo);
    }
}
