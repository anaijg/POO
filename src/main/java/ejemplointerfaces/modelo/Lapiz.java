package ejemplointerfaces.modelo;

public class Lapiz extends Herramienta implements Dibujable{
    public Lapiz(int grosor, String color) {
        super(grosor, color);
    }


    @Override
    public void diubujarRecta() {

    }

    @Override
    public void dibujarCurva() {

    }

    @Override
    public void dibujarLibre() {

    }
}

