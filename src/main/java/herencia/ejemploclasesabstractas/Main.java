package herencia.ejemploclasesabstractas;

public class Main {
    public static void main(String[] args) {
        // mascota es abstracta, no se puede instanciar
        // sale una clase anónima
        /*
        Mascota mascota = new Mascota() {
            @Override
            public void dice() {

            }
        }*/
        // gato hereda de Mascota, ya se puede instanciar
        Gato gato = new Gato("Tom", 3);


        // el polimorfismo sigue funcionando,
        // declaro una mascota pero instancio un gato
        Mascota mascota = new Gato("Garfield", 5);
        gato.dice();
        gato.seMueve();

        Perro perro = new Perro("Scooby Doo", 6);
        perro.dice();
        perro.seMueve();
    }
}
