package Ejercicios.Banco;

public class Usuario {
    private String Login;
    private String Nombre;
    private String Apellidos;

    public Usuario(String login, String nombre, String apellidos) {
        Login = login;
        Nombre = nombre;
        Apellidos = apellidos;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "Login='" + Login + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                '}';
    }
}
