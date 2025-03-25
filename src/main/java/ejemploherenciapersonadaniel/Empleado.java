package ejemploherenciapersonadaniel;

import java.time.LocalDate;

public class Empleado extends Persona{
    protected LocalDate fechaIncorporacion;
    protected double salario;

    public Empleado(String nombre, int añoNacimiento, String direccion, LocalDate fechaIncorporacion, double salario) {
        super(nombre, añoNacimiento, direccion);
        this.fechaIncorporacion = fechaIncorporacion;
        this.salario = salario;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
