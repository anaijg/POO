package ejemploConstructores;

import java.util.ArrayList;
import java.util.Random;

public class Pokemon {
    private ArrayList<String> tipo;
    private String nombre;
    private int numeroPokedex;
    private int xp;

    /**
     *
     * @param tipo
     * @param nombre
     * @param numeroPokedex
     * experiencia será un número aleatorio 20 y 250
     */
    public Pokemon(ArrayList<String> tipo, String nombre, int numeroPokedex) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.numeroPokedex = numeroPokedex;
        //la experiencia la generamos dentro del constructor
        this.xp = new Random().nextInt(20,251);
    }

    public ArrayList<String> getTipo() {
        return tipo;
    }

    public void setTipo(ArrayList<String> tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getNumeroPokedex() {
        return numeroPokedex;
    }

    public void setNumeroPokedex(int numeroPokedex) {
        this.numeroPokedex = numeroPokedex;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "tipo=" + tipo +
                ", nombre='" + nombre + '\'' +
                ", numeroPokedex=" + numeroPokedex +
                ", xp=" + xp +
                '}';
    }

}
