package Ejercicios.Cajero;

public class mainCajero {
    public static void main(String[] args) {
        CuentaCorriente cc1 = new CuentaCorriente("12345678X", "yo");
        cc1.ingresarDinero(5000);
        cc1.mostrarInformacion();
        cc1.sacarDinero(10000);
        cc1.sacarDinero(1200);
        cc1.mostrarInformacion();

    }
}
