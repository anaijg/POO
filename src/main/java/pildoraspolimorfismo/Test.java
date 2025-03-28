package pildoraspolimorfismo;

public class Test {
    public static void main(String[] args) {
        // creo un objeto empleado y un objeto director
        Empleado empleado1 = new Empleado();
        Director director1 = new Director();

        empleado1.trabajar();
        director1.trabajar();

        // Principio de sustitución: como un director es siempre un director, puedo meter un director "dentro" de un empleado, pero no al revés
        Empleado empleado2 = new Director();
        empleado2.trabajar(); // nuestro objeto de tipo empleado se comporta como un director
        //Director director2 = new Empleado();

        // moraleja:
        // Superclase sp = new Subclase(); y no al revés

        System.out.println();

        // para ver de qué tipo es empleado2
        System.out.println(empleado2.getClass().getSimpleName()); // me dice que pertenece a la clase director

        //enlazado dinámico
        // cuando quieres agrupar varios empleados en un array para almacenar empleados
        Empleado[] empleados = new Empleado[5];
        empleados[0] = new Empleado();
        empleados[1] = new Empleado();
        empleados[2] = new Empleado();
        empleados[3] = new Director(); // lo puedo hacer por el principio de sustitución
        empleados[4] = new Empleado();

        for (Empleado objeto: empleados) {
            objeto.trabajar(); // enlazado dinámico: en tiempo de ejecución es capaz de enlazar con un método u otro (el de la clase Empleado o el de la clase Director)
        }

        // ampliación: sí que podríamos hacer una conversión
        int numero = 3;
        double otroNumero = numero; // ok, porque estoy metiendo 32 bits en 64 bits del double
        numero = (int) otroNumero;

        Director director3 = (Director) empleado2;
    }
}

class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public void trabajar() {
        System.out.println("Realizo las tareas típicas de un empleado.");
    }
}

class Director extends Empleado{
    private String nombre;
    private int edad;
    private double salario;
    private double incentivo;

    public void trabajar() {
        System.out.println("Realizo las tareas típicas de un director.");
    }
}


