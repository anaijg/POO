package clasesyobjetos.ejercicios.superheroes;

/**
 * CLASE figura
 * esta clase representara una figura de un superheroe
 */

public class Figura {
    //propiedades
    //Codigo. cada figura tiene un codigo identificativo formado por letras y numeros --> dos figuras distintas no tendran el mismo codigo ( hasta que no veamos la forma de personalizar
    private String codigo;
    private double precio;
    private SuperHeroe superHeroe;
    private  Dimension dimension;

    //constructor


    public Figura(String codigo, double precio, SuperHeroe superHeroe, Dimension dimension) {
        this.codigo = codigo;
        this.precio = precio;
        this.superHeroe = superHeroe;
        this.dimension = dimension;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public SuperHeroe getSuperHeroe() {
        return superHeroe;
    }

    public void setSuperHeroe(SuperHeroe superHeroe) {
        this.superHeroe = superHeroe;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "codigo='" + codigo + '\'' +
                ", precio=" + precio +
                ", superHeroe=" + superHeroe +
                ", dimension=" + dimension +
                '}';
    }

    //metodo modificador adicional
    public void subirPrecio(double cantidad){
        this.precio = this.precio + cantidad;
    }
}
