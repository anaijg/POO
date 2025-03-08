package ejercicios.robot;

public class Robot {
    //Atributos de la clase
    private String nombre;
    private String modelo;
    private int duracion;

    //Un constructor sin parámetros que cree objetos de nombre “Anónimo” y modelo “Desconocido” (no modifica el valor por defecto de duración).

    public Robot() {
        this.nombre = "Anonimo";
        this.modelo = "Desconocido";

    }

    //Un constructor con (tres) parámetros que, recibe valores e inicializa cada uno de los tres atributos de los objetos que se crean.

    public Robot(String nombre, String modelo, int duracion) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.duracion = duracion;
    }

    //Un constructor con (dos) parámetros que recibe por parámetro nombre y modelo al crearse un objeto. En el cuerpo del constructor invocamos al constructor de tres parámetros, con el nombre y modelo recibidos y una duración de 20 años.


    public Robot(String nombre, String modelo) {
        this(nombre, modelo, 20);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", duracion=" + duracion + "años" +
                '}';
    }

    public static void main(String[] args) {

        Robot robot1 = new Robot();//constructor sin parametros
        Robot robot2 = new Robot("R2-D2", "AstroMech", 5000);//cosntructor con tres parametros
        Robot robot3 = new Robot("Wall-W", "Cleaner");//constructor con dos parametros

        //mostrar propiedades de los robots
        System.out.println(" Robot 1: ");
        System.out.println(robot1);
        System.out.println();
        System.out.println("Robot 2: ");
        System.out.println(robot2);
        System.out.println();
        System.out.println("Robot 3: ");
        System.out.println(robot3);
    }
}
