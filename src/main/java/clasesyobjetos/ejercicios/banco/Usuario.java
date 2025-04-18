package clasesyobjetos.ejercicios.banco;

/**
 * constructores parametrizdos, los getters y los setters correspondientes a cada atibuto y un metodo toString
 */

public class Usuario {

    private String login;
    private String nombre;
    private String apellidos;


    /**
     * Constructor parametrizado, Sino me da mas detalles, es con todos los atributos.
     * @param login
     * @param nombre
     * @param apellidos
     */

    public Usuario(String login, String nombre, String apellidos) {
        this.login = login;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    // getters and setters

    /**
     *
     * @return el valor de login
     */

    public String getLogin() {//metodos de instancia.
        return login;
    }

    /**
     *
     * @param login
     */

    public void setLogin(String login) {
        this.login = login;
    }

    /**
     *
     * @return el valor de nombre
     */

    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    //método toString

    /**
     *
     * @return el valor de Usuario.
     */
    @Override // sobreescribe
    public String toString() {
        return "Usuario: " +
                "login='" + login + '\'' +
                "| nombre y apellidos='" + nombre + " " + apellidos;
    }
}
