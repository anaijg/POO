package ejercicios.usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = crearUsuario();
        System.out.println(usuario1);
        // ahora lo imprimimos a la vez que lo creamos
        System.out.println(crearUsuario());
        System.out.println();
        usuario1.mensajeEstado();
        System.out.println();
        usuario1.setEstado(Estado.ACTIVO);
        usuario1.mensajeEstado();
    }
    public static Usuario crearUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce nombre de usuario: ");
        String username = scanner.nextLine();
        System.out.print("Introduce email del usuario: ");
        String email = scanner.nextLine();
        System.out.print("Introduce contraseña del usuario: ");
        String password = scanner.nextLine();
        // creamos el usuario --> crear un objeto/instancia tipo usuario
        Usuario usuario = new Usuario(username, email, password);
        return usuario;

    }
}
