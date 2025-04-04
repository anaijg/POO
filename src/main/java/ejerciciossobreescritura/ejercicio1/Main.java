package ejerciciossobreescritura.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(20);
        Rectangulo rectangulo = new Rectangulo(12, 3);
        Triangulo triangulo = new Triangulo(4, 7);

        System.out.println(circulo.calcularArea());
        System.out.println(circulo.mostrarTipo());

        System.out.println(rectangulo.calcularArea());
        System.out.println(rectangulo.mostrarTipo());

        System.out.println(triangulo.calcularArea());
        System.out.println(triangulo.mostrarTipo());
    }
}

