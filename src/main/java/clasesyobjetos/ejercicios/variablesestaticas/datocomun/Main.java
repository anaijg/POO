package clasesyobjetos.ejercicios.variablesestaticas.datocomun;

public class Main {
    public static void main(String[] args) {
        Clima clima1 = new Clima();
        Clima clima2 = new Clima();
        Clima clima3 = new Clima();
        Clima clima4 = new Clima();

        // ahora cambiamos la temperatura de cada objeto

        clima1.actualizarTemperatura(5);
        clima2.actualizarTemperatura(-15);
        clima3.actualizarTemperatura(20);
        clima4.actualizarTemperatura(0);

        // cuánto vale en este punto la variable temperaturaGlobal
        System.out.println(Clima.temperaturaGlobal);// 0
    }
}
