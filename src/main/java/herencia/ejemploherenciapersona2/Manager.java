package herencia.ejemploherenciapersona2;

import java.time.LocalDate;

public class Manager extends Empleado {
    private boolean sorisa;

    public Manager(
            String nombre,
            int aNacimiento,
            String direccion,
            LocalDate fechaEmpezoTrabajo,
            double salario,
            boolean sorisa
    ) {
        super(nombre, aNacimiento, direccion, fechaEmpezoTrabajo, salario); // super = constructor de empleado
        this.sorisa = sorisa;
    }

    public boolean isSorisa() {
        return sorisa;
    }

    public void setSorisa(boolean sorisa) {
        this.sorisa = sorisa;
    }
}
