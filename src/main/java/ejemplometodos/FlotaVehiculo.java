package ejemplometodos;

import java.util.ArrayList;

/**
 * Esta es la forma de hacer una relación de uno a muchos:
 * una flota tiene muchos coches
 * muchos coches forman una flota
 */
public class FlotaVehiculo {
    // atributo: arraylist de vehículos
    private ArrayList<Vehiculo> vehiculos;

    // en el constructor inicializas el arraylist vacío

    public FlotaVehiculo() {
        this.vehiculos = new ArrayList<>();
    }

    // toString()

    @Override
    public String toString() {
        return "FlotaVehiculo{" +
                "vehiculos=" + vehiculos +
                '}';
    }


    /**
     * Método añadirVehiculo,
     * @param vehiculo, se añade al arraylist vehiculos
     */
    public void añadirVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    /**
     * Método eliminarVehiculo, recibe una matrícula (suponemos que correcta), comprobamos si está en la flota de vehículos. Si está, eliminamos el vehículo; si no está, lo decimos.
     * @param matricula
     */
    public void eliminarVehiculo(String matricula) {
        boolean existe = false;
        for (Vehiculo coche: vehiculos) {
            if (matricula.equals(coche.getMatricula())) {
                existe = true;
                vehiculos.remove(coche);
                System.out.println("El coche con matrícula " + matricula + " ha sido eliminado de la flota");
                break;
            }
        }
        if (!existe) { // es lo mismo que existe = false
            System.out.println("El coche con matrícula " + matricula + " no forma parte de la flota.");
        }
    }
}
