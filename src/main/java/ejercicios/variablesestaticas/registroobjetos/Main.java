package ejercicios.variablesestaticas.registroobjetos;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Petete");
        Usuario usuario2 = new Usuario("Canito");
        Usuario usuario3 = new Usuario("Bulbasaur");
        Usuario usuario4 = new Usuario("Mequetrefe");
        // he creado cuatro objetos de tipo usuario
        // ¿cuántos usuarios hay registrados?
        System.out.println(Usuario.usuariosRegistrados);

    }
}
