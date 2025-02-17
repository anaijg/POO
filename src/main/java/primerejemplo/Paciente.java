package primerejemplo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente {
    // los atributos se declaran normalmente como private (eso es encapsularlos)
    // private = sólo se puede acceder desde la misma clase
    private int idPaciente;
    private String nombre;
    private String apellido1;
    private String apellido2;
    // Fecha de nacimiento -> fechas LocalDate
    private LocalDate fechaNacimiento;
    private ArrayList<String> sintomas;


    // para acceder (o leer o cambiar) los atributos private lo que se hace es crear unos métodos públicos que se llaman get y set


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

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
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

    @Override
    public String toString() {
        return "Paciente{" +
                "idPaciente=" + idPaciente +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", sintomas=" + sintomas +
                '}';
    }
}
