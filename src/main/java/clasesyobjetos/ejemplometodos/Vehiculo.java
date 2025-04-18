package clasesyobjetos.ejemplometodos;

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


    //Método toString

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
     * Método transferirPropietario, cambia el propietario antiguo por el nuevo
     *
     * @param nuevoPropietario
     */
    public void tranferirirPropietario(Propietario nuevoPropietario) {
        this.propietario = nuevoPropietario;
        System.out.println("Ahora el nuevo porpietario del coche con matricula " + matricula + " es " + nuevoPropietario);
    }

    /**
     * esDeAltaPotenica
     *
     * @return true si la potencia es superior a 200
     */

    public boolean esDeAltaPotencia() {
        return potencia > 200;
    }

    /**
     * cambiaColor: sustituye el color antiguo por el nuevo
     *
     * @param nuevoColor
     */

    public void cambiarColor(Color nuevoColor) {
        this.color = nuevoColor;
        System.out.println("El nuevo color del vehiculo con matricula " + matricula + " ha sido cambiado a  " + nuevoColor);


    }


    /**
     * esElectrico()
     *
     * @return true si el coche es eléctrico
     */

    public boolean esEletrico() {

        return combustible.equals(Combustible.ELECTRICO);
    }

    /**
     * comprobarMatricula
     * comprueba si la matricula tiene estructura: NNNN-LLL (N es numero, L es letra)
     * utiliza el metodo Character.isDigit() y Character.isLetter() ¡¡¡new !!!
     *
     * @return true si el formato de la matricula es correcto
     */

    public boolean comprobarMatricula() {

        //recorremos la matricula caracter a caracter
        // A partir de ahora en vez de char (tipo primitivo) vamos a utilizar Character
        //como los indices son importantes, utiliazamos for en vez de foreach
        boolean matriculaOK = true;
        for (int i = 0; i < matricula.length(); i++) {
            if (i == 0 || i == 1 || i == 2 || i == 3) {// tienen que ser letras
                if (!Character.isLetter(matricula.charAt(i))) {// si alguno de los primeros cuatro caracteres no es una letra, es que la matricula esta mal, y no hace falta
                    //seguir mirando más ( por eso el break)
                    matriculaOK = false;
                    break;
                }
            }
        }
        return false;
    }


}
