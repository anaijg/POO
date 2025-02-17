package ejemplometodos;

public class Vehiculo {

    //caracteristicas
    private String matricula;
    private Combustible combustible;
    private int ruedas;
    private int potencia;
    private boolean automatico;
    private Color color;
    private Propietario propietario;

    // constructores

    public Vehiculo(String matricula, Combustible combustible, int ruedas, int potencia, boolean automatico, Color color, Propietario propietario) {
        this.matricula = matricula;
        this.combustible = combustible;
        this.ruedas = ruedas;
        this.potencia = potencia;
        this.automatico = automatico;
        this.color = color;
        this.propietario = propietario;
    }


    //


    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", combustible=" + combustible +
                ", ruedas=" + ruedas +
                ", potencia=" + potencia +
                ", automatico=" + automatico +
                ", color=" + color +
                ", propietario=" + propietario +
                '}';
    }

    // metodos de instancia no lleva  la palabra static y solo pueden ser llamdos mediante un objeto de la clase en que se declara

    /**
     * Método transferirPropiedad, cambia el propietario antiguo por el nuevo
     * @param nuevoPropietario
     */

    /**
     * esDeAltaPotenica
     * @return true si la potencia es superior a 200
     */

    /**
     * cambia color: sustituye el color antiguo por el nuevo
     */

    /**
     * esElectrico()
     * @return  true si el coche es eléctrico
     *
     */

    /**
     * comprobarMatricula
     * comprueba si la matricula tiene estructura: NNNN-LLL (N es numero, L es letra)
     * utiliza el metodo Character.isDigit() y Character.isLetter()
     * @return true si el formato de la matricula es correcto
     *
     */
}
