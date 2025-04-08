package interfaces.ejemplointerfaces;

public interface ContenidoInterfaz {
    int CONSTANTE = 0; /* esto es una constante, igual que si pusiera public static final int CONSTANTE = 0 */
    public void metodoAbstracto(); // la palabra abstract es opcional

    public default void metodoPorDefecto() {
        System.out.println("Hola desde el método por defecto de la interfaz");
        metodoPrivado();
    }

    //Métodos privados: Sólo se pueden llamar desde un método por defecto, no desde un método estático.
    private void metodoPrivado() {
        System.out.println("Método privado. Sólo puedo ser llamado desde otros métodos de la clase (en este caso, métodos por defecto)");
    }

    public static void metodoEstatico() {
        System.out.println("Método estático desarrollado en la interfaz.");
    }
}
