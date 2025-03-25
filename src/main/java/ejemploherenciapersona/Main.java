package ejemploherenciapersona;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //creamos un programador y luego le damos valores a sus atributos (los suyos y los heredados)
        Programador programador = new Programador();

        programador.setNombre("Pablo carrillo");
        programador.setaNacimiento(1990);
        programador.setDireccion("calle principal 123");


        //usar setter heredado de empleado
        programador.setFechaEmpezoTrabajo(LocalDate.of(2021, 1, 15));
        programador.setSalario(50000.00);

        // usando setter propio de programador

        //observa esta forma de crear un array y llenarlo de contenido "sobre la marcha"
        programador.setLenguajes(new String[]{"Java", "C++", "Python"});

        // leer los valores
        System.out.println("Nombre: " + programador.getNombre());
        System.out.println("Año de nacimiento: " + programador.getaNacimiento());
        System.out.println("Direccion: " + programador.getDireccion());
        System.out.println("Fecha de inicio: " + programador.getFechaEmpezoTrabajo());
        System.out.println("Salario: " + programador.getSalario());

        System.out.println("\n\nArrays toString");
        System.out.println("Lenguajes: " + Arrays.toString(programador.getLenguajes()));
        System.out.println("\n\n Arrays- String.join");
        System.out.println("Lenguajes: " + String.join(", ", programador.getLenguajes()));
        System.out.println("\n\n for clasico");
        String[] lenguajes = programador.getLenguajes();
        for (int i = 0; i < lenguajes.length; i++) {
            System.out.println(lenguajes[i]);
            if (i < lenguajes.length - 1) {
                System.out.println(", ");
            }
        }
        System.out.println();

        System.out.println("\n\n for each");
        for (String valor : lenguajes) {
            System.out.println(valor + " ");
        }
        System.out.println();


    }
}
