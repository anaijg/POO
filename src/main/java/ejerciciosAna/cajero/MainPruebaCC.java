package ejerciciosAna.cajero;

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

        // probamos si podemos acceder a los atributos
        System.out.println(cc1.titular); // ok, es public
        System.out.println(cc1.DNI); // ok, no tiene modificador y accedemos desde el mismo paquete
        //System.out.println(cc1.saldo); // no ok. saldo es private y no hemos añadido getter

        // TODO crear dos objetos, uno con cada uno de los constructores del punto (sobrecarga...)
        

    }
}
