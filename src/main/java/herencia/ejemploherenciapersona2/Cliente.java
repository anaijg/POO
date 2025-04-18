package herencia.ejemploherenciapersona2;

public class Cliente extends Persona {
    private int numeroContrato;
    private boolean esOro;

    public Cliente(
            String nombre,
            int aNacimiento,
            String direccion,
            int numeroContrato,
            boolean esOro
    ) {
        super(nombre, aNacimiento, direccion);//super = constructor de persona
        this.numeroContrato = numeroContrato;
        this.esOro = esOro;
    }

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
