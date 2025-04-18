package clasesyobjetos.ejemploconstructores;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // normalmente no nos interesa el constructor por defecto.
        //Pokemon pikachu = new Pokemon();
        //System.out.println(pikachu);
        ArrayList<String> tipoPikchu = new ArrayList<>();
        tipoPikchu.add("electrico");
        Pokemon pikachu = new Pokemon(tipoPikchu, "Pikachu", 25);
        System.out.println(pikachu);

        // charizard, fuego volador, 6
        ArrayList<String> tipocharizard = new ArrayList<>();
        tipocharizard.add("fuego");
        tipocharizard.add("volador");
        Pokemon pikachu2 = new Pokemon(tipocharizard, "Charizard", 6);
        System.out.println(pikachu2);



    }
}
