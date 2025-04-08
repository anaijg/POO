package herencia.ejemploherenciapersona2;

import java.time.LocalDate;

public class Programador extends Empleado {
    String[] lenguajesDeProgramacion;

    public Programador(
            String nombre,
            int añoNacimento,
            String direccion,
            LocalDate fechaInicio,
            double salario,
            String[] lenguajesDeProgramacion
    ) {
        super(nombre, añoNacimento, direccion, fechaInicio, salario); // super = constructor de Empleado
        this.lenguajesDeProgramacion = lenguajesDeProgramacion;
    }

    public String[] getLenguajesDeProgramacion() {
        return lenguajesDeProgramacion;
    }

    public void setLenguajesDeProgramacion(String[] lenguajesDeProgramacion) {
        this.lenguajesDeProgramacion = lenguajesDeProgramacion;
    }
}
