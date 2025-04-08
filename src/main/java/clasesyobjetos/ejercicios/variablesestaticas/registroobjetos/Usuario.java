package clasesyobjetos.ejercicios.variablesestaticas.registroobjetos;

/**
 * Crea una clase Usuario que tenga un atributo de instancia nombreUsuario y una variable estática usuariosRegistrados que almacene la cantidad de usuarios creados. Cada vez que se registre un nuevo usuario, la variable estática debe actualizarse.
 */
public class Usuario {
    private String nombreUsuario; // es atributo de instancia, no lleva static, es único para cada objeto y va asociado a él
    public static int usuariosRegistrados; // es atributo estático, igual para todos los objetos

    public Usuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        usuariosRegistrados++;
    }
}
