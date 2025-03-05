package ejerciciosPooJeremias.banco;

public class Main {
    public static void main(String[] args) {

        //Una instancia de la clase Usuario llamada propietario ((login: “demo”, nombre: “Ale”, apellidos “Chim Pom”)
        Usuario propietario= new Usuario("demo","ale","Chim Pom");

        //Una instancia de la clase Cuenta (“123456”, 1000, propietario).
        Cuenta cuenta = new Cuenta("123456", 1000, propietario);

        mostrarCuenta(cuenta);
    }

    //Un méto_do estático mostrarCuenta, que recibe una cuenta y muestra toda la información de la cuenta.
    public static void mostrarCuenta(Cuenta cuenta){System.out.println(cuenta);};
}
