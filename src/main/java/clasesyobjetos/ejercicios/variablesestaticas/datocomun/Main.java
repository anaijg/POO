package clasesyobjetos.ejercicios.variablesestaticas.datocomun;

public class Main {
    public static void main(String[] args) {
        Clima clima1 = new Clima(); // temperaturaGlobal = 0
        Clima clima2 = new Clima(); // temperaturaGlobal = 0
        Clima clima3 = new Clima(); // temperaturaGlobal = 0
        Clima clima4 = new Clima(); // temperaturaGlobal = 0
        Clima clima5 = new Clima(); // temperaturaGlobal = 0

        // Ahora cambiamos la temperatura en cada objeto

        clima1.actualizarTemperatura(5);
        clima2.actualizarTemperatura(-15);
        clima3.actualizarTemperatura(20);
        clima4.actualizarTemperatura(3);
        clima5.actualizarTemperatura(0);

        // cuánto vale en este punto la variable temperaturaGlobal
        System.out.println(Clima.temperaturaGlobal); // 0
    }
}
