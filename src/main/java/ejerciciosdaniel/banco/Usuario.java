package ejerciciosdaniel.banco;

/**
 * Crea un paquete banco y dentro de él:
 * Crea una clase Cuenta, con tres atributos:
 *                                                i. 	código, de tipo String
 *                                               ii. 	balance, de tipo double
 *                                              iii. 	propietario, de tipo Usuario
 * Crea una clase Usuario, con tres atributos:
 *                                                i. 	login, de tipo String
 *                                               ii. 	nombre, de tipo String
 *                                              iii. 	apellidos, de tipo String
 * Ambas clases tienen constructores parametrizados,  los getters y setters correspondientes a cada atributo y un método toString().
 * c.  	Crea una clase Main con un método  main dentro del cual debes crear:
 * 1. 	Una instancia de la clase Usuario llamada propietario ((login: “demo”, nombre: “Ale”, apellidos “Chim Pom”)
 * 2. 	Una instancia de la clase Cuenta (“123456”, 1000, propietario).
 *                                               ii. 	Un método estático mostrarCuenta, que recibe una cuenta y muestra toda la información de la cuenta.
 */
public class Usuario {
    private String login;
    private String nombre;
    private String apellidos;

    //constructor


    public Usuario(String login, String nombre, String apellidos) {
        this.login = login;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    //get y set de todos los atributos


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

    //to string


    @Override
    public String toString() {
        return "Usuario{" +
                "login='" + login + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
