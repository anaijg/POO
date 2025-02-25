package ejercicios.cajero;

public class CuentaCorriente {
    // que almacena los datos: DNI, nombre del titular y saldo.
    private String DNI;
    private String titular;
    private double saldo;

    // constructor --> crear una cuenta
    // Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0.
    public CuentaCorriente(String DNI, String titular) {
        this.DNI = DNI;
        this.titular = titular;
        this.saldo = 0;
    }

    // Sobrecarga los constructores para poder crear objetos:
    //Con el DNI del titular de la cuenta y un saldo inicial.

    //Con el DNI, nombre y el saldo inicial.




    // métodos de instancia -> los que se llamarán desde un objeto de tipo cuenta
    /**
     * Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación, si existe saldo suficiente.
     * @param reintegro (dinero a retirar)
     */
    public void sacarDinero(double reintegro) { // reintegro = dinero a retirar
        if (saldo >= reintegro) {
            // quitamos el dinero de la cuenta
            this.saldo = this.saldo - reintegro; // el nuevo saldo es el que teníamos menos el reintegro
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    /**
     * Ingresar dinero: se incrementa el saldo.
     * @param ingreso
     */
    public void ingresarDinero(double ingreso) {
        this.saldo = this.saldo + ingreso;
    }

    /**
     * Mostrar información: muestra la información disponible de la cuenta corriente.
     */
    public void mostrarInformacion() {
        System.out.println(this.DNI + " - " + this.titular + " - saldo =" + this.saldo + "€");
    }
}
