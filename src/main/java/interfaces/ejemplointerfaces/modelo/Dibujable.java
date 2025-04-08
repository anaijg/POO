package interfaces.ejemplointerfaces.modelo;

public interface Dibujable {
    // metemos métodos abstractos que tienen que desarrollar las clases que la implementen
    // métodos abstractos: no hace falta que lleven la palabra abstract
    public void dibujarRecta();

    public void dibujarCurva();

    public void dibujarLibre();

}
