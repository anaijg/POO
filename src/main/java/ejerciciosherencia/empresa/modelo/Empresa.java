package ejerciciosherencia.empresa.modelo;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    ArrayList<Empleado> empleados;
    ArrayList<Cliente> clientes;

    /**
     * Constructor que sólo recibe el nombre e inicializa empleados y clientes vacío
     * @param nombre
     */
    public Empresa(String nombre) {
        this.nombre = nombre;
        empleados = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    /**
     * Constructor que recibe todos los atributos como parámetros
     * @param nombre
     * @param empleados
     * @param clientes
     */
    public Empresa(String nombre, ArrayList<Empleado> empleados, ArrayList<Cliente> clientes) {
        this.nombre = nombre;
        this.empleados = empleados;
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", empleados=" + empleados +
                ", clientes=" + clientes +
                '}';
    }

    public void mostrar() {
        System.out.println(this.toString());
    }
}
