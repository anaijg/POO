package ejemploConstructores;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //normalmente no nos interesa el constructor por defecto
        ArrayList<String> tipoPikachu = new ArrayList<>();
        tipoPikachu.add("Eléctrico");
        Pokemon pikachu = new Pokemon(tipoPikachu,"Pikachu", 25);
        System.out.println(pikachu);

        ArrayList<String> tipoCharizard = new ArrayList<>();
        tipoCharizard.add("Fuego");
        tipoCharizard.add("Volador");
        Pokemon charizard = new Pokemon(tipoCharizard,"Charizard", 6);
        System.out.println(charizard);

    }
}
