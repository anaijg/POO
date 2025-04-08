package herencia.empresa.modelo;

import java.time.LocalDate;
import java.util.Scanner;

public class Directivo extends Empleado{
    private static Scanner scanner = new Scanner(System.in);
    // atributo:
    private Categoria categoria;

    public Directivo(
            String nombre,
            LocalDate fechaDeNacimiento,
            double sueldoBruto,
            Categoria categoria
    ) {
        super(nombre, fechaDeNacimiento, sueldoBruto);
        this.categoria = categoria;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("    Categoría: " + this.categoria);
        System.out.println("    Salario neto: " + this.calcularSalarioNeto());
    }

    // Los directivos cobran un plus, que se introduce por teclado. Crea un método pedirPlus(): double, que pide y devuelve la cantidad de plus (en euros) y el método asignarPlus(), que suma al salario bruto la cantidad de plus añadida por teclado.

    private double pedirPlus() { // lo pongo private porque sólo lo utiliza un método en esta misma clase (asignarPlus())
        System.out.print("Plus a asignar: ");
        return scanner.nextDouble();
    }

    public void asignarPlus() {
        double plus = pedirPlus();
        sueldoBruto += plus;
    }

    // Sobreescribe el método calcularSalarioNeto() porque a los directivos sólo se les descuenta un 5% del salario bruto..


    @Override
    public double calcularSalarioNeto() {
        return sueldoBruto - sueldoBruto * 0.05;
    }
}
