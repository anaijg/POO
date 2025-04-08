package clasesyobjetos.ejemploconstructores;

import java.util.ArrayList;
import java.util.Random;

public class Pokemon {
    private ArrayList<String> tipos; // agua, metal, fuego, planta..... // porque un mismo objeto pokemon puede tener más de un tipo
    private String nombre;
    private int numeroPokedex;
    private int xp;


    public ArrayList<String> getTipos() {
        return tipos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPokedex() {
        return numeroPokedex;
    }

    public int getXp() {
        return xp;
    }

    public void setTipos(ArrayList<String> tipos) {
        this.tipos = tipos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroPokedex(int numeroPokedex) {
        this.numeroPokedex = numeroPokedex;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "tipos=" + tipos +
                ", nombre='" + nombre + '\'' +
                ", numeroPokedex=" + numeroPokedex +
                ", xp=" + xp +
                '}';
    }

    // Constructores

    /**
     * Al crear un pokémon tenemos que indicar:
     * @param tipos
     * @param nombre
     * @param numeroPokedex
     * pero la experiencia será un número creado aleatoriamente entre 20 y 250
     */
    public Pokemon(ArrayList<String> tipos, String nombre, int numeroPokedex) {
        // this.atributo = argumento
        this.tipos = tipos;
        this.nombre = nombre;
        this.numeroPokedex = numeroPokedex;
        // la experiencia la generamos dentro del constructor
        this.xp = new Random().nextInt(20, 251);
    }
}
