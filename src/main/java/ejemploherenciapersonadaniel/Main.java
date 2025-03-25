package ejemploherenciapersonadaniel;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //creamos un programador y le damos todos los valores de la herencia
        Programador programador1 = new Programador("Linus torbal", 1969, "Silicon Valley", LocalDate.of(1977, 10, 10), 50000.0, new String[]{"Bash", "Java", "Python"});
        /**
         *
         * Antes lo teniamos asi, cuando no teniamos los construcotres, asi es comos e hace un objeto de tipo programador sin constructores, pero una vez ya hecho, en el constructor de arriba es comos e hace el objeto ya que no lo puedes dejar vacio
         *
         *
        programador1.setNombre("Lines Torbal");
        programador1.setAñoNacimiento(1969);
        programador1.setDireccion("Silicon Valley");
        programador1.setFechaIncorporacion(LocalDate.of(1977, 10, 10));
        //crear un array sobre la marcha
        programador1.setLenguajes(new String[]{"Bash", "Java", "Python"});
        programador1.setSalario(500000.0);
        **/


        System.out.println(programador1.getNombre() + " " +
                programador1.getDireccion() + " " +
                        Arrays.toString(programador1.getLenguajes()) + " " +
                programador1.getAñoNacimiento() + " " +
                programador1.getFechaIncorporacion() + " " +
                programador1.getSalario());
    }

}
