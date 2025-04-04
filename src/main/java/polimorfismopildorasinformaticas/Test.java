package polimorfismopildorasinformaticas;

public class Test {
    public static void main(String[] args){

        Empleado empleado1 = new Empleado();
        Director director1 = new Director();



    }
}


class Empleado  {
    private String nombre;
    private int edad;
    private double salario;

    public void trabaja() {
        System.out.println("Realiza las tareas de un empleado");
    }


}

class Director {
    String nombre;
    private int edad;
    private double salario;
    private double incentivo;

    public void trabaja() {
        System.out.println("Realiza las tareas de un director");
    }
}