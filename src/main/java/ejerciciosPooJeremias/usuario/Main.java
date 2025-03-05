package ejerciciosPooJeremias.usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Crear e imprimir un usuario con el metodo crearUsuario
        Usuario usuario1 = crearUsuario();
        System.out.println(usuario1);

        //Mostrar el estado del usuario
        usuario1.mensajeEstado();

        //Modificar el estado y volver a mostrar
        System.out.println();
        usuario1.setEstado(Estado.ACTIVO);
        usuario1.mensajeEstado();

    }


    public static Usuario crearUsuario(){
        String username,email,pass;

        //Creacion de una instancia
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el username: ");
        username= input.nextLine();
        System.out.print("Ingrese el email: ");
        email = input.nextLine();
        System.out.print("Ingrese el pass: ");
        pass= input.nextLine();

        Usuario usuario1 = new Usuario(username, email, pass);

        return usuario1;
    }
}
