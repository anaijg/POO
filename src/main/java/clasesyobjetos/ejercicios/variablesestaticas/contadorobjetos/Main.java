package clasesyobjetos.ejercicios.variablesestaticas.contadorobjetos;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("A");
        System.out.println("Tenemos " + Persona.contadorPersonas + " objetos");
        System.out.println(persona1.contadorFull);

        Persona persona2 = new Persona("B");
        System.out.println("Tenemos " + Persona.contadorPersonas + " objetos");
        System.out.println(persona2.contadorFull);

        Persona persona3 = new Persona("C");
        System.out.println("Tenemos " + Persona.contadorPersonas + " objetos");
        System.out.println(persona3.contadorFull);
    }
}
