package herencia.ejemploclasesabstractas;

public class Gato extends Mascota{

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void dice() {
        System.out.println("Miau");
    }

    @Override
    public void seMueve() {
        System.out.println("tiquitiquiti");
    }
}
