package ejerciciosAna.superheroes;

import java.util.ArrayList;

/**
 * La empresa vende a veces colecciones de figuras, que básicamente son
 * conjuntos de figuras con una temática relacionada. Por ejemplo una
 * colección “El Hombre Murciélago” que consta de una serie de figuras
 * relacionadas con Batman, o una colección “Marvel”, con figuras de
 * superhéroes de Marvel, etc…
 */
public class Coleccion {
    // Propiedades
    //Las colecciones estarán descritas por la clase Colección, que tiene las
    //siguientes propiedades:
    // nombreColeccion, que será el nombre de la colección (“El Hombre
    //Murciélago”, “Marvel”, etc.)
    private String nombreColeccion;
    // Un objeto listaFiguras, que será un ArrayList que contendrá las
    //distintas figuras que forman la colección.
    private ArrayList<Figura> listaFiguras;

    // Constructor
    //Programe un constructor que reciba como parámetro el nombre de la
    //colección. Este constructor construirá el ArrayList listaFiguras, (que estará
    //vacío inicialmente)

    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<>();
    }

    // Metodos get y set
    //Programe un get y set para la propiedad nombreColeccion.

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    // Métodos modificadores
    //Programe un método añadirFigura(Figura fig), que reciba como parámetro
    //una figura y la añada al listado de figuras de la colección.
    public void añadirFigura(Figura fig) {
        this.listaFiguras.add(fig);
    }

    //Programe un método subirPrecio(double cantidad, String id) que reciba
    //una cantidad de dinero y el identificador de una de las figuras de la
    //colección. El método subirá el precio de dicha figura en la cantidad pasada
    //como parámetro.
    public void subirPrecio(double cantidad, String id) {
        for (Figura elemento: listaFiguras) {
            if (elemento.getCodigo().equalsIgnoreCase(id)) {
                elemento.subirPrecio(cantidad);
            }
        }
    }

    // Método toString y similares
    //Programe el método toString, de forma que devuelva una cadena con el
    //listado de todas las figuras de la colección con todas las características de
    //cada uno.

    @Override
    public String toString() {
        return "Coleccion{" +
                "nombreColeccion='" + nombreColeccion + '\'' +
                ", listaFiguras=" + listaFiguras +
                '}';
    }

    //Programe un método conCapa() que devuelva una cadena con el listado
    //de aquellas figuras de la colección que tengan capa.
    public String conCapa() {
        String conCapa = "";
        for (Figura elemento: listaFiguras) {
            if (elemento.getSuperheroe().isCapa()) {
                conCapa += elemento.getSuperheroe().getNombre() + " ";
            }
        }
        return conCapa.trim();
    }

    // Otros métodos observadores
    //Programe un método masValioso() que devuelva la figura que tenga el
    //precio mayor de la colección.
    public Figura masValioso() {
        // antes de recorrer la lista de figuras para var cuál es la más cara, guardo en dos variables la primera figura y su precio
        Figura figura = listaFiguras.get(0);
        double maximo = listaFiguras.get(0).getPrecio();
        // recorro el resto de la lista;
        for (int i = 1; i > listaFiguras.size(); i++) {
            // si encuentro una figura más cara, sustituyo el precio máximo y la figura
            if (listaFiguras.get(i).getPrecio() > maximo) {
                maximo = listaFiguras.get(i).getPrecio();
                figura = listaFiguras.get(i);
            }
        }
        return figura;
    }
    //Programe un método getValorColeccion(), que devuelva un double con el
    //precio total de la colección (es la suma de los precios de cada figura de la
    //colección)
    public double getValorColeccion(){
        double sumaPrecios = 0;
        for (int i = 0; i < listaFiguras.size(); i++){
            sumaPrecios += listaFiguras.get(i).getPrecio();
        }
        return sumaPrecios;
    }

    //Programe un método getVolumenColeccion(), que devuelva un double con
    //el volumen aproximado que ocuparía toda la colección de figuras. Para
    //hacer este cálculo se deben sumar los volúmenes de cada figura, y
    //añadirle al resultado el valor 200.
    public double getVolumenColeccion(){
        double totalVolumen = 0;
        for (int i = 0; i < listaFiguras.size(); i++){
            totalVolumen += listaFiguras.get(i).getDimensiones().getVolumen();
        }
        return totalVolumen;
    }

}
