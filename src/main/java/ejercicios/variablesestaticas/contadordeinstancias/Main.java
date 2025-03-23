package ejercicios.variablesestaticas.contadordeinstancias;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("pablo");
        System.out.println("tenemos " + Persona.getContadorPersona() + " objeto");
        Persona persona2 = new Persona("maria");
        System.out.println("Tenemos " + Persona.getContadorPersona() + " objeto");
        Persona persona3 = new Persona("laura");
        System.out.println("Tenemos " + Persona.getContadorPersona() + " objeto");

    }
}
