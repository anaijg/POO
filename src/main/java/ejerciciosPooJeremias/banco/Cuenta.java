package ejerciciosPooJeremias.banco;

public class Cuenta {

    private String codigo;
    private double balance;
    private Usuario propietario;

    /* Ambas clases tienen constructores
    parametrizados, los getters y setters
    correspondientes a cada atributo y un méto_do
    toString().*/

    //Constructor parametrizado (si no detalle que atributos poner, se ponen todos)

    /**
     *
     * @param codigo
     * @param balance
     * @param propietario
     */

    public Cuenta(String codigo, double balance, Usuario propietario){
        this.codigo = codigo;
        this.balance = balance;
        this.propietario = propietario;
    }

    //Getters
    public String getCodigo(){
        return "El codigo de la cuenta es: " + codigo;
    }

    public String getBalance(){
        return  "El balance es de: "+ balance;
    }

    public String getPropietario(){
        return "Los datos del usuario son:\n" + propietario;
    }

    //Setters
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setPropietario(Usuario propietario){
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "codigo='" + codigo + '\'' +
                ", balance=" + balance +
                ", propietario=" + propietario +
                '}';
    }
}
