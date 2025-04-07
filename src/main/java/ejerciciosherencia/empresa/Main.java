package ejerciciosherencia.empresa;

import ejerciciosherencia.empresa.modelo.*;


import java.time.LocalDate;
import java.util.ArrayList;

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

        // probamos a crear un Directivo
        Directivo directivo = new Directivo("Jefazo", LocalDate.of(1979, 06, 13), 150000, Categoria.CEO);
        directivo.mostrar();
        directivo.asignarPlus();
        directivo.mostrar();
        System.out.println(directivo.calcularSalarioNeto());

        // creamos una empresa
        Empresa empresa = new Empresa("Cocoliso S.A");
        empresa.mostrar();

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado);
        empleados.add(directivo); // polimorfismo en acción: un directivo es un empleado
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        Empresa empresa1 = new Empresa("Tutifrutii S.L", empleados, clientes);
        empresa1.mostrar();
    }
}
