package ejemplos;

import java.time.LocalDate;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        //podemos crear un objeto aunque no hayamos declarado un constructor en la clase = constructor por defecto, el constructor "que no vemos"
        Paciente paciente1 = new Paciente();
        // paciente1 es un objeto
        // paciente1.nombre = "serafin"; esto no lo puedo hacer desde esta clase porque es private en la clase Paciente

        // con los getters y setters podemos acceder a los valores del paciente1
        System.out.println(paciente1.getIdPaciente());
        System.out.println(paciente1.getNombre());
        System.out.println(paciente1.getFechaNacimiento());
        System.out.println(paciente1.getSintomas());

        // con los setters damos valores a los atributos, o los cambiamos si se los hemos dado antes
        paciente1.setIdPaciente(1);
        paciente1.setNombre("Alberto");
        paciente1.setApellido1("Perez");
        paciente1.setApellido2("Reterte");
        paciente1.setFechaNacimiento(LocalDate.of(2004, 5, 30));
        // haecemos un arraylist con los sintomas de este paciente
        ArrayList<String> sintomas = new ArrayList<>();
        sintomas.add("Cefaleas");
        sintomas.add("Fiebre");
        sintomas.add("Nauseas");
        sintomas.add("Mucosidad");
        sintomas.add("Tos");
        // System.out.println(sintomas);
        // estos sintomas se los paso a mi paciente
        paciente1.setSintomas(sintomas);
        System.out.println(paciente1);
    }
}
