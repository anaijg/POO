package ejemploconstructoresdaniel;

import java.util.ArrayList;

public class Pokedex {
    // tiene un array
    ArrayList<ElementoPokedex> pokedexes;

    public Pokedex() {
        this.pokedexes = pokedexes;
    }


    public void añadirElemento(ElementoPokedex elemento) {
        if (!pokedexes.contains(elemento)) {
            pokedexes.add(elemento);
        }
    }
}

