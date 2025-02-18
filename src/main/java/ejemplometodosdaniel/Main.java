package ejemplometodosdaniel;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Propietario ana = new Propietario("Ana", "Alvarez", "Ares", Licencia.B, LocalDate.of(1978, 10, 10));

        Vehiculo coche1 = new Vehiculo("5454BXZ", Combustible.HIBRIDO, 4, 186, false, Color.PLATEADO, ana);

        System.out.println(coche1);

        // pero queremos tener ams funcionalidades, por ejemplo: hacer un arraylist de coches y que los muestre ---> pero para eso debemos:
        // 1 crear un metodo estatico que cree un coche y lo devuelva.
        // como es un metodo statico y esta en la misma clase, para llamarlo vasta con esccribir su nombre

        Propietario daniel = crearPropietario("Daniel", "Buzea", "", Licencia.B, LocalDate.of(1998, 4, 8));


        Vehiculo coche2 = crearVehiculo("5454MJN", Combustible.HIBRIDO, 4, 186, false, Color.PLATEADO, daniel);
        System.out.println(coche2);

        if (coche1.esDeAltaPotencia()) {
            System.out.println("coche1 es de alta potencia");
        }
        if (coche2.esDeAltaPotencia()) {
            System.out.println("coche2 es de alta potencia ");
        }

        // cambiamos el color del coche2

        System.out.println("\n\nCambiamos el color del coche");
        coche2.cambiarColor(Color.AMARILLO);
        System.out.println(coche2);

        /**
         * EsElectrico
         */
        System.out.println("\n\nComprobamos si el vehiculo es electrico");
        System.out.println("coche 1 es electrico "+ coche1.esElectrico());
        System.out.println("coche 2 es electrico "+ coche2.esElectrico());














    }
        /**
         *  Metodo que crea un vehciulo pasandole como parametros
         * @param matricula
         * @param combustible
         * @param ruedas
         * @param potencia
         * @param automatico
         * @param color
         * @param propietario
         * @return
         */
        public static Vehiculo crearVehiculo (String matricula, Combustible combustible,int ruedas, int potencia,
        boolean automatico, Color color, Propietario propietario){
            Vehiculo vehiculo = new Vehiculo(matricula, combustible, ruedas, potencia, automatico, color, propietario);
            return vehiculo;
        }


        /**
         *
         * @param nombre
         * @param apellido1
         * @param apellido2
         * @param licencia
         * @param fechadenacimiento
         * @return
         */
        public static Propietario crearPropietario (String nombre, String apellido1, String apellido2, Licencia
        licencia, LocalDate fechadenacimiento){
            Propietario propietario = new Propietario(nombre, apellido1, apellido2, licencia, fechadenacimiento);

            return propietario;
        }
        Propietario fede = new Propietario("Federico", "Fernandez", "Florez", Licencia.B, LocalDate.of(1998, 4, 8));


        // probamos el metodo de transferir propiedad

}
