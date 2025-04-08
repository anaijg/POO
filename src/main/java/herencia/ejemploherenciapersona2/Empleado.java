package herencia.ejemploherenciapersona2;

import java.time.LocalDate;

public class Empleado extends Persona {
    protected LocalDate fechaInicio;
    protected double salario;

    public Empleado(
            String nombre,
            int añoNacimento,
            String direccion,
            LocalDate fechaInicio,
            double salario
    ) {
        super(nombre, añoNacimento, direccion);
        this.fechaInicio = fechaInicio;
        this.salario = salario;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
