package Ejercicios.Banco;

public class Usuario {
    private String nombre;
    private String login;
    private String apellidos;

    public Usuario(String nombre, String login, String apellidos) {
        this.nombre = nombre;
        this.login = login;
        this.apellidos = apellidos;
    }

    @Override public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", login=" + login + ", apellidos=" + apellidos + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public String getLogin() {
        return login;
    }

    public String getApellidos() {
        return apellidos;
    }
}
