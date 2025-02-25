package Ejercicios.Usuario;

import Ejercicios.Hotel.Zonas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //crear un usuario
        Usuario usuario1 = crearUsuario();
        // ahora lo imprimimos a la vez que lo creamos
        System.out.println(usuario1);
        usuario1.cambiarEstado(Estado.BLOQUEADO);
        usuario1.mensajeEstado();


    }

    // Añade un metodo crearUsuario(): Usuario, que pide los datos para crear un usuario
    public static Usuario crearUsuario() {
        // pedimos los datos necesarios para crear un usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario");
        String username = scanner.nextLine();
        System.out.println("Ingrese su email");
        String email = scanner.nextLine();
        System.out.println("Ingrese su password");
        String password = scanner.nextLine();
        // creamos el usuario --> crear un objeto/instancia de tipo usuario
        Usuario usuario = new Usuario(username, email, password, Estado.PENDIENTE);

        return usuario;

    }
    public static void mostrarEstado(Estado estado) {
        System.out.println("El estado de la cuenta es: " + estado);
    }


}
