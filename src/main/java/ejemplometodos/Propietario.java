package ejemplometodos;

import java.time.LocalDate;

public class Propietario {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Licencia licencia;
    private LocalDate fechaNacimiento;

    public Propietario(String nombre, String apellido1, String apellido2, Licencia licencia, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.licencia = licencia;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", licencia=" + licencia +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
