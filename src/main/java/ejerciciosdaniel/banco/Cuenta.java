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
public class Cuenta {
    private String codigo;
    private double balance;
    private Usuario propietario;


    //constructor


    public Cuenta(String codigo, double balance, Usuario propietario) {
        this.codigo = codigo;
        this.balance = balance;
        this.propietario = propietario;
    }

    //get y set de todos los atributos


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Usuario getPropietario() {
        return propietario;
    }

    public void setPropietario(Usuario propietario) {
        this.propietario = propietario;
    }

    //to string


    @Override
    public String toString() {
        return "Cuenta{" +
                "codigo='" + codigo + '\'' +
                ", balance=" + balance +
                ", propietario=" + propietario +
                '}';
    }
}
