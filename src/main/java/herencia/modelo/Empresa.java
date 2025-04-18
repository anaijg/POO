package herencia.modelo;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    ArrayList<Empleado> empleados; // no lo inicilizo
    ArrayList<Cliente> clientes;

    /**
     * constructor que solo recibe el nombre e incializa empleados y clientes vacios
     * @param nombre
     */

    public Empresa(String nombre) {
        this.nombre = nombre;
        empleados = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    /**
     * cosntructor que recibe todos los paremetros
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

    //añade un metodo mostrar()

    public void mostrar(){
        System.out.println(this.toString());

    }
}
