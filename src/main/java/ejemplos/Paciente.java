package ejemplos;

import java.time.*;
import java.util.ArrayList;

public class Paciente {
    //los atributos se declaran normalmente en privado, se encapsulan
    //private = a que solo se puede acceder desde la misma clase
    private int idPaciente;
    private String nombre;
    private String apellidos1;
    private String apellidos2;
    private LocalDate fechaNacimiento;
    private ArrayList<String> sintomas;

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos1() {
        return apellidos1;
    }

    public void setApellidos1(String apellidos1) {
        this.apellidos1 = apellidos1;
    }

    public String getApellidos2() {
        return apellidos2;
    }

    public void setApellidos2(String apellidos2) {
        this.apellidos2 = apellidos2;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<String> getSintomas() {
        return sintomas;
    }

    public void setSintomas(ArrayList<String> sintomas) {
        this.sintomas = sintomas;
    }

    //para acceder a los atributos privados lo que se hace es crear unos métodos públicos que se llaman get y set


    @Override
    public String toString() {
        return "Paciente{" +
                "idPaciente=" + idPaciente +
                ", nombre='" + nombre + '\'' +
                ", apellidos1='" + apellidos1 + '\'' +
                ", apellidos2='" + apellidos2 + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", sintomas=" + sintomas +
                '}';
    }
}
