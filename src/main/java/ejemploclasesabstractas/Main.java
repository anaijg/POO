package ejemploclasesabstractas;

public class Main {
    public static void main(String[] args) {

        //Mascota es abstracta , no se puede instanciar.
        //gato ya hereda de mascota, ya se puede instanciar.

        Gato gato1 = new Gato("tom ", 5);

        //el polimorfismo sigue funcionando
        //declaro una mascota pero instancio un gato
        Mascota gato = new Gato("Garfiel", 34);
        gato.dice();
        gato.seMueve();


        Perro perro = new Perro("Scooby Doo", 18);
        perro.dice();
        perro.seMueve();


    }
}
