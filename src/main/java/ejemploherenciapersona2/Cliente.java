package ejemploherenciapersona2;

public class Cliente extends Persona {
    private int numeroDeContrato;
    private boolean statusOro;

    public Cliente(
            String nombre,
            int añoNacimento,
            String direccion,
            int numeroDeContrato,
            boolean statusOro
    ) {
        super(nombre, añoNacimento, direccion); // super = constructor de Persona
        this.numeroDeContrato = numeroDeContrato;
        this.statusOro = statusOro;
    }

    public int getNumeroDeContrato() {
        return numeroDeContrato;
    }

    public void setNumeroDeContrato(int numeroDeContrato) {
        this.numeroDeContrato = numeroDeContrato;
    }

    public boolean isStatusOro() {
        return statusOro;
    }

    public void setStatusOro(boolean statusOro) {
        this.statusOro = statusOro;
    }
}
