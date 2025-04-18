package interfaces.ejemplointerfaces.modelo;

import interfaces.ejemplointerfaces.ContenidoInterfaz;

public class App implements ContenidoInterfaz {

    @Override
    public void metodoAabstracto() {
        System.out.println("Desarrollo el método por defecto en la clase que implementa la interfaz");
    }

    public static void main(String[] args) {
        App objeto = new App();
        objeto.metodoAabstracto();
        objeto.metodoPorDefecto();
        //método estático: debe ser llamado con referencia a la clase.
        ContenidoInterfaz.metodoEstatico();

    }
}
