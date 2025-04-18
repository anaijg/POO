package clasesyobjetos.ejercicios.banco;

public class MainPruebas {
    public static void main(String[] args) {
        //Instancia de la clase Usuario llamada propietario
        Usuario propietario = new Usuario("demo", "Ale", "Chim Pom");
        System.out.println(propietario);

        //Instancia(es decir crea un objeto d de la clase cuenta
        Cuenta cuenta1 = new Cuenta("123456", 1000, propietario);

        //llamamos al metodo mostrar cuenta.
        mostrarCuenta(cuenta1);
    }

    //crear un metodo para mostrar datos de la cuenta

    public static void mostrarCuenta(Cuenta cuenta1){
        System.out.println("\nInformación de la cuenta: ");
        System.out.println(cuenta1);
    }
}
