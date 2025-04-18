package clasesyobjetos.ejemploconstructores;

import java.util.ArrayList;

public class Pokedex {
    //creamos un arraylist de elementos pokedex
    ArrayList<ElementoPokedex> pokedex;

    public Pokedex() {
        this.pokedex = new ArrayList<>();
    }

    public void anadirElemento ( ElementoPokedex elemento ) {
        if (!pokedex.contains(elemento)){
            pokedex.add(elemento);
        }
    }
}
