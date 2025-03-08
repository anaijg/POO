package ejercicios.cajero;

public class CuentaCorriente {
    // que almacena los datos: DNI, NOMBRE DEL TITULAR, Y SALDO.
    String DNI;
    public String titular;
    private double saldo;

    //atributo statico
    public static String nombreBanco;

    public static String getNombreBanco() {
        return nombreBanco;
    }

    public static void setNombreBanco(String nombreBanco) {
        CuentaCorriente.nombreBanco = nombreBanco;
    }

    //objeto gestor asociado
    private Gestor gestor;

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

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
     *
     * @param cantidad
     */
    // Método para sacar dinero. Devuelve true si la operación es posible.
    public boolean sacarDinero(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }


    /**
     * Ingresar dinero: se incrementa el saldo.
     *
     * @param ingreso
     */
    public void ingresarDinero(double ingreso) {
        this.saldo = this.saldo + ingreso;
    }


    /**
     * Mostrar informacion : muestra la informacion disponible de la cuenta corriente.
     */
    public void mostrarInformacion() {
        System.out.println("DNI: " + DNI);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Banco: " + nombreBanco);
        if (gestor != null) {
            System.out.println("Gestor: " + gestor);
        } else {
            System.out.println("Gestor: No asignado");
        }
    }
}

