package herencia.empresa.modelo;

import java.time.LocalDate;

public class Empleado extends Persona {
    protected double sueldoBruto;

    public Empleado(
            String nombre,
            LocalDate fechaDeNacimiento,
            double sueldoBruto
    ) {
        super(nombre, fechaDeNacimiento);
        // comprobamos que el sueldo es ok
        if (sueldoBruto <= 0 ) {
            this.sueldoBruto = 15876;
        } else {
            this.sueldoBruto = sueldoBruto;
        }
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("    sueldo bruto: " + this.sueldoBruto);
    }

    public double calcularSalarioNeto() {
         sueldoBruto = sueldoBruto - sueldoBruto * 0.15;
        return sueldoBruto;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
