package ejercicios.banco;

public class Main {
    public static void main(String[] args) {
        Usuario propietario = new Usuario("demo","Ale", "Chim Pom");
        Cuenta cuenta1 = new Cuenta("123456",1000,propietario);

        Cuenta.mostrarCuenta(cuenta1);

    }
}
