package ejemplometodos;

public class Vehiculo {
    private String matricula;
    private Combustible combustible;
    private int ruedas;
    private int potencia;
    private boolean automatico;
    private Color color;
    private Propietario propietario;

    public Vehiculo(String matricula, Combustible combustible, int ruedas, int potencia, boolean automatico, Color color, Propietario propietario) {
        this.matricula = matricula;
        this.combustible = combustible;
        this.ruedas = ruedas;
        this.potencia = potencia;
        this.automatico = automatico;
        this.color = color;
        this.propietario = propietario;
    }

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

    // métodos de instancia: no llevan la palabra static y sólo pueden ser llamados mediante un objeto de la clase en que se declaran

    /**
     * Método transferirPropiedad, cambia el propietario antiguo por el nuevo
     * @param nuevoPropietario
     */

    /**
     * esDeAltaPotencia
     * @return true si la potencia es superior a 200
     */


    /**
     * cambiarColor: sustituye el color antiguo por el nuevo
     * @param nuevoColor
     */


    /**
     * esElectrico()
     * @return true si el coche es eléctrico
     */

    /**
     * comprobarMatricula()
     * comprueba si la matrícula tiene esta esctructura: NNNN-LLL (N es número, L es letra)
     * utiliza el método Character.isDigit() y Character.isLetter()
     * @return true si el formato de la matrícula es correcto
     */


}
