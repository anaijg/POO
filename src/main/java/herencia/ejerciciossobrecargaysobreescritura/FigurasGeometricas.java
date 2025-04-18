package herencia.ejerciciossobrecargaysobreescritura;

/**
 * Crea una superclase llamada FiguraGeometrica con un método calcularArea() que devuelve un double y un método mostrarTipo() que imprime "Soy una figura geométrica".
 * Crea al menos tres subclases:  Circulo (con atributo radio), Rectangulo (con atributos base y altura), y Triangulo (con atributos base y altura).
 * Implementa el método calcularArea() en cada subclase para calcular el área correspondiente.
 * Sobrescribe el método mostrarTipo() en cada subclase para que imprima el tipo específico de figura (ej. "Soy un círculo").
 * Crea una clase Main con un método main que cree instancias de cada figura y llame a los métodos calcularArea() y mostrarTipo().
 */

public  class FigurasGeometricas {

    abstract class FiguraGeometrica{
        public abstract double calcularArea();

        public void mostrarTipo(){
            System.out.println("Hola, soy una figura geometrica");
        }
    }

}
