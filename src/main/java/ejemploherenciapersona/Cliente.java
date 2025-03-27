package ejemploherenciapersona;

public class Cliente extends Persona{
    private int numeroDeContrato;
    private boolean statusOro;

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
