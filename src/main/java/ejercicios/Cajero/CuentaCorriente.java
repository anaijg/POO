package ejercicios.Cajero;

import java.util.Scanner;

public class CuentaCorriente {
    String dni;
    public String nombreTitular;
    private double saldo;
    private static Scanner sc = new Scanner(System.in);
    private String nombreBanco;
    private Gestor gestor;

    public CuentaCorriente(String dni, String nombreTitular, double saldo, Gestor gestor) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.nombreBanco = "laCaixa";
        this.gestor = gestor;
    }

    public CuentaCorriente(String dni, double saldo,Gestor gestor) {
        this.dni = dni;
        this.nombreTitular = "Anónimo";
        this.saldo = saldo;
        this.nombreBanco = "laCaixa";
        this.gestor = gestor;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "dni='" + dni + '\'' +
                ", nombreTitular='" + nombreTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    /**
     * public static CuentaCorriente crearCuenta(){
     *         System.out.println("Introduce en este orden: DNI, nombre titular y saldo.");
     *         return new CuentaCorriente(sc.nextLine(), sc.nextLine(), 0);
     *     }
     * public static CuentaCorriente crearCuenta(){
     *         System.out.println("Introduce en este orden: DNI,y saldo.");
     *         return new CuentaCorriente(sc.nextLine(),0);
     *     }
     */

    public void cambiarGestor(Gestor nuevoGestor) {
        this.gestor = nuevoGestor;
    }

    public Gestor consultarGestor() {
        return gestor;
    }

    public void sacarDinero(){
        double dineroSacar;
        System.out.println("Cuanto dinero desea sacar: ");
        dineroSacar = sc.nextDouble();
        if (dineroSacar > saldo){
            System.out.println("No se puede sacar ese dinero. No dispone del saldo suficiente.");
        } else {
            setSaldo(getSaldo() - dineroSacar);
            System.out.println("Dinero sacado correctamente.");
        }
    }

    public void ingresarDinero(double dineroIngresar){
        System.out.println("Cuanto dinero desea ingresar:");
        this.saldo = this.saldo + dineroIngresar;
    }

    public void mostrarInformacion(){
        System.out.println("DNI: " + dni);
        System.out.println("Nombre del Titular: " + nombreTitular);
        System.out.println("Saldo: " + saldo);
    }
}
