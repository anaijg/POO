package herencia.ejemploherenciapersona2;

import java.time.LocalDate;

public class Programador extends Empleado {
    //atributo
    private String[] lenguajes;

    public Programador(
            String nombre,
            int aNacimiento,
            String direccion,
            LocalDate fechaEmpezoTrabajo,
            double salario,
            String[] lenguajes
    ) {
        super(nombre, aNacimiento, direccion, fechaEmpezoTrabajo, salario); // super = constructor de empleado
        this.lenguajes = lenguajes;
    }

    public String[] getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String[] lenguajes) {
        this.lenguajes = lenguajes;
    }
}
