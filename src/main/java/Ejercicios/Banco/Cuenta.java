package Ejercicios.Banco;

public class Cuenta {
    private String codigo;
    private double balance;
    private Usuario Propietario;

    public Cuenta(String codigo, double balance, Usuario Propietario) {
        this.codigo = codigo;
        this.balance = balance;
        this.Propietario = Propietario;
    }

    @Override public String toString() {
        return "Cuenta{" + "codigo=" + codigo + ", balance=" + balance + ", Prpietario=" + Propietario + '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public double getBalance() {
        return balance;
    }

    public Usuario getPropietario() {
        return Propietario;
    }

    public static void mostrarCuenta(Cuenta cuenta) {
        System.out.println("Balance de la cuenta: " + cuenta.getBalance());
        System.out.println("Codigo de la cuenta: " + cuenta.getCodigo());
        System.out.println("Propietario de la cuenta: " + cuenta.getPropietario());
    }
}
