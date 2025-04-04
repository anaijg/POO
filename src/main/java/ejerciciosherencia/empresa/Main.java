package ejerciciosherencia.empresa;

import ejerciciosherencia.empresa.modelo.Cliente;
import ejerciciosherencia.empresa.modelo.Empleado;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Currito", LocalDate.of(2000, 10, 03), -15000);

        empleado.mostrar();
        double sueldoNeto = empleado.calcularSalarioNeto();
        System.out.println(empleado.getNombre() + " - sueldo neto = " + sueldoNeto + " €");

        Cliente cliente1 = new Cliente("Pura", LocalDate.of(2005, 8, 8), "666666729");
        cliente1.mostrar();

        // probamos el segundo constructor de Cliente, sin teléfono
        Cliente cliente2 = new Cliente("Juan", LocalDate.of(1998, 5, 26));
        cliente2.mostrar();
    }
}
