package Ejercicios.Banco;

import EjemploMetodos.Propietario;

public class MainBanco {
    public static void main(String[] args) {
        Usuario propietario = new Usuario("Demo", "Ale", "Chim Pom");
        Cuenta cuenta1 = new Cuenta("12356", 1000, propietario);

        mostrarCuenta(cuenta1);

    }

    public static void mostrarCuenta(Cuenta cuenta1) {
        System.out.println(cuenta1);

    }
}
