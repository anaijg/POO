package Ejemplos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
            //podemos crear un objeto aunq no hayamos declarado un objeto en la clase
            // a eso le llamamos constructor por defecto (no se ve)
            Paciente paciente1 = new Paciente();
            System.out.println(paciente1);
            //paciente1.nombre = "serafin" //Esto no lo puedo hacer desde esta clase pq es private

            //con los setters y getters podemos acceder a los valores de paciente1(objeto)

            System.out.println(paciente1.getIdPaciente());
            System.out.println(paciente1.getNombre());
            System.out.println(paciente1.getFechaNacimiento());
            System.out.println(paciente1.getSintomas());

            //con los setters damos/cambiamos un valor
            paciente1.setIdPaciente(1);
            paciente1.setApellido1("Abundio");
            paciente1.setApellido2("Castro");
            paciente1.setFechaNacimiento(LocalDate.of(2005,12, 01));
            paciente1.setNombre("Marcos");
            //hacemos un arraylist con los sintomas de este paciente
            ArrayList<String> sintomas = new ArrayList<>();
            sintomas.add("Dolor de cabeza"); //posicion, despues sintomas/ solo sintomas
            sintomas.add("fiebre");
            sintomas.add("nauseas");
            sintomas.add("tos");
            sintomas.add("mucosidad");
            //System.out.println(sintomas);
            //estos sintomas se los paso a mi paciente
            paciente1.setSintomas(sintomas);
            System.out.println(paciente1);
        }
    }

