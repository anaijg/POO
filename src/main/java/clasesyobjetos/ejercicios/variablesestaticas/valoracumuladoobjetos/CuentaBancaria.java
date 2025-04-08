package clasesyobjetos.ejercicios.variablesestaticas.valoracumuladoobjetos;

/**
 * Crea una clase CuentaBancaria que tenga un atributo de instancia saldo y un atributo estático saldoTotalBanco. Cada vez que se cree una nueva cuenta bancaria, su saldo inicial debe sumarse al saldo total del banco. Además, crea un método ingresarDinero(double cantidad) que permita ingresar dinero a la cuenta y actualizar saldoTotalBanco.
 */

public class CuentaBancaria {
    private double saldo; // atributo de instancia, pertenece únicamente al objeto y cada objeto tiene un valor distinto
    public static double saldoTotalBanco; // atributo estático, pertenece a la clase CuentaBancaria, y es común a todos los objetos; si cambia su valor para un objeto, se actualiza ese valor para todos los demás objetos

    public void ingresarDinero(double cantidad) {
        this.saldo += cantidad; // cada vez que ingreso dinero en una cuenta, se incrementa su saldo
        saldoTotalBanco += cantidad; // pero también se incrementa en esa cantidad el saldo del banco
    }

    public double getSaldo() {
        return saldo;
    }
}
