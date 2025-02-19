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
    public void transferirPropiedad(Propietario nuevoPropietario) {
        this.propietario = nuevoPropietario;
        System.out.println("Ahora el nuevo propietario del coche con matrícula " + matricula + " es " + nuevoPropietario.getNombreCompleto());
    }

    /**
     * esDeAltaPotencia
     * @return true si la potencia es superior a 140
     */
    public boolean esDeAltaPotencia() {
        return potencia > 140;
    }

    /**
     * cambiarColor: sustituye el color antiguo por el nuevo
     * @param nuevoColor
     */
    public void cambiarColor(Color nuevoColor) {
        this.color = nuevoColor;
        System.out.println("El nuevo color del coche con matrícula " + matricula + " es " + nuevoColor);
    }

    /**
     * esElectrico()
     * @return true si el coche es eléctrico
     */
    public boolean esElectrico() {
        return this.combustible.equals(Combustible.ELECTRICO);
    }

    /**
     * comprobarMatricula()
     * comprueba si la matrícula tiene esta esctructura: NNNN-LLL (N es número, L es letra)
     * utiliza el método Character.isDigit() y Character.isLetter() ¡¡¡new!!!
     * @return true si el formato de la matrícula es correcto
     */
    public boolean comprobarMatricula() {
        // recorremos la matrícula carácter a carácter
        // a partir de ahora en vez de char (tipo primitivo) vamos a utilizar Character
        // como los índices son importantes, utilizamos for en vez de foreach
        boolean matriculaOK = true;
        for (int i = 0; i < matricula.length(); i++) {
            if (i == 0 || i == 1 || i == 2 || i == 3) { // tienen que ser letras
                if (!Character.isLetter(matricula.charAt(i))) { // si alguno de los primeros cuatro caracteres no es una letra, es que la matrícula está mal, y no hace falta seguir mirando más (por eso el break)
                    matriculaOK = false;
                    break;
                }
            }
        }




        return false;
    }



}
