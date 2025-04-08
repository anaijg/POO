package interfaces.ejemplointerfaces.modelo;

public class Pincel extends Herramienta implements Dibujable{
    public Pincel(int grosor, String color) {
        super(grosor, color);
    }


    @Override
    public void dibujarRecta() {

    }

    @Override
    public void dibujarCurva() {

    }

    @Override
    public void dibujarLibre() {

    }
}
