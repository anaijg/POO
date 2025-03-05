package ejerciciosPooJeremias.cajero;

public class CuentaCorriente {
    String dni, nombreTitular;
    double saldo;

    //Constructor 1
    //Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0
    public CuentaCorriente(String dni, String nombreTitular) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        // Saldo inicial = 0.
        this.saldo = 0;
    }

    //Constructor 2
    //Con el DNI, nombre y el saldo inicial.
    public CuentaCorriente(String dni, String nombreTitular, double saldo){
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }


    //Setters
    //Sacar dinero: el méto_do debe indicar si ha sido posible llevar a cabo la operación, si existe saldo suficiente
    public void sacarDinero(double saldo){
        if (this.saldo> saldo){
                this.saldo -= saldo;
                System.out.println("La extracion de " + saldo + " fue exitosa");
        }else {
            System.out.println("No se puede realizar esta operación");
        }
    }

    //Ingresar dinero: se incrementa el saldo.
    public void ingresarDinero(double saldo){
        this.saldo = saldo;
    }


    //Mostrar información: muestra la información disponible de la cuenta corriente.
    @Override
    public String toString() {
        return "Informacion Cuenta Corriente: \n" +
                "dni='" + dni + '\'' +
                "\nNombre Titular='" + nombreTitular + '\'' +
                "\nSaldo=" + saldo ;
    }
}
