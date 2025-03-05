package ejercicios.FigurasSuperheroe;

import java.util.ArrayList;

public class Coleccion {
    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;

    public Coleccion(String nombreColeccion, ArrayList<Figura> listaFiguras) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<>();
    }

    public String getNombreColeccion(){
        return nombreColeccion;
    }

    public void setNombreColeccion(String nuevoNombreColeccion){
        this.nombreColeccion = nuevoNombreColeccion;
    }

    public void añadirFigura(Figura fig){
        this.listaFiguras.add(fig);
    }

    public void subirPrecio(double cantidad, String id){
        for (Figura figura : listaFiguras){
            if (figura.getCodigo().equalsIgnoreCase(id)){
                figura.añadirPrecio(cantidad);
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

    public String conCapa(){
        StringBuilder sb = new StringBuilder();
        for (Figura figura : listaFiguras){
            if (figura.getSuperheroe().isCapa()){
                sb.append(figura.getSuperheroe().getNombre());
                sb.append(", ");
            }
        }
        return sb.toString().trim();
    }

    public Figura masValiosa(){
        Figura figuraMax = listaFiguras.getFirst();
        double max = listaFiguras.getFirst().getPrecio();

        for (int i = 1; i < listaFiguras.size(); i++){
            if (listaFiguras.get(i).getPrecio() > max){
                figuraMax = listaFiguras.get(i);
            }
        }
        return figuraMax;
    }

    public double getValorColeccion(){
        double precioTotal = 0;
        for (Figura listaFigura : listaFiguras) {
            precioTotal += listaFigura.getPrecio();
        }
        return precioTotal;
    }

    public double getVolumenColeccion(){
        double volumenTotal = 0;
        for (Figura listaFigura : listaFiguras){
            volumenTotal += listaFigura.getDimensiones().getVolumen();
        }
        return volumenTotal + 200;
    }
}
