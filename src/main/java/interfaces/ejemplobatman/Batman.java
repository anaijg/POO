package interfaces.ejemplobatman;

public class Batman implements Mover{
    @Override
    public void pasoAdelante() {
        System.out.println("\uD83E\uDD87");
        System.out.println("^");
        System.out.println("|");

    }

    @Override
    public void giroIzquierda() {
        System.out.println("<-\uD83E\uDD87");

    }

    @Override
    public void giroDerecha() {
        System.out.println("->\uD83E\uDD87");

    }
}
