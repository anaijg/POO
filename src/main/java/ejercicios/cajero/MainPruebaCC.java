package ejercicios.cajero;

public class MainPruebaCC {
    public static void main(String[] args) {
        CuentaCorriente cc1 = new CuentaCorriente("00000001X", "Perico Palotes");
        // ingresamos 5000 euros
        cc1.ingresarDinero(5000);
        cc1.mostrarInformacion();
        cc1.sacarDinero(10000);
        cc1.mostrarInformacion();
        cc1.sacarDinero(1250);
        cc1.mostrarInformacion();
        // TODO crear dos objetos, uno con cada uno de los constructores del punto (sobrecarga...)
        

    }
}
