package ejercicios.variablesestaticas.identificadorunico;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Lejía");
        System.out.println(Producto.contadorId);// es de toda la clase , la misma para todos los objetos
        Producto producto2 = new Producto(" queso ");
        System.out.println(Producto.contadorId);
        Producto producto3 = new Producto("pan");

        System.out.println("Id del producto " + Producto.contadorId);
    }
}
