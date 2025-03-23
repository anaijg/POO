package ejercicios.variablesestaticas.valoracumuladoobjetos;

import ejercicios.banco.Cuenta;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria();
        CuentaBancaria cuenta3 = new CuentaBancaria();

        //ingresamos cantidades de dinero en cada cuenta
        cuenta1.ingresarDinero(1000);
        System.out.println("En la cuenta 1 hay " + cuenta1.getSaldo() + " € en el banco " + CuentaBancaria.saldoTotalBanco);

        cuenta2.ingresarDinero(500);
        System.out.println("En la cuenta 2 hay " + cuenta2.getSaldo() + " € en el banco " + CuentaBancaria.saldoTotalBanco);

        cuenta3.ingresarDinero(1385);
        System.out.println("En la cuenta 3 hay " + cuenta3.getSaldo() + " € en el banco " + CuentaBancaria.saldoTotalBanco);

    }


}
