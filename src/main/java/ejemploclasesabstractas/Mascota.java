package ejemploclasesabstractas;

/**
 * clase abstracta , no se puede instanciar , su utilidad es que otras clases
 * Los metodos abstractos se declaran con la palaba clave abstract, pero solo se declaroan, no se implementan. cada subclase no abstracta de implementarlos.(los metodos abstractos no pueden ser estáticos.)
 */

public abstract class Mascota {

    protected String nombre;
    protected int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;


    }

    //metodo abstracto : se decalra pero no se implementa.
    //es obligatorio que lo desarrole las subclases no abstractas.
    public abstract void dice();


    //Método no absracto.
    public void seMueve() {
        System.out.println("Tiquitiqiitiqui Tiqui");
    }
}
