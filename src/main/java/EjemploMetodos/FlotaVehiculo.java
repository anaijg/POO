package EjemploMetodos;

import java.util.ArrayList;

public class FlotaVehiculo {
    ArrayList<Vehiculo> ListaVehiculos;

    public FlotaVehiculo() {
        this.ListaVehiculos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "FlotaVehiculo{" +
                "ListaVehiculos=" + ListaVehiculos +
                '}';
    }


    public void  añadirVehiculo(Vehiculo vehiculo) {
        this.ListaVehiculos.add(vehiculo);
    }

    /**
    public void removevehiculo(String matricula) {
        boolean existe = false;
        for (Vehiculo coche: ListaVehiculos) {
            if (matricula.equals(Vehiculo.getMatricula())) {
                existe = true;
                ListaVehiculos.remove(coche);
                break;
            }
            if (!existe)

        }
    } */
}
