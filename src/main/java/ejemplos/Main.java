package ejemplos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //podemos crear un objeto aunque no declaremos un contructor de la clase. Es un contructor por defecto.
        Paciente paciente1 = new Paciente();
        //con los getters podemos acceder a los valores de paciente1
        System.out.println(paciente1.getIdPaciente());
        System.out.println(paciente1.getNombre());
        System.out.println(paciente1.getFechaNacimiento());
        System.out.println(paciente1.getSintomas());
        //con los setters podemos modificarlos
        paciente1.setIdPaciente(444);
        paciente1.setNombre("Adrián");
        paciente1.setApellidos1("Cárdenas");
        paciente1.setApellidos1("Gallego");
        paciente1.setFechaNacimiento(LocalDate.of(2003,2,4));
        //hacemos un arrayList con los sintomas del paciente.
        ArrayList<String> sintomas = new ArrayList<>(); //lo creamos
        sintomas.add("Cefalea");
        sintomas.add("Tos");
        sintomas.add("Náuseas");
        sintomas.add("Mucosidad");
        sintomas.add("Fiebre");
        System.out.println(paciente1);


    }
}
