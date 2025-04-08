package herencia.ejemploherencia;

public class Superclase {
    protected String atributoSuperclase;

    public Superclase(String atributoSuperclase) {
        this.atributoSuperclase = atributoSuperclase;
    }

    public String getAtributoSuperclase() {

        return atributoSuperclase;
    }

    public void setAtributoSuperclase(String atributoSuperclase) {
        this.atributoSuperclase = atributoSuperclase;
    }

    @Override
    public String toString() {
        return "Superclase{" +
                "atributoSuperclase='" + atributoSuperclase + '\'' +
                '}';
    }
}
