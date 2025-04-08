package clasesyobjetos.ejercicios.banco;

public class Main {
    public static void main(String[] args) {
        // 1. Una instancia de la clase Usuario llamada propietario ((login: “demo”, nombre: “Ale”, apellidos “Chim Pom”)
        Usuario propietario = new Usuario("demo", "Ale", "Chim Pom");
        //System.out.println(propietario);
        //2. 	Una instancia de la clase Cuenta (“123456”, 1000, propietario).
        Cuenta cuenta1 = new Cuenta("123456", 1000, propietario);

        // llamamos al método mostrar cuenta
        mostrarCuenta(cuenta1);

    }

    // Un método estático mostrarCuenta, que recibe una cuenta y muestra toda la información de la cuenta.
    public static void mostrarCuenta(Cuenta cuenta) {
        System.out.println(cuenta);
    }

}
