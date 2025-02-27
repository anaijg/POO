package ejercicios.banco;

/**
 * constructores parametrizados,  los getters y setters correspondientes a cada atributo y un método toString().
 */
public class Usuario {
    private String login;
    private String nombre;
    private String apellidos;

    /**
     * Constructor parametrizado. Si no me dan más detalles, es con todos los atributos
     * @param login
     * @param nombre
     * @param apellidos
     */
    public Usuario(String login, String nombre, String apellidos) {
        this.login = login;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    // getters y setters

    /**
     *
     * @return el valor de login del objeto
     */
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Usuario: " +
                "login = '" + login + '\'' +
                "| nombre y apellidos ='" + nombre + " " + apellidos + '\'';
    }
}
