package ejercicios.variablesestaticas.valoracumuladoobjetos;

import ejercicios.banco.Cuenta;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(); // tiramos del constructor por defecto
        CuentaBancaria cuenta2 = new CuentaBancaria();
        CuentaBancaria cuenta3 = new CuentaBancaria();
        CuentaBancaria cuenta4 = new CuentaBancaria();

        // ingresamos cantidades en cada cuenta
        cuenta1.ingresarDinero(1000);
        System.out.println("En la cuenta 1 hay " + cuenta1.getSaldo() + " € y en el banco " + CuentaBancaria.saldoTotalBanco);
        cuenta2.ingresarDinero(500);
        System.out.println("En la cuenta 2 hay " + cuenta2.getSaldo() + " € y en el banco " + CuentaBancaria.saldoTotalBanco);
        cuenta3.ingresarDinero(1385);
        System.out.println("En la cuenta 3 hay " + cuenta3.getSaldo() + " € y en el banco " + CuentaBancaria.saldoTotalBanco);
        cuenta4.ingresarDinero(1000);
        System.out.println("En la cuenta 4 hay " + cuenta4.getSaldo() + " € y en el banco " + CuentaBancaria.saldoTotalBanco);

    }
}
