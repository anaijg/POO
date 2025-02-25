package Ejercicios.Aplicacion;

import java.util.Scanner;

public class MainAplicacion {
    public static void main(String[] args) {
        //lo puedes crear y imprimirlo
        Usuario usuario1 = crearUsuario();
        System.out.println(usuario1);
        usuario1.setEstado(Estado.Activo);
        usuario1.mensajeEstado();
        //imprimirlo a la vez que lo creas
        //System.out.println(crearUsuario());
    }

    public static Usuario crearUsuario() {
        Scanner sc = new Scanner(System.in);
        //pedimos los datos necesarios para crear un usuario
        System.out.println("Dime un username: ");
        String username = sc.nextLine();
        System.out.println("Dime un email: ");
        String email = sc.nextLine();
        System.out.println("Dime un password: ");
        String password = sc.nextLine();
        //crear el usuairo --> crear un objeto/instancia de tipo usuario
        Usuario usuario = new Usuario(username, email, password);
        return usuario;
    }


}
