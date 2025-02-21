package ejemploconstructores;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // normalmente no nos interesa el constructor por defecto
        //Pokemon pikachu = new Pokemon();
        //System.out.println(pikachu);
        ArrayList<String> tipoPikachu = new ArrayList<>();
        tipoPikachu.add("eléctrico");
        Pokemon pikachu = new Pokemon(tipoPikachu, "Pikachu", 25);
        System.out.println(pikachu);

        //charizard , fuego volador, 6
        ArrayList<String> tipoCharizard = new ArrayList<>();
        tipoCharizard.add("Fuego");
        tipoCharizard.add("volador");
        Pokemon charizard = new Pokemon(tipoCharizard, "Charizard", 6);
        System.out.println(charizard);
    }
}
