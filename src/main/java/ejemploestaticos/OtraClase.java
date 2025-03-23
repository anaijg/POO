package ejemploestaticos;

public class OtraClase {
    public static void main(String[] args) {
        //ahora estoy en otra clase y quiero utilizar metodos y/o variables estaticas que estén en EjemploSatic

        //queiro utilizar el scanner stático
        System.out.println("Introduce otra cadena: ");
        String otraCadena = EjemploStatic.sc.nextLine();// puedo utilizar scanner diciendo en qué otra clase está

        // quiero llamar al método estático de la otra clase
        EjemploStatic.metodoEstatico();

        // quiero llamar al método de instancia de la otra clase

        EjemploStatic aStatic = new EjemploStatic();
        aStatic.metodoDeInstancia();



    }
}
