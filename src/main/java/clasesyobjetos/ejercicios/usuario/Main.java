package clasesyobjetos.ejercicios.usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //vamos a crear un usuario
        Usuario usuario1 = crearUsuario();
        System.out.println(usuario1);
        //ahora lo imprimimos a la vez que lo creamos
        //System.out.println(crearUsuario());

        // para probar este metodo mensajeEstado, ve el main y llama al método con el usuario creado.
        usuario1.mensajeEstado();

        // a continuacion, cambia el estado del usuario a Activo, y vuelve a llamar el metodo mensajeEstado
        System.out.println();
        usuario1.setEstado(Estado.ACTIVO);
        usuario1.mensajeEstado();


    }

    //añade un metodo crearUsuario(): Usuario, que pide los datos para crear un usuarios.
    public static Usuario crearUsuario(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre de usuario: ");
        String username = sc.nextLine();
        System.out.println("Introduce email de usuario: ");
        String email = sc.nextLine();
        System.out.println("Introduce contraseña del usuario: ");
        String password = sc.nextLine();
        // creamos el usuario -> crear un objeto/instanicia de tipo usuario.
        Usuario usuario = new Usuario(username, email, password);
        // devolvemos el usuario
        return  usuario;
    }
}
