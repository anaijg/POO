package ejemploherenciapersona;

public class Cliente extends Persona{
    private int numeroContrato;
    private boolean esOro;



    public int getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public boolean isEsOro() {
        return esOro;
    }

    public void setEsOro(boolean esOro) {
        this.esOro = esOro;
    }
}
