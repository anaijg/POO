package Ejercicios.Cajero;

public class MainPruebaCuenta {
    public static void main(String[] args) {
        CuentaCorriente cc1 = new CuentaCorriente("98765432B", "Perico Palotes");
        //ingresamos 5000 euros
        cc1.depositarDinero(5000);
        cc1.mostrarInformacion();
        System.out.println();
        cc1.sacarDinero(10000);
        System.out.println();
        cc1.sacarDinero(1250);
    }
}
