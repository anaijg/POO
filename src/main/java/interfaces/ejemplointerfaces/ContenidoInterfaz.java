package interfaces.ejemplointerfaces;

public interface ContenidoInterfaz {
    int CONSTANTE = 0;// este es una constante

    public void metodoAabstracto();//la palabra abstract es opcional

    public default void metodoPorDefecto(){
        System.out.println("Hola desde el método por defecto de la interfaz");
        metodoPrivado();
    }

    // métodos privados: sólo se pueden llamar desde un método por defecto, no desde un método estatico.
    private void metodoPrivado(){
        System.out.println("Metodo privado. Sólo se puede ser llamado desde otros metodos de la clase en este caso, metodos por defecto");
    }

    public static void metodoEstatico(){
        System.out.println("metodo esático desarrollado en la interfaz");

    }
}
