package ejemploherenciapersona2;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // creamos un programador y luego le damos valores a sus atributos (los suyos y los heredados)
        Programador programador = new Programador(
                "Linus Torvalds",
                1969,
                "Silicon Valley 54",
                LocalDate.of(1977, 10, 10),
                500000,
                new String[]{"Bash", "Java", "Python", "C", "C++"}
        );
        /*programador.setNombre("Linus Torvalds");
        programador.setAñoNacimento(1969);
        programador.setDireccion("Silicon Valley 54");
        programador.setFechaInicio(LocalDate.of(1977, 10, 10));
        // observa esta forma de crear un array y llenarlo de contenido "sobre la marcha"
        programador.setLenguajesDeProgramacion(new String[]{"Bash", "Java", "Python", "C", "C++"});
        programador.setSalario(500000);
*/
        System.out.println(programador.getNombre() + " " + programador.getDireccion() + Arrays.toString(programador.getLenguajesDeProgramacion()));
    }
}
