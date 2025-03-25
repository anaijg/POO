package ejemploherenciapersona2;

public class Persona {
    private String nombre;
    private int aNacimiento;
    private String direccion;

    public Persona(String nombre, int aNacimiento, String direccion) {
        this.nombre = nombre;
        this.aNacimiento = aNacimiento;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getaNacimiento() {
        return aNacimiento;
    }

    public void setaNacimiento(int aNacimiento) {
        this.aNacimiento = aNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


}
