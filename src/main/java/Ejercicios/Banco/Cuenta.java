package Ejercicios.Banco;

public class Cuenta {
    private String codigo;
    private double Balance;
    public Usuario propietario;

    /**
     *
     * @param codigo
     * @param balance
     * @param propietario
     */

    public Cuenta(String codigo, double balance, Usuario propietario) {
        this.codigo = codigo;
        Balance = balance;
        this.propietario = propietario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public Usuario getPropietario() {
        return propietario;
    }

    public void setPropietario(Usuario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "codigo='" + codigo + '\'' +
                ", Balance=" + Balance +
                ", propietario=" + propietario +
                '}';
    }
}
