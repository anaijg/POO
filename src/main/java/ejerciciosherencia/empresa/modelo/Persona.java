package ejerciciosherencia.empresa.modelo;

import java.time.LocalDate;

public class Persona {
    protected String nombre;
    protected LocalDate fechaDeNacimiento;

    public Persona(String nombre, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void mostrar() {
        System.out.println(nombre + " (" + fechaDeNacimiento.getDayOfMonth() + "/" + fechaDeNacimiento.getMonth() + "/" + fechaDeNacimiento.getYear() + ")");
    }

    public String getNombre() {
        return nombre;
    }
}
