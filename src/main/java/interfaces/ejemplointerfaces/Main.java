package interfaces.ejemplointerfaces;

import interfaces.ejemplointerfaces.modelo.Lapiz;
import interfaces.ejemplointerfaces.modelo.Pincel;

public class Main {
    public static void main(String[] args) {
        Lapiz lapiz = new Lapiz(2, "rgb(255, 0, 0)");
        lapiz.dibujarLibre();
        Pincel pincel = new Pincel(5, "rgb(0,255,0)");
        pincel.dibujarLibre();



    }
}
