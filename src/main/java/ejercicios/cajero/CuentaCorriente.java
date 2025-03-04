package ejercicios.cajero;

public class CuentaCorriente { // public -> visible para las demás clases
    // que almacena los datos: DNI, nombre del titular y saldo.
    String DNI; // default package -> DNI sólo visible para clases del mismo paquete
    public String titular; // public -> titular visible para las demás clases
    private double saldo; // private -> saldo no es visible por las demás clases

    // Todas las cuentas corrientes con las que se va a trabajar pertenecen al mismo banco. Añadir un atributo que almacena el nombre del banco (que es único) en la clase CuentaCorriente. Diseñar un método que permita recuperar y modificar el nombre del banco.
    private String nombreBanco;

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    // Existen gestores que administran las cuentas bancarias y atienden a sus propietarios. Cada cuenta, en caso de tenerlo, cuenta con un único gestor.
    // Modificar la clase CuentaCorriente para que pueda disponer de un objeto Gestor. Escribir los métodos necesarios para consultar qué gestor tiene una cuenta corriente y también para poder cambiarlo..
    private Gestor gestor;

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    // constructor --> crear una cuenta
    // Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0.
    public CuentaCorriente(String DNI, String titular) {
        this.DNI = DNI;
        this.titular = titular;
        this.saldo = 0;
    }

    // Sobrecarga los constructores para poder crear objetos:
    //Con el DNI del titular de la cuenta y un saldo inicial.
    // Como no tenemos titular, le asignaremos el valor "Anónimo"

    public CuentaCorriente(double saldo, String DNI) {
        this.saldo = saldo;
        this.DNI = DNI;
        this.titular = "Anónimo";
    }


    //Con el DNI, nombre y el saldo inicial.

    public CuentaCorriente(String DNI, String titular, double saldo) {
        this.DNI = DNI;
        this.titular = titular;
        this.saldo = saldo;
    }


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
