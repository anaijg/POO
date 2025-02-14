package ejemploConstructores;

import java.util.ArrayList;
import java.util.Random;

public class Pokemon {
    private ArrayList<String> tipo; // agua, metal, fuego, planta... por que un mismo pokemon puede tener mas de un tipo segun evolucione
    private String nombre;
    private int numeroPokedex;
    private int xp;

    public ArrayList<String> getTipo() {
        return tipo;
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

    public void setTipo(ArrayList<String> tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    //construcores

    /**
     * Al crear un pokemon tenemos que indicar;
     * @param tipo
     * @param nombre
     * @param numeroPokedex
     * pero la xp sera un numero aleatorio entre 20 y 250
     */



    public Pokemon(ArrayList<String> tipo, String nombre, int numeroPokedex) {
        //this.atributo = argumento
        this.tipo = tipo;
        this.nombre = nombre;
        this.numeroPokedex = numeroPokedex;
        // la xp la generamos dentro del constructor
        this.xp = new Random().nextInt(20,251);


    }
}
