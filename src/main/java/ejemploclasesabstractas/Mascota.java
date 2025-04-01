package ejemploclasesabstractas;

/**
 * clase abstracta, no se puede instanciar
 * su utilidad es que otras clases hereden de ella
 */
public abstract class Mascota {
    protected String nombre;
    protected int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // método abstracto: se declara pero no se desarrolla
    // es obligatorio que lo desarrollen las subclases no abstractas
    public abstract void dice();

    // método no abstracto: se puede sobreescribir o no, según decidamos
    public void seMueve() {
        System.out.println("tacacacacacacaca");
    }
}
