package ejemploherenciapersona;

import java.time.LocalDate;

public class Empleado extends Persona {
    private LocalDate fechaEmpezoTrabajo;
    private double salario;



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
