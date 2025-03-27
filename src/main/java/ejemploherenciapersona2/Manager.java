package ejemploherenciapersona2;

import java.time.LocalDate;

public class Manager extends Empleado {
    private boolean sonrisaDeslumbrante;

    public Manager(
            String nombre,
            int añoNacimento,
            String direccion,
            LocalDate fechaInicio,
            double salario,
            boolean sonrisaDeslumbrante) {
        super(nombre, añoNacimento, direccion, fechaInicio, salario); // super = constructor de Empleado
        this.sonrisaDeslumbrante = sonrisaDeslumbrante;
    }
}
