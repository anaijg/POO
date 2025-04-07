package ejerciciosherencia.empresa.modelo;

import java.time.LocalDate;

public abstract class Persona {
    protected String nombre;
    protected LocalDate fechaNacimiento;

    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void mostrar() {
        System.out.println(nombre + " ( " + fechaNacimiento.getDayOfMonth() +
                "/" + fechaNacimiento.getMonth() +
                "/" + fechaNacimiento.getYear() + ")");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
