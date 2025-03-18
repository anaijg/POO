package ejercicios.variablesestaticas.identificadorunico;

import ejemplometodos.Propietario;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("lejía");
        System.out.println(Producto.contadorID); // es de toda la clase, la misma para todos los objetos
        System.out.println("Id del producto: " + producto1.getIdProducto());
        Producto producto2 = new Producto("queso");
        System.out.println(Producto.contadorID);
        System.out.println("Id del producto: " + producto2.getIdProducto());
        Producto producto3 = new Producto("pan");
        System.out.println(Producto.contadorID);
        System.out.println("Id del producto: " + producto3.getIdProducto());

        System.out.println("Id del producto 1: " + producto1.getIdProducto());


    }
}
