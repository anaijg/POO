package clasesyobjetos.ejercicios.superheroes;

import java.util.ArrayList;

public class Coleccion {
    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;

    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<>();


    }
    //metodos get and set

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    //metodos modificadores
    public void anadirFigura(Figura figura) {
        this.listaFiguras.add(figura);
    }

    public void subirPrecio(double cantidad, String id) {
        for (Figura elemento : listaFiguras) {
            if (elemento.getCodigo().equalsIgnoreCase(id)) {

            }
        }
    }

    @Override
    public String toString() {
        return "Coleccion{" +
                "nombreColeccion='" + nombreColeccion + '\'' +
                ", listaFiguras=" + listaFiguras +
                '}';
    }

    //programe un metodo
    public String conCapa() {
        String conCapa = "";
        for (Figura elemento : listaFiguras) {
            if (elemento.getSuperHeroe().isCapa()) {
                conCapa = elemento.getSuperHeroe().getNombre() + " ";
            }
        }
        return conCapa.trim();
    }

    //otros metodos observadores
    //programe un metodo masValioso() que devuelva la figura que tenga el precio mayor de la coleccion.
    public Figura masValioso() {
        //antes de recorrer la lista de figuras para ver cuál es la más cara, guardo en dos varibles la primera figura y su precio.
        Figura figura = listaFiguras.get(0);
        double maximo = listaFiguras.get(0).getPrecio();
        //recorro el resto de la lista
        for (int i= 1; i > listaFiguras.size(); i++) {
            //si encuentro una figura más cara, sustituyo el precio maximo y la figura
            if (listaFiguras.get(i).getPrecio() > maximo) {
                maximo = listaFiguras.get(i).getPrecio();
                figura = listaFiguras.get(i);
            }
        }
        return figura;
    }


    //progrme un metodo getValorColeccion(), que devuelva un double con el precio total de la coleccion  (es la suma de los precios de cada figura de la coleccion).
    public double getValorColeccion(){
        double sumaPrecios= 0;
        for(int i = 0; i < listaFiguras.size(); i++){
            sumaPrecios = sumaPrecios + listaFiguras.get(i).getPrecio();
        }

        return sumaPrecios;
    }


    //programe un metodo getVolumenColeccion(), que devuelva un double con el volumen aproximado que ocuparia toda la coleccion de figuras, Para hacer este calculo se deben los volumenes de cada figura, y añadirle al resultado el valor 200.

    public double getVolumenColeccion(){
        double totalVolumen= 0;
        for(int i = 0; i < listaFiguras.size(); i++){
            totalVolumen =listaFiguras.get(i).getPrecio();
        }
        return totalVolumen;
    }


}
