package ejercicioempresa;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * hereda de Empleado.
 * Tiene el atributo categoría, que es un tipo enumerado cuyos valores obtendremos de la siguiente URL: https://economipedia.com/definiciones/directivo.html
 * También sobreescribe el método mostrar con los valores de todos los atributos heredados más el atributo categoría.
 * Su constructor recibe todos los atributos como parámetros
 * LOS DIRECTIVOS COBRAN UN PLUS POR EL HECHO DE SERLO. ADEMÁS, SE ASIGNA, A DEDO, ES DECIR, SE PIDE POR TECLADO: AÑADIR MÉTODOS: ASIGNAR PLUS, QUE INCREMENTA EL SALARIO BRUTO EN EL PLUS QUE PIDAMOS POR TECLADO (PEDIRLO EN OTRO MÉTODO: PEDIRPLUS(): DOUBLE). SOBREESCRIBIR EL MÉTODO CALCULAR SALARIO NETO PORQUE POR INGENIERÍA FINANCIERA SÓLO SE DESCUENTAN UN 5% DEL SALARIO BRUTO.
 * Y LUEGO QUE TODO ESO SALGA EN MOSTRAR
 */

public class Directivo extends Empleado{
    private Categoria categoria;

    public Directivo(String nombre, LocalDate fechaDeNacimiento, double sueldoBruto) {
        super(nombre, fechaDeNacimiento, sueldoBruto);
        this.categoria = categoria;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Categoria: " + this.categoria);
    }

    public void pedirPlus(){
        Scanner sc = new Scanner(System.in);
        double plus = sc.nextDouble();
    }
    public void asignarPlus(double salarioBruto, double plus){
        salarioBruto *= plus;
    }
    public void calcular(){

    }
}
