package ejemplometodos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Propietario ana = new Propietario("Ana", "Alvarez", "Ares", Licencia.B, LocalDate.of(1978, 10, 10));

        Vehiculo coche1 = new Vehiculo("5454BXZ",Combustible.HIBRIDO, 4, 186, false, Color.PLATEADO, ana);

        System.out.println(coche1);

        // pero queremos tener ams funcionalidades, por ejemplo: hacer un arraylist de coches y que los muestre ---> pero para eso debemos:
        // 1 crear un metodo estatico que cree un coche y lo devuelva.
        // como es un metodo statico y esta en la misma clase, para llamarlo vasta con esccribir su nombre

        Vehiculo coche2 = crearVehiculo(Combustible.HIBRIDO, 4, 186, false, Color.PLATEADO, ana);
        System.out.println(coche2);



    }

    /**
     *  Metodo que crea un vehciulo pasandole como parametros
     * @param combustible
     * @param ruedas
     * @param potencia
     * @param automatico
     * @param color
     * @param propietario
     * @return
     */
    public static Vehiculo crearVehiculo(Combustible combustible, int ruedas, int potencia, boolean automatico, Color color, Propietario propietario) {
        Vehiculo vehiculo = new Vehiculo(combustible, ruedas, potencia, automatico, color, propietario);

        return vehiculo;

    }


    public static Propietario creaPropietario(String nombre, String apellido1, String apellido2, Licencia licencia, LocalDate fechadenacimiento) {
       Propietario propietario = new Propietario()


    }

}
