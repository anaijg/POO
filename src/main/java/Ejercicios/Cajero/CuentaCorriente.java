package Ejercicios.Cajero;

public class CuentaCorriente {
    private String DNI;
    private String titular;
    private double saldo;

    public CuentaCorriente(String DNI, String titular) {
        this.DNI = DNI;
        this.titular = titular;
        this.saldo = 0;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "DNI='" + DNI + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
    //metodo de instancia --> los que se llamaran desde un objeto de tipo cuenta
    //Sacar dinero: el metodo debe indicar si ha sido posible llevar a cabo la operacion

    public void sacarDinero(double retirarCantidad){
        if (saldo >= retirarCantidad) {
            this.saldo = this.saldo - retirarCantidad;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void  ingresarDinero(double ingreso) {
        this.saldo += ingreso;
    }

    public void mostrarInformacion() {
        System.out.println(this.DNI + " - " + this.titular + " - saldo = " + this.saldo + "€");
    }
}
