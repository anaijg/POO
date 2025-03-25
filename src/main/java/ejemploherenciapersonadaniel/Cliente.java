package ejemploherenciapersonadaniel;

public class Cliente extends Persona{
    protected int numeroContrato;
    protected boolean status = false;


    public Cliente(
            String nombre,
            int añoNacimiento,
            String direccion,
            int numeroContrato,
            boolean status) {
        super(nombre, añoNacimiento, direccion);
        this.numeroContrato = numeroContrato;
        this.status = status;
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
