package clasesyobjetos.ejercicios.banco;

/**
 * constructores parametrizados,  los getters y setters correspondientes a cada atributo y un método toString().
 */

public class Cuenta {
    private String codigo;
    private double balance;
    private Usuario usuario;

    /**
     * Constructor parametrizado. Si no te dicen detalles, pones todos los atributos
     * @param codigo
     * @param balance
     * @param usuario
     */
    public Cuenta(String codigo, double balance, Usuario usuario) {
        this.codigo = codigo;
        this.balance = balance;
        this.usuario = usuario;
    }

    // getters y setters

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "codigo='" + codigo + '\'' +
                ", balance=" + balance +
                ", usuario=" + usuario +
                '}';
    }
}
