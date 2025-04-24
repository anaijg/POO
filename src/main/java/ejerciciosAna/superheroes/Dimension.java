package ejerciciosAna.superheroes;

/**
 * Define un grupo de medidas de un objeto
 */
public class Dimension {
    // Propiedades
    //Contiene las siguientes propiedades (todas ellas double):
    // Alto. Medida correspondiente al alto del objeto.
    private int alto;
    // Ancho. Medida correspondiente al ancho del objeto.
    private int ancho;
    // Profundidad. Medida correspondiente a la profundidad del objeto.
    private int profundidad;

    // Constructores
    //Haga un constructor sin parámetros que inicialice todas las propiedades a
    //0.
    public Dimension() {
        this.alto = 0;
        this.ancho = 0;
        this.profundidad = 0;
    }
    //Haga un constructor que reciba como parámetro un alto, un ancho y una
    //profundidad y asigne los valores a sus respectivas propiedades.

    public Dimension(int alto, int ancho, int profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    // Métodos get y set
    //Programe los get y set para cada propiedad.

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    // Métodos de cálculo
    //Programe un método llamado getVolumen() que devuelva el volumen
    //máximo que ocuparía el objeto (alto x ancho x profundidad)
    public int getVolumen() {
        return alto * ancho * profundidad;
    }

    // Método toString
    //Programe el método toString de forma que devuelva una cadena con el
    //alto, ancho, profundidad y volumen máximo del objeto.


    @Override
    public String toString() {
        return "Dimension{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", profundidad=" + profundidad +
                '}';
    }
}
