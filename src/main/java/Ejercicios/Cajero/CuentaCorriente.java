package Ejercicios.Cajero;

public class CuentaCorriente {
    // que almacena los datos DNI, nombre del titular y saldo.
    private String DNI;
    private String titular;
    private double saldo;

    // constructor --> crear una cuenta
    // saldo inicial 0
    public CuentaCorriente(String DNI, String titular) {
        this.DNI = DNI;
        this.titular = titular;
        this.saldo = 0;
    }

    // Sobrecarga los constructores para poder crear objetos:
    //Con el DNI del titular e la cuenta y un saldo inicial
    //Con el DNI, nombre y el saldo inicial

    // metodos de instancia -> los que se llamarán desde un objeto de tipo cuenta
    // Sacar dinero e indicar si se puede
    public void sacarDinero(double reintegro) {
        if (saldo >= reintegro) {
            this.saldo -= reintegro;
            System.out.println("Se puede llevar a cabo la operación, su nuevo saldo es: " + this.saldo);
        } else System.out.println("No tiene suficiente saldo");
    }

    //Ingresar dinero: se incrementa el saldo
    public void depositarDinero(double ingreso) {
        this.saldo += ingreso;
    }

    // Mostrar información: muestra la información disponible de la cuenta corriente
    public void mostrarInformacion() {
        System.out.println(this.DNI + " - " + this.titular + " - " + "SALDO DISPONIBLE= " + this.saldo + "€");
    }
}
