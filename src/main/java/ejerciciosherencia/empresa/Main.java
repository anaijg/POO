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

        Cliente cliente = new Cliente("Pura", LocalDate.of(2005, 8, 8), "6666666a2");
        cliente.mostrar();

        //System.out.println("   666-66-66  ".trim().replace(" ", ""));
    }
}
