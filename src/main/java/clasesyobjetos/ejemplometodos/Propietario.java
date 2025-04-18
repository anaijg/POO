package clasesyobjetos.ejemplometodos;

import java.time.LocalDate;

public class Propietario {
    //
    private String nombre;
    private String apellido;
    private String apellido2;
    private Licencia licencia;
    private LocalDate fechaNacimiento;
    //

    public Propietario(String nombre, String apellido, String apellido2, Licencia licencia, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.apellido2 = apellido2;
        this.licencia = licencia;
        this.fechaNacimiento = fechaNacimiento;
    }



    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", licencia=" + licencia +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    /**
     * Devuelve nombre completo del propietario
     *
     */

    public String getNombreCompleto(){
        return nombre + " apellido1" + " " + "apellido2";
    }
}
