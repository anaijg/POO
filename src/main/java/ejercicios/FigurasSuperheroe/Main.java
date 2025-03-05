package ejercicios.FigurasSuperheroe;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear superhéroes
        Superheroe batman = new Superheroe("Batman");
        batman.setCapa(true);
        batman.setDescripcion("El caballero de la noche");

        Superheroe superman = new Superheroe("Superman");
        superman.setCapa(true);
        superman.setDescripcion("El hombre de acero");

        Superheroe spiderman = new Superheroe("Spiderman");
        spiderman.setCapa(false);
        spiderman.setDescripcion("El trepamuros");

        // Crear dimensiones
        Dimension dim1 = new Dimension(10, 5, 3);
        Dimension dim2 = new Dimension(12, 6, 4);
        Dimension dim3 = new Dimension(8, 4, 2);

        // Crear figuras
        Figura figura1 = new Figura("001", 100.0, batman, dim1);
        Figura figura2 = new Figura("002", 150.0, superman, dim2);
        Figura figura3 = new Figura("003", 120.0, spiderman, dim3);

        // Crear colección
        ArrayList<Figura> figuras = new ArrayList<>();
        Coleccion coleccion = new Coleccion("Héroes de DC", figuras);

        // Añadir figuras a la colección
        coleccion.añadirFigura(figura1);
        coleccion.añadirFigura(figura2);
        coleccion.añadirFigura(figura3);

        // Mostrar colección
        System.out.println(coleccion);

        // Mostrar figuras con capa
        System.out.println("Figuras con capa: " + coleccion.conCapa());

        // Figura más valiosa
        System.out.println("Figura más valiosa: " + coleccion.masValiosa());

        // Valor total de la colección
        System.out.println("Valor total de la colección: " + coleccion.getValorColeccion());

        // Volumen total de la colección
        System.out.println("Volumen total de la colección: " + coleccion.getVolumenColeccion());

        // Subir precio a una figura
        coleccion.subirPrecio(50, "001");
        System.out.println("Después de subir el precio a la figura 001:");
        System.out.println(coleccion);
    }
}

