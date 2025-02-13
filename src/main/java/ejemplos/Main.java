package ejemplos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Podemos crear un objeto aun que no hayamos declaro un constructor en la clase, es el constructor por defecto que hace java solo
        Paciente paciente1 = new Paciente(); // paciente1 es un objeto

        // paciente1.nombre = "Paco";  //esto no lo puedo hacer desde esta clase por que es privado en su clase

        // con los getters y setters podemos acceder a los valores del paciente1
        System.out.println(paciente1.getIdPaciente());
        System.out.println(paciente1.getNombre());
        System.out.println(paciente1.getFechaNacimiento());
        System.out.println(paciente1.getSintomas());

        // con los setters damos valores a loa tributos, o los acambiamos si ya se los hemos dado antes

        paciente1.setIdPaciente(1);
        paciente1.setApellido1("Sanchez");
        paciente1.setApellido2("Perez");
        paciente1.setFechaNacimiento(LocalDate.of(2004, 5, 30));
        paciente1.setNombre("Paco");
        // Hacemos un arrayList con los sintomas del paciente
        ArrayList<String> sintomas = new ArrayList<>();
        sintomas.add("Cefalea");
        sintomas.add("Fiebre");
        sintomas.add("Nauseas");
        sintomas.add("Mucosidad");
        sintomas.add("Tos");

        //Estos sintoams se los paso a mi paciente
        paciente1.setSintomas(sintomas);
        System.out.println(paciente1);







    }
}
