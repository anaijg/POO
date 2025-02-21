package EjemploContructor;

import java.util.ArrayList;
import java.util.Random;

public class Pokemon {

    private ArrayList<String> tipos;
    private String nombre;
    private String region; //la region no cambia no hace falta setter, ni shiny
    private int numeroPokedex;
    private boolean shiny;
    private int nivel;


    public ArrayList<String> getTipos() {
        return tipos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPokedex() {
        return numeroPokedex;
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

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "tipos=" + tipos +
                ", nombre='" + nombre + '\'' +

                ", numeroPokedex=" + numeroPokedex +
                ", nivel=" + nivel +
                '}';
    }





    //Constructores

    /**
     *
     * @param tipos
     * @param nombre
     * @param numeroPokedex
     */
    public Pokemon(ArrayList<String> tipos, String nombre, int numeroPokedex) {
        this.tipos = tipos;
        this.nombre = nombre;
        this.numeroPokedex = numeroPokedex;
        //el nivel lo generamos dentro del constructor ya que puede ser aleatorio
        this.nivel = new Random().nextInt(36,101);
    }


    public int getNivel() {
        return nivel;







    }
}
