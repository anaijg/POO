package ejercicios.cajero;

public class CuentaCorriente {
    // que almacena los datos: DNI, NOMBRE DEL TITULAR, Y SALDO.
    private String DNI;
    private String titular;
    private double saldo;

    // constructor
    // crear una cuenta: se necesita el dni y nombre del titular, El saldo inicial sera a cero.
    public CuentaCorriente(String DNI, String titular) {
        this.DNI = DNI;
        this.titular = titular;
        this.saldo = 0;
    }

    //sobrecarga los cosntructores para poder crear objetos.
    // con el dni del titular de la cuenta y un saldo inicial. Como no tenemos titular, le asignaremos el valor "Anonimo".
    public CuentaCorriente(String DNI, double saldo) {
        this.DNI = DNI;
        this.saldo = saldo;
        this.titular = "Anonimo";
    }


    // con el dni, nombre y el saldo inicial.
    public CuentaCorriente(String DNI, String titular, double saldo) {
        this.DNI = DNI;
        this.titular = titular;
        this.saldo = saldo;
    }

    //metodos de instancia -> los que se llamaran desde un objeto de tipo cuenta.

    /**
     * Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operacion, si existe saldo suficiente.
     * @param reintegro
     */
    public  void sacarDinero(double reintegro){//reintegro = dinero a retirar
        if (saldo >= reintegro){
            //quitamos el dinero de la cuenta
            this.saldo = this.saldo - reintegro;// el nuevo saldo es el que teniamos menos el reintegro
        }else{
            System.out.println(" Saldo insuficiente ");
        }
    }



    /**
     * Ingresar dinero: se incrementa el saldo.
     * @param ingreso
     */
    public  void ingresarDinero(double ingreso  ){
        this.saldo = this.saldo + ingreso;
    }


    /**
     * Mostrar informacion : muestra la informacion disponible de la cuenta corriente.
     *
     */
    public void mostrarInformacion(){
        System.out.println(this.DNI + " - " + this.titular + " - saldo " + this.saldo + " €");
    }
}
