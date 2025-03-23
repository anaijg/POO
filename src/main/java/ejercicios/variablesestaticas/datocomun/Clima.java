package ejercicios.variablesestaticas.datocomun;

/**
 * Crea una clase Clima que tenga un atributo estático temperaturaGlobal. Este valor debe poder modificarse mediante un método actualizarTemperatura(double nuevaTemperatura) y consultarse con obtenerTemperatura(). Luego, crea varios objetos Clima y comprueba que todos reflejan el mismo valor de temperatura.
 */

public class Clima {
    public static double temperaturaGlobal;// común a todos los objetos de tipo clima

    //dejamos el constructor por defecto, que lo haga el compilador
    public  void actualizarTemperatura(double nuevaTemperatura) {
        temperaturaGlobal = nuevaTemperatura;
    }

    public  double obtenerTemperatura() {
        return temperaturaGlobal;
    }


}
