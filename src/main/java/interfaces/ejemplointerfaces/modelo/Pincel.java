package interfaces.ejemplointerfaces.modelo;

public class Pincel extends Herramienta implements Dibujable{
    public Pincel(int grosor, String color) {
        super(grosor, color);
    }


    @Override
    public void dibujarRecta() {
        System.out.println("recta con pincel");
    }

    @Override
    public void dibujarCurva() {
        System.out.println("curva con pincel");
    }

    @Override
    public void dibujarLibre() {
        System.out.println("libre con pincel");
    }
}
