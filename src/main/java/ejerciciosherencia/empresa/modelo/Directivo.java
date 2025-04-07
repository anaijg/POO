package ejerciciosherencia.empresa.modelo;

import java.time.LocalDate;
import java.util.Scanner;

public class Directivo extends Empleado {
    private static Scanner sc = new Scanner(System.in);
    //atributo para scanner
    private Categoria categoria;

    public Directivo(String nombre, LocalDate fechaNacimiento, double sueldoBruto, Categoria categoria) {
        super(nombre, fechaNacimiento, sueldoBruto);
        this.categoria = categoria;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("      Categoria: " + this.categoria);
        System.out.println("      salario neto : "+ this.calcularSalarioNeto());
    }
    //los directivos cobran un plus, que se introduce por teclado, CREA un metodo  pedirPLUS(): double, que pide y devuelve la cantidad de plus (en euros) y el método asignarPlus(), que suma al salario bruto la cantidad de plus añadida por teclado.
    public double pedirPlus(){// lo pongo private porque solo lo utiliza un metodo en esta misma clase (asignarPlus());

        System.out.println("Plus a asignar: ");
        return sc.nextDouble();

    }

    public void asignarPlus(){

        double plus = this.sueldoBruto;
        this.sueldoBruto = this.sueldoBruto + plus;
    }
}
