package herencia.ejemploherenciapersona2;

import java.time.LocalDate;

public class Empleado extends Persona {
    private LocalDate fechaEmpezoTrabajo;
    private double salario;

    public Empleado(
            String nombre,
            int aNacimiento,
            String direccion,
            LocalDate fechaEmpezoTrabajo,
            double salario
    ) {
        super(nombre, aNacimiento, direccion);//super() es el constructor de Persona
        this.fechaEmpezoTrabajo = fechaEmpezoTrabajo;
        this.salario = salario;
    }

    public LocalDate getFechaEmpezoTrabajo() {
        return fechaEmpezoTrabajo;
    }

    public void setFechaEmpezoTrabajo(LocalDate fechaEmpezoTrabajo) {
        this.fechaEmpezoTrabajo = fechaEmpezoTrabajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
