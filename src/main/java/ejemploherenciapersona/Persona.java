package ejemploherenciapersona;

public class Persona {
    protected String nombre;
    protected int añoNacimento;
    protected String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoNacimento() {
        return añoNacimento;
    }

    public void setAñoNacimento(int añoNacimento) {
        this.añoNacimento = añoNacimento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
