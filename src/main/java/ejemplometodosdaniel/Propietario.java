package ejemplometodosdaniel;

import java.time.LocalDate;

public class Propietario {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Licencia licencia;
    private LocalDate fechadenacimiento;

    public Propietario(String nombre, String apellido1, String apellido2, Licencia licencia, LocalDate fechadenacimiento) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.licencia = licencia;
        this.fechadenacimiento = fechadenacimiento;
    }


    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", licencia=" + licencia +
                ", fechadenacimiento=" + fechadenacimiento +
                '}';
    }
    /**Metodo getNombreCompleto()
     * @return  una cadena con el nombre y los apellidos
     *
     */

    public String getNombreCompleto() {
        return nombre + " " + apellido1 + " " + apellido2;
    }


}
