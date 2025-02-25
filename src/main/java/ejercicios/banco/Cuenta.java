package ejercicios.banco;

public class Cuenta {
    private String codigo;
    private double balance;
    private  Usuario propietario;

    public Cuenta(String codigo, double balance, Usuario propietario) {
        this.codigo = codigo;
        this.balance = balance;
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "codigo='" + codigo + '\'' +
                ", balance=" + balance +
                ", propietario=" + propietario +
                '}';
    }

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
}
