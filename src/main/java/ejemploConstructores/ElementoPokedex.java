package ejemploConstructores;

public class ElementoPokedex {
    private int numero;
    private String nombre;

    public ElementoPokedex(Pokemon pokemon) {
        this.numero = pokemon.getNumeroPokedex();
        this.nombre = pokemon.getNombre();
    }



}
