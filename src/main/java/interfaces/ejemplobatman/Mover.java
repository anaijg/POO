package interfaces.ejemplobatman;

public interface Mover {

    void pasoAdelante();

    void giraIzquierda();

    void giraDerecha();
    // método por defecto
    default void darseLaVuelta() {
        giraDerecha();
        giraDerecha();
    }

}
