package ejercicios.banco;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("demo", "Ale", "Chim Pom");

        Cuenta cuenta = new Cuenta("123456", 1000, usuario);
    }
}
