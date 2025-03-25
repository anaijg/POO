package ejemploherenciapersonadaniel;

import java.time.LocalDate;

public class Manager extends Empleado{
    private boolean sonrisaDeslumbrante = false;

    public Manager(String nombre, int añoNacimiento, String direccion, LocalDate fechaIncorporacion, double salario, boolean sonrisaDeslumbrante) {
        super(nombre, añoNacimiento, direccion, fechaIncorporacion, salario);
        this.sonrisaDeslumbrante = sonrisaDeslumbrante;
    }

    public boolean isSonrisaDeslumbrante() {
        return sonrisaDeslumbrante;
    }

    public void setSonrisaDeslumbrante(boolean sonrisaDeslumbrante) {
        this.sonrisaDeslumbrante = sonrisaDeslumbrante;
    }
}
