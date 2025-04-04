package ejerciciosherencia.empresa.modelo;

import java.time.LocalDate;

public class Directivo extends Empleado{
    public Directivo(String nombre, LocalDate fechaDeNacimiento, double sueldoBruto) {
        super(nombre, fechaDeNacimiento, sueldoBruto);
    }
}
