package ejerciciosAna.usuario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // vamos a crear un usuario
        Usuario usuario1 =  crearUsuario();
        System.out.println(usuario1);
        // ahora lo imprimimos a la vez que lo creamos
        //System.out.println(crearUsuario());

        // Para probar este método mensajeEstado, ve al main y llama al método con el usuario creado.
        usuario1.mensajeEstado();

        //A continuación, cambia el estado del usuario a ACTIVO, y vuelve a llamar al método mensajeEstado.
        System.out.println();
        usuario1.setEstado(Estado.ACTIVO);
        usuario1.mensajeEstado();
    }

    // Añade un método crearUsuario(): Usuario, que pide los datos para crear un usuario.
    public static Usuario crearUsuario() {
        // pedimos los datos necesarios para crear un usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce nombre de usuario: ");
        String username = scanner.nextLine();
        System.out.print("Introduce email del usuario: ");
        String email = scanner.nextLine();
        System.out.print("Introduce contraseña del usuario: ");
        String password = scanner.nextLine();
        // creamos el usuario --> crear un objeto/instancia de tipo usuario
        Usuario usuario = new Usuario(username, email, password);
        // devolvemos el usuario
        return usuario;
    }
}
