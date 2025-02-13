package ejemplos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente {
    // los atributos se declaran normalmente como private (eso es encapsularlos)
    //private = solo se puede acceder desde la misma clase
    private int idPaciente;
    private String nombre;
    private LocalDate fechaNacimiento;
    // Fecha de nacimiento -> fechas LocalDate
    private String apellido1;
    private String apellido2;
    private ArrayList<String> sintomas;


    // para acceder (o leer o cambiar) los atributo private lo que se hace es crear unos metodos publicos  que se llaman get y set

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public ArrayList<String> getSintomas() {
        return sintomas;
    }

    public void setSintomas(ArrayList<String> sintomas) {
        this.sintomas = sintomas;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String toString() {
        return "Paciente{" +
                "idPaciente=" + idPaciente +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", sintomas=" + sintomas +
                '}';
    }
}
