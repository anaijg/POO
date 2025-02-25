package Ejercicios.Banco;

public class MainBanco {
    public static void main(String[] args) {
        Usuario propietario = new Usuario("Ale", "demo", "Chim Pom");
        Cuenta cuentaAle = new Cuenta("123456", 1000.00, propietario);

        Cuenta.mostrarCuenta(cuentaAle);
    }

}
