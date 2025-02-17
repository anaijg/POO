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

    // metodos de instancia no lleva  la palabra static y solo pueden ser llamdos mediante una

    /**
     * Método
     */

    /**
     * esElectrico()
     * @return  true si el coche es eléctrico
     *
     */

    /**
     * comprobarMatricula
     *
     */
}
