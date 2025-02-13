package Ejemplos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
     public static void main(String[] args) {
         //Podemos crear un objeto aunque no hayamos declarado un constructor en la clase = constructor por defecto
         // "el constructor que no vemos"
         Paciente paciente = new Paciente(); //paciente1 es un objeto
         System.out.println(paciente);
         // paciente1.nombre _ "Serafín": // esto no lo puedo hacer desde esta clase porque es private en la otra

         // con los getters y setters podemos acceder a los valores del paciente1
         System.out.println(paciente.getIdPaciente());
         System.out.println(paciente.getNombre());
         System.out.println(paciente.getApellido());
         System.out.println(paciente.getTelefono());
         System.out.println(paciente.getFechaNacimiento());
         System.out.println(paciente.getDireccion());
         System.out.println(paciente.getSintomas());

         // Con los setters damos valores a los atributos, o los cambiamos si se los hemos dado antes
         paciente.setIdPaciente(1);
         paciente.setApellido("Paciente");
         paciente.setTelefono("123456789");
         paciente.setCorreo("paciente@gmail.com");
         paciente.setFechaNacimiento(LocalDate.of(2004,5, 30));
         paciente.setNombre("Abilio");
         //hacemos un arraylist con los síntomas de este paciente
         ArrayList<String> sintomas = new ArrayList<>(); //lo creamos
         sintomas.add("Cefalea");
         sintomas.add("Tos");
         sintomas.add("Mucosidad");
         sintomas.add("Malestar");
         //System.out.println(sintomas);
         // estos síntomas se los paso a mi paciente
         paciente.setSintomas(sintomas);

         System.out.println(paciente);





     }
}
