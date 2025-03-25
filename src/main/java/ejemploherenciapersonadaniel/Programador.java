package ejemploherenciapersonadaniel;

import java.time.LocalDate;

public class Programador extends Empleado{
    private String[] lenguajes;

    public Programador(String nombre, int añoNacimiento, String direccion,
                       LocalDate fechaIncorporacion, double salario, String[] lenguajes) {
        super(nombre, añoNacimiento, direccion, fechaIncorporacion, salario);
        this.lenguajes = lenguajes;
    }

    public String[] getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String[] lenguajes) {
        this.lenguajes = lenguajes;
    }
}
