package ejercicios.Robots;

public class Main {
    static Robot robot1 = new Robot();
    static Robot robot2 = new Robot("Timmy","Conductor", 60);
    static Robot robot3 = new Robot("Jimmy","Constructor");

    public static void main(String[] args) {
        System.out.println(robot1);
        System.out.println(robot2);
        System.out.println(robot3);
    }
}
