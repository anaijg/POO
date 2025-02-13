package Ejemplos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente {
    //Los atributos se declaran normalmente como private (eso es encapsularlos)
    //Private = solo se puede acceder desde la misma clase
    private int IdPaciente;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String Correo;
    private String Direccion;

    //Fecha de Nacimiento LocalDate
    private LocalDate FechaNacimiento;
    private ArrayList<String> sintomas;

    // para acceder (o leer o cambiar)  los atributos private lo que se hace es crear unos métodos públicos que se llaman get y set


    public int getIdPaciente() {
        return IdPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        IdPaciente = idPaciente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }


    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
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
                "IdPaciente=" + IdPaciente +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Telefono='" + Telefono + '\'' +
                ", Correo='" + Correo + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", FechaNacimiento=" + FechaNacimiento +
                ", sintomas=" + sintomas +
                '}';
    }
}
