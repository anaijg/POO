package ejemplometodosdaniel;


import java.util.ArrayList;

/**
 * Esto es la forma de hacer una relacion de uno a muchos:
 * una flota tiene muchos vehiculos
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


    // añadir método de instancia para añadir un vehículo a la flota

    /**
     * @param vehiculo, se añade al arrayList vehiculos
     */
    public void añadirVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }
    // añadir método de instancia para eliminar un vehículo de la flota

    public void eliminarVEhiculo(String matricula) {
        boolean existe = false;
        for (Vehiculo coche: vehiculos) {
            if (matricula.equals(coche.getMatricula())) {
                existe = true;
                vehiculos.remove(coche);
                System.out.println("El coche con matricula "+ matricula + " ha sido eliminado de la flota.");

            }
        }
    }



}