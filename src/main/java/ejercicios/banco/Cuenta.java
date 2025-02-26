package ejercicios.banco;

/**
 *
 */

public class Cuenta {
    //caracteristicas de la clase cuenta.
    private String codigo;
    private double balance;
    private Usuario propietario;

    //constructor

    /**
     * Constructor parametrizado, Si no te decen detalles,  pones todos los atributos.
     * @param codigo
     * @param balance
     * @param propietario
     */
    public Cuenta(String codigo, double balance, Usuario propietario) {
        this.codigo = codigo;
        this.balance = balance;
        this.propietario = propietario;
    }
    //Metodos getters and setters

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

    // metodo toString de la clase "CUENTA".

    @Override
    public String toString() {
        return "Cuenta{" +
                "codigo='" + codigo + '\'' +
                ", balance=" + balance + " euros" +
                ", propietario=" + propietario +
                '}';
    }
}
