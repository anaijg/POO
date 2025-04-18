package herencia.modelo;

import java.time.LocalDate;

public class Empleado extends Persona {

    protected double sueldoBruto;
    private static final double SMI = 15876;


    public Empleado(String nombre,
                    LocalDate fechaNacimiento,
                    double sueldoBruto) {
        super(nombre, fechaNacimiento);

        //comprobamos que el sueldo es ok
        if (sueldoBruto <= 0) {

            this.sueldoBruto = 15876;
        }else {
            this.sueldoBruto = sueldoBruto;

        }


    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Sueldo bruto: " + this.sueldoBruto);
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
