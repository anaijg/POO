package ejemplos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente{

    //lso atributos se declaran normalmente com privare (eso es encapsularlos)
    // private = solo se puede acceder desde la misma clase
    private int idPaciente;
    private String nombre;
    private String apellido2;
    private String apellido1;
    // Fechas de nacimiento -> fechas LocalDate
    private LocalDate fechaNacimiento;
    private ArrayList<String> sintomas;

    // para acceder (o leer o cambiar) lso atributos private, lo que se hace es crear unos métodos públicos que se llaman get y set


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

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
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
                ", apellido2='" + apellido2 + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", sintomas=" + sintomas +
                '}';
    }
}



