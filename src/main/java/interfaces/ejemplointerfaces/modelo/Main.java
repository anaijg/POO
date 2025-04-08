package interfaces.ejemplointerfaces.modelo;

import interfaces.ejemplointerfaces.ContenidoInterfaz;

public class Main implements ContenidoInterfaz {
    @Override
    public void metodoAbstracto() {
        System.out.println("Desarrollo el método abstracto en la clase que implementa la interfaz.");
    }

    public static void main(String[] args) {
        Main objeto = new Main();
        objeto.metodoAbstracto();
        objeto.metodoPorDefecto();
        // método estático: debe ser llamado con referencia a la clase
        ContenidoInterfaz.metodoEstatico();

    }
}
