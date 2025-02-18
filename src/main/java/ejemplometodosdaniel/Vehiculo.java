package ejemplometodosdaniel;

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

    /*
    metodo transferirPropiedad, cambia el propietario
     */

    public void transferirPropiedad(Propietario nuevoPropietario) {
        this.propietario = nuevoPropietario;
        System.out.println("Ahora el nuevo propietario es " + nuevoPropietario.getNombreCompleto());

    }
    /**
     * EsDeAltaPotencia
     * @return true si la potencia es superior a 200
     */
    public boolean esDeAltaPotencia() {
        return  potencia > 140;
    }

    /**
     * metodo para cambiar color
     */
        public void cambiarColor(Color nuevoColor) {
            this.color = nuevoColor;
            System.out.println("El nuevo color del coche con matricula " + matricula + " es " + nuevoColor);
        }
    /**
     *esElectrico
     */

    public boolean esElectrico() {
        return combustible.equals(Combustible.ELECTRICO);
    }

    public boolean comprobarMatricula() {
        // recorremos la matricula caracter a caracter
        boolean matriculOk = true;
        for (int i = 0; i < matricula.length(); i++) {
            if (i == 0 || i == 1 || i == 2 || i == 3) { // tienen que ser letras
                if (!Character.isLetter(matricula.charAt(i)))  { // si alguno de los 4 primeros cacarteres no es una letra la matricula esta mal
                    matriculOk = false;
                    break;
                }
            }

        }


        return false;
    }



}
