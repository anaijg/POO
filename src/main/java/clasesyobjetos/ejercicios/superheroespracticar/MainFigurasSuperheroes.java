package clasesyobjetos.ejercicios.superheroespracticar;

public class MainFigurasSuperheroes {
    public static void main(String[] args) {
        // crear superheroes
        Superheroe batman = new Superheroe("Batman");
        batman.setDescripcion("caballero oscuro y vigilante de gotham");
        batman.setCapa(true);

        Superheroe superman = new Superheroe("Superman");
        superman.setDescripcion("Hombre de acero con poderes extraordinarios");
        batman.setCapa(false);

        // crear dimensiones

        Dimension dim1 = new Dimension(10, 5, 3);
        Dimension dim2 = new Dimension(12, 6, 4);

        // crear figuras
        Figura figura1 = new Figura("01",49.88, dim1, batman);
        Figura figura2 = new Figura("02",59.99, dim2,superman);

        //crear coleccion y añadir figuras
        Coleccion coleccion = new Coleccion("COLECCION DE SUPERHEROES");
        coleccion.anadirFigura(figura1);
        coleccion.anadirFigura(figura2);

        // mostrar datos de la coleccion
        System.out.println("\ncoleccion completa: ");
        System.out.println(coleccion);

        System.out.println("\nFiguras con capas: ");
        System.out.println(coleccion.conCapa());

        System.out.println("\nfigura mas valiosa: ");
        System.out.println(coleccion.masValioso());

        System.out.println("\n Valor total de la coleccion: " + coleccion.getValorColeccion());
        System.out.println(coleccion.getValorColeccion1());
        System.out.println("\nVolumen total de la coleccion: " + coleccion.getVolumenColeccion());
        System.out.println(coleccion.getVolumenColeccio1());

        // subir precio de una figura
        coleccion.subirPrecio(10, "01");
        System.out.println("\nDespues de subir precio a la figura (01): ");
        System.out.println(coleccion);

    }
}
