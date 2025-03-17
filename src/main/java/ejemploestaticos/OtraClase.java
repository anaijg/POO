package ejemploestaticos;

public class OtraClase {
    public static void main(String[] args) {
        // ahora estoy en otra clase y quiero utilizar métodos y/o variables estáticos que estén en EjemploStatic

        // quiero utilizar el scanner estático
        String otraCadena = EjemploStatic.scanner.nextLine(); // puedo utilizar scanner diciendo en qué otra clase está

        // quiero llamar al método estático de la otra clase
        EjemploStatic.metodoEstatico();

        // quiero llamar al método de instancia de la otra clase
        EjemploStatic otroObjeto = new EjemploStatic();
        otroObjeto.metodoDeInstancia();
    }
}
