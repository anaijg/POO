package interfaces.ejemplobatman;

public interface Mover  {
    public void pasoAdelante();
    public void giroIzquierda();
    public void giroDerecha();

    //método por defecto
    default void darseLaVuelta(){
        giroDerecha();
        giroDerecha();
    }
}
