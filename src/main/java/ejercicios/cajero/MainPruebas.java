package ejercicios.cajero;

import ejercicios.banco.Cuenta;

public class MainPruebas {
    public static void main(String[] args) {
        // Establecemos el nombre del banco para todas las cuentas
        CuentaCorriente.setNombreBanco("Banco Central");

        // Creación de cuentas usando los distintos constructores:
        CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", "Juan Pérez");
        CuentaCorriente cuenta2 = new CuentaCorriente("87654321B", 500);
        CuentaCorriente cuenta3 = new CuentaCorriente("11223344C", "María García", 1000);

        // Mostrar información inicial de cada cuenta
        System.out.println("---- Información inicial de las cuentas ----");
        System.out.println("Cuenta 1:");
        cuenta1.mostrarInformacion();
        System.out.println();
        System.out.println("Cuenta 2:");
        cuenta2.mostrarInformacion();
        System.out.println();
        System.out.println("Cuenta 3:");
        cuenta3.mostrarInformacion();
        System.out.println();

        // Prueba de operaciones: ingreso y extracción de dinero
        cuenta1.ingresarDinero(200);
        System.out.println("Cuenta 1 después de ingresar 200:");
        cuenta1.mostrarInformacion();

        boolean retiro = cuenta1.sacarDinero(100);
        System.out.println("Intento de retirar 100 de Cuenta 1: " + (retiro ? "Éxito" : "Fallo"));
        cuenta1.mostrarInformacion();
        System.out.println();

        // Prueba de asignación de un gestor a una cuenta
        Gestor gestor1 = new Gestor("Carlos", "555-1234");
        cuenta1.setGestor(gestor1);
        System.out.println("Cuenta 1 después de asignar gestor:");
        cuenta1.mostrarInformacion();
        System.out.println();

        // COMPROBACIÓN DE VISIBILIDAD DE ATRIBUTOS:
        // Al estar en el mismo paquete se pueden acceder a los atributos 'dni' y 'titular'.
        // El atributo 'saldo' es privado y no se puede acceder directamente.
        System.out.println("Acceso directo a atributos (dentro del mismo paquete):");
        System.out.println("DNI (package): " + cuenta1.DNI);      // Accesible porque es default.
        System.out.println("Titular (public): " + cuenta1.titular); // Accesible porque es public.
        // La siguiente línea produciría error porque 'saldo' es privado:
        // System.out.println("Saldo: " + cuenta1.saldo);


    }
}
