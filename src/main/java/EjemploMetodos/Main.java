package EjemploMetodos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Propietario alex = new Propietario("Alex", "ruiz", "Romera",Licencia.b, LocalDate.of(2006,04,14));

        Vehiculo helicopter1 = new Vehiculo("5454-BXZ", Combustible.Hibrido, 4, 2, 7, true, 1000, Color.azul, alex);
        System.out.println(helicopter1);
        //pero queremos tener mas funcionalidades, por ejemplo, hacer un arraylist de coches
        //y que los muestre --> hacemos:
        //1 crear un metodo estatico que cree un coche, pasandole los parametros y lo devuelva

       //crearVehiculo(Combustible.Electrico, 4, 4, 6, true, 100,Color.azul, Propietario());


        Propietario fede = new Propietario("feferico", "fernandez", "florez", Licencia.c, LocalDate.of(1945, 12, 01));
        helicopter1.transferirPropietario(fede);

        helicopter1.cambiaColor(Color.plateado);

        System.out.println("es electrico? " + helicopter1.esElectrico());

    }


    /**
     * @param Matricula
     * @param combustible
     * @param ruedas
     * @param puertas
     * @param marchas
     * @param automatico
     * @param potencia
     * @param color
     * @param propietario
     * @return el vehiculo creado
     */

    public static Vehiculo crearVehiculo(String Matricula, Combustible combustible, int ruedas, int puertas, int marchas, boolean automatico, int potencia, Color color, Propietario propietario) {

       return new Vehiculo("5353-VMZ" ,combustible, ruedas, puertas, marchas, automatico, potencia, color, propietario);

    }


    /**
     *
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param licencia
     * @param fechaNacimiento
     * @return
     */
    public static Propietario crearPropietario(String nombre, String apellido1, String apellido2, Licencia licencia, LocalDate fechaNacimiento){
        Propietario propietario1 = new Propietario(nombre, apellido1, apellido2, licencia, fechaNacimiento);
        return null;
    }
}
