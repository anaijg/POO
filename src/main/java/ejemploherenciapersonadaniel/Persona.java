package ejemploherenciapersonadaniel;

import java.util.Date;

public class Persona {
    protected String nombre;
    protected int añoNacimiento;
    protected String direccion;


    public Persona(String nombre, int añoNacimiento, String direccion) {
        this.nombre = nombre;
        this.añoNacimiento = añoNacimiento;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
