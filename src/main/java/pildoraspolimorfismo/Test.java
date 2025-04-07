package pildoraspolimorfismo;

public class Test {//Java es fuertemente tipado

    public static void main(String[] args) {

        //creo un objeto de empleado y otro objeto de director

        Empleado empleado1 = new Director();
        Director director1 = new Director();
        System.out.println(empleado1.getClass().getSimpleName());// me dice que pertenece a la clase director

        director1.trabajar();
        empleado1.trabajar();


        //principio de sustitucion : como un director es simpre un director, puedo meter un director dentro de un empleado, pero no al revés.


        Empleado[] losEmpleados = new Empleado[5];
        losEmpleados[0] = new Empleado();
        losEmpleados[1] = new Empleado();
        losEmpleados[2] = new Empleado();
        losEmpleados[3] = new Director();
        losEmpleados[4] = new Empleado();

        for (Empleado obj : losEmpleados) {
            obj.trabajar();//enlazado dinámico: en tiempo de ejecucion es capaz de enlazar
        }

        //ampliacion: si que podriamos hacer una conversión
        double numero = 3;
        double otroNumero = numero;//ok, porque estoy metiendo 32 bits en 64 bits del double.
        numero = (int) otroNumero;

        Director director3 = (Director) empleado1;
    }
}

class Empleado {
    String nombre;
    int edad;
    double salario;

    // metodo
    public void trabajar() {
        System.out.println("Realizo las tareas tipicas de un empleado");
    }
}

class Director extends Empleado {
    String nombre;
    int edad;
    double salario;
    private double incentivo;

    // metodo
    public void trabajar() {
        System.out.println("Realizo las tareas tipicas de un director");
    }
}
