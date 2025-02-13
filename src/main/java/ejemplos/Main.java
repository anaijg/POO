package ejemplos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // podemos crear un objeto aunque no hayamos declarado un constructor en la clase, le llamamos constructor por defecto, es el constructor "que no vemos"
        Paciente paciente1 = new Paciente();      // paciente1 es un objeto
        System.out.println(paciente1.toString());

        //paciente1.nombre = "Serafín";     no se puede hacer lo siguiente porque en la clase paciente tengo private el nombre

        System.out.println(paciente1.getIdPaciente());
        System.out.println(paciente1.getNombre());
        System.out.println(paciente1.getFechaNacimiento());
        System.out.println(paciente1.getSintomas());

        // con los setters damos valores a los atributos, o los cambiamos si se los hemos dado antes
        paciente1.setIdPaciente(1);
        paciente1.setApellido1("Abundio");
        paciente1.setApellido2("Pérez");
        paciente1.setFechaNacimiento(LocalDate.of(2004,05,30));
        paciente1.setNombre("Abilio");
        // hacemos un arraylist con los sintomas de este paciente
        ArrayList<String> sintomas = new ArrayList<>();     // lo creamos
        sintomas.add("Cefalea");
        sintomas.add("Fiebre");
        sintomas.add("Náuseas");
        sintomas.add("Mucosidad");
        sintomas.add("Tos");
        //System.out.println(sintomas);
        // estos sintomas se los paso a mi paciente
        paciente1.setSintomas(sintomas);


    }
}
