package ejerciciosherencia.empresa;

import ejerciciosherencia.empresa.modelo.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("currito", LocalDate.of(2024, 3, 24), -15000);

        empleado.mostrar();
        double sueldoNato = empleado.calcularSalarioNeto();
        System.out.println(empleado.getNombre() + " -sueldo neto = " + sueldoNato + " € ");

        Cliente cliente = new Cliente("Pura", LocalDate.of(2022, 3, 12), "666666729");

        cliente.mostrar();

        //probamos el segundo constructor de cliente sin telefono
        Cliente cliente1 = new Cliente("Juan", LocalDate.of(1998, 5, 26));

        cliente1.mostrar();

        //probamos a crear un directivo
        Directivo directivo = new Directivo("Jefazo", LocalDate.of(1979, 06,26), 150000, Categoria.CEO);
        directivo.mostrar();
        directivo.pedirPlus();
        directivo.asignarPlus();
        directivo.mostrar();
        System.out.println(directivo.calcularSalarioNeto());

        // creamos una empresa
        Empresa empresa = new Empresa("CoCOliso. S.A");
        empresa.mostrar();

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado);
        empleados.add(directivo);//plimorfismo en accion: un directivo es un empleado
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);
        clientes.add(cliente1);
        Empresa empresa1 = new Empresa("tutifrutil", empleados, clientes);
        empresa1.mostrar();


    }
}
