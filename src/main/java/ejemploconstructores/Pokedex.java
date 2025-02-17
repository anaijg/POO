package ejemploconstructores;

import java.util.ArrayList;

public class Pokedex {
    ArrayList<ElementoPokedex> pokedex;

    public Pokedex() {
        this.pokedex = new ArrayList<>();
    }

    public void añadirElemento(ElementoPokedex elemento) {
        if (!pokedex.contains(elemento)) {
            pokedex.add(elemento);
        }
    }

    @Override
    public String toString() {
        return "Pokedex{" +
                "pokedex=" + pokedex +
                '}';
    }
}
