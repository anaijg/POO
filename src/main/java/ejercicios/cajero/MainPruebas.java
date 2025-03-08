package ejercicios.cajero;

import ejercicios.banco.Cuenta;

public class MainPruebas {
    public static void main(String[] args) {
        CuentaCorriente cuentaCorriente = new CuentaCorriente("000000x", "Perico Pelotes");
        //ingresamos 5000 euros
        cuentaCorriente.ingresarDinero(5000);
        cuentaCorriente.mostrarInformacion();
        cuentaCorriente.sacarDinero(10000);
        cuentaCorriente.mostrarInformacion();
        cuentaCorriente.sacarDinero(1250);
        cuentaCorriente.mostrarInformacion();

        // TODO crear dos objetos, uno con cada uno de los constructores del punto( sobrecargas...
        


    }
}
