package ejercicios.superheroespracticar;

public class Figura {
    //propiedades

    private String codigo;
    private double precio;

    //Un objeto dimensiones de la clase Dimensión que defina las
    //dimensiones del figura.
    private Dimension dimensiones;
    // Un objeto superhéroe de la clase Superhéroe que defina las
    //características del superhéroe representado.
    private Superheroe superheroe;

    //constructor que recibe todos los parametros

    public Figura(String codigo, double precio, Dimension dimensiones, Superheroe superheroe) {
        this.codigo = codigo;
        this.precio = precio;
        this.dimensiones = dimensiones;
        this.superheroe = superheroe;
    }

    //metodos set y get de cada propiedad

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

    public Dimension getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimension dimensiones) {
        this.dimensiones = dimensiones;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    //metodo toString

    @Override
    public String toString() {
        return "Figura{" +
                "codigo='" + codigo + '\'' +
                ", precio=" + precio +
                ", dimensiones=" + dimensiones +
                ", superheroe=" + superheroe +
                '}';
    }

    //Programe un método subirPrecio(double cantidad) que reciba una
    //cantidad de dinero. Este método subirá el precio actual de la figura en la
    //cantidad indicada como parámetro.

    public void subirPrecio(double cantidad){
        this.precio = this.precio + cantidad;
    }
}
