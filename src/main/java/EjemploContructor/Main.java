package EjemploContructor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> tipoPikachu = new ArrayList<>();
        tipoPikachu.add("electrico");
        Pokemon pikachu = new Pokemon(tipoPikachu, "Pikachu", 25);
        System.out.println(pikachu);


        ArrayList<String> tipoCharizard = new ArrayList<>();
        tipoCharizard.add("Fuego");
        tipoCharizard.add("Volador");
        Pokemon Charizard = new Pokemon(tipoCharizard, "Charizard", 6);
        System.out.println(Charizard);
    }

}
