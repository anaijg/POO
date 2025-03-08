package ejercicios.superheroespracticar;

public class Dimension {

    //propiedades

    private double alto;
    private double ancho;
    private double profundidad;

    //Haga un constructor sin parámetros que inicialice todas las propiedades a
    //0.

    public Dimension() {
        this.alto = 0;
        this.ancho = 0;
        this.profundidad = 0;
    }

    //Haga un constructor que reciba como parámetro un alto, un ancho y una
    //profundidad y asigne los valores a sus respectivas propiedades.


    public Dimension(double alto, double ancho, double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    //Programe los get y set para cada propiedad.

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    //Programe un método llamado getVolumen() que devuelva el volumen
    //máximo que ocuparía el objeto (alto x ancho x profundidad)

    public double getVolumen() {
        return this.alto * this.ancho * this.profundidad;

    }

    //Metodo toString

    @Override
    public String toString() {
        return "Dimension{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", profundidad=" + profundidad +
                '}';
    }

}
