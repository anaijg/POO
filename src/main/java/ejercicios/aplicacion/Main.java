package ejercicios.aplicacion;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Usuario usuario1;

    public static void main(String[] args) {
        usuario1 = crearUsuario();
        System.out.println(usuario1);
        usuario1.mensajeEstado();
        usuario1.setEstado(Estado.ACTIVO);
        usuario1.mensajeEstado();
    }

    private static Usuario crearUsuario() {
        System.out.println("Introduce en este orden: Nombre,Correo y Contraseña: ");
        return new Usuario(sc.nextLine(), sc.nextLine(), sc.nextLine(), Estado.PENDIENTE);
    }


}
