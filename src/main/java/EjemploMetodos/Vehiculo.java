package EjemploMetodos;

public class Vehiculo {
    private String Matricula;
    private Combustible combustible;
    private int ruedas;
    private int puertas;
    private int marchas;
    private boolean automatico;
    private int potencia;
    private Color color;
    private Propietario propietario;

    public Vehiculo(String matricula, Combustible combustible, int ruedas, int puertas,int marchas, boolean automatico, int potencia, Color color, Propietario propietario) {
        Matricula = matricula;
        this.combustible = combustible;
        this.ruedas = ruedas;
        this.puertas = puertas;
        this.marchas = marchas;
        this.automatico = automatico;
        this.potencia = potencia;
        this.color = color;
        this.propietario = propietario;
    }

    public String getMatricula() {
        return Matricula;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "Matricula='" + Matricula + '\'' +
                ", combustible=" + combustible +
                ", ruedas=" + ruedas +
                ", puertas=" + puertas +
                ", marchas=" + marchas +
                ", automatico=" + automatico +
                ", potencia=" + potencia +
                ", color=" + color +
                ", propietario=" + propietario +
                '}';
    }


    /**
     * return cadena que devuelve nombre completo
     * @param nuevoPropietario
     */
    public void transferirPropietario(Propietario nuevoPropietario){
        this.propietario = nuevoPropietario;
        System.out.println("Ahora el nuevo propietario es " + nuevoPropietario.nombreCompleto());


    }

    public boolean esDeAltaPotencia(){
        return potencia > 140;
    }

    public void cambiaColor(Color nuevoColor) {
        this.color = nuevoColor;
        System.out.println("El color ha cambiado a " + color);
    }

    public boolean esElectrico(){
        return combustible == Combustible.Electrico;
    }

    public boolean comprobarMatricula (){
        // recorremos la matricula caracter a caracter
        boolean matriculaOk = true;
        for (int i = 0; i < Matricula.length(); i++) {
            if (i == 0 || i == 1 || i == 2 || i == 3) {
                if (!Character.isLetter(Matricula.charAt(i))) {
                    matriculaOk = false;
                    break;
                }
            }
        }

        return false;
    }
}
