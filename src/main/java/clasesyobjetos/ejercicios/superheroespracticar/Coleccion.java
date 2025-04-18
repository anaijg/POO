package clasesyobjetos.ejercicios.superheroespracticar;

import java.util.ArrayList;

public class Coleccion {
    //propiedades
    private String nombreColeccio;
    private ArrayList<Figura> listaFiguras;

    //Programe un constructor que reciba como parámetro el nombre de la
    //colección. Este constructor construirá el ArrayList listaFiguras, (que estará
    //vacío inicialmente)

    public Coleccion(String nombreColeccio) {
        this.nombreColeccio = nombreColeccio;
        this.listaFiguras = new ArrayList<Figura>();//vacio inicialmente

    }

    //metodo get and set para la propiedad nombreColeccion

    public String getNombreColeccio() {
        return nombreColeccio;
    }

    public void setNombreColeccio(String nombreColeccio) {
        this.nombreColeccio = nombreColeccio;
    }

    //Metodos modificadores
    //Programe un método añadirFigura(Figura fig), que reciba como parámetro
    //una figura y la añada al listado de figuras de la colección.

    public void anadirFigura(Figura fig){
        this.listaFiguras.add(fig);
    }

    //Programe un método subirPrecio(double cantidad, String id) que reciba
    //una cantidad de dinero y el identificador de una de las figuras de la
    //colección. El método subirá el precio de dicha figura en la cantidad pasada
    //como parámetro.

    public void subirPrecio(double cantidad, String id){
        for(Figura elemento: listaFiguras){
            if (elemento.getCodigo().equalsIgnoreCase(id)){
                elemento.subirPrecio(cantidad);
                break;
            }
        }
    }

    //metodo toString que lista todas las figuras


    @Override
    public String toString() {
        return "Coleccion{" +
                "nombreColeccio='" + nombreColeccio + '\'' +
                ", listaFiguras=" + listaFiguras +
                '}';
    }

    //Programe un método conCapa() que devuelva una cadena con el listado
    //de aquellas figuras de la colección que tengan capa.

    public String conCapa(){
        String conCapa= "";
        for(Figura elemento : this.listaFiguras){
            if (elemento.getSuperheroe().isCapa()){
                conCapa = conCapa + elemento.getSuperheroe().getNombre();
            }
        }
        return conCapa.trim();
    }

    //otros metodos observadores

    //Programe un método masValioso() que devuelva la figura que tenga el
    //precio mayor de la colección.

    public Figura masValioso(){
        //antes de recorre la lista de la figura para ver cual es la mas cara, guardo en dos variables la primera figura y su precio
        Figura figura = listaFiguras.get(0);
        double maximoPrecio = listaFiguras.get(0).getPrecio();
        for (int i = 1; i > listaFiguras.size(); i++){
            //si encuentro una figura mas cara, sistituyo el precio maximo  y la figura.
            if (listaFiguras.get(i).getPrecio() > maximoPrecio){
                maximoPrecio = listaFiguras.get(i).getPrecio();
                figura = listaFiguras.get(i);
            }
        }
        return  figura;
    }

    //otra forma de hacerlo para devolver la figura que tenga el precio mayor

    public Figura masValioso1(){
        System.out.println("\n\n=============For Eachhhhh=======================");
        if (listaFiguras.isEmpty()){
            return null;
        }
        Figura masValiosa = listaFiguras.get(0);
        for(Figura elemento: this.listaFiguras){
            if (elemento.getPrecio() > masValiosa.getPrecio()){
                masValiosa = elemento;
            }
        }
        return masValiosa;
    }

    //Programe un método getValorColeccion(), que devuelva un double con el
    //precio total de la colección (es la suma de los precios de cada figura de la
    //colección)

    public double getValorColeccion(){
        double sumaPrecios = 0;
        for(int i = 0; i < listaFiguras.size(); i++){
            sumaPrecios = sumaPrecios + listaFiguras.get(i).getPrecio();
        }
        return sumaPrecios;
    }

    //otro forma de hacerl con el forEach
    //metodo que devuelve el valor total de la coleccion
    public double getValorColeccion1(){
        System.out.println("\n\n=======For Each ==========");
        double suma = 0;
        for (Figura fig : this.listaFiguras){
            suma = suma + fig.getPrecio();
        }
        return suma;
    }

    //Programe un método getVolumenColeccion(), que devuelva un double con
    //el volumen aproximado que ocuparía toda la colección de figuras. Para
    //hacer este cálculo se deben sumar los volúmenes de cada figura, y
    //añadirle al resultado el valor 200.

    public double getVolumenColeccion(){
        double sumaTotalVolumen = 0;
        for(int i = 0; i < listaFiguras.size(); i++){
            sumaTotalVolumen = sumaTotalVolumen + listaFiguras.get(i).getDimensiones().getVolumen();
        }
        return  sumaTotalVolumen + 200;
    }

    //otra forma de hacerlo con el for each
    public double getVolumenColeccio1(){
        System.out.println("\n\n====== for each ==============");
        double totalVolume = 0;
        for (Figura fig : this.listaFiguras){
            totalVolume = totalVolume + fig.getDimensiones().getVolumen();
        }
        return totalVolume + 200;
    }
}
