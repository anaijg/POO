package ejerciciosdaniel.variablesestaticas.datocomun;

/**
 * Crea una clase Clima que tenga un atributo estático temperaturaGlobal. Este valor debe poder modificarse mediante un método actualizarTemperatura(double nuevaTemperatura) y consultarse con obtenerTemperatura(). Luego, crea varios objetos Clima y comprueba que todos reflejan el mismo valor de temperatura.
 */

public class Clima {
    static double temperaturaGloval = 30.0;



    static double actualizarTemperatura(double nuevaTemperatura) {
        return nuevaTemperatura;
    }


    static Clima obtenerTemperatura(Clima clima) {
        System.out.println(temperaturaGloval);
        return clima;
    }
}
class Main {
    public static void main(String[] args) {
        Clima clima1 = new Clima();
        Clima.obtenerTemperatura(clima1);
        Clima.actualizarTemperatura(50.0);
        Clima clima2 = new Clima();
        Clima clima3 = new Clima();
    }
}