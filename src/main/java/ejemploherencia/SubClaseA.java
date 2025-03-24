package ejemploherencia;

public class SubClaseA extends Superclase {

    protected String atributoSubClaseA;

    public SubClaseA(String atributoSuperclase, String atributoSubClaseA) {
        super(atributoSuperclase);
        this.atributoSubClaseA = atributoSubClaseA;
    }

    public String getAtributoSubClaseA() {
        return atributoSubClaseA;
    }

    public void setAtributoSubClaseA(String atributoSubClaseA) {
        this.atributoSubClaseA = atributoSubClaseA;
    }

    @Override
    public String toString() {
        return "SubClaseA{\n" +
                "atributoSubClaseA='" + atributoSubClaseA + '\'' +
                ", atributoSuperclase='" + atributoSuperclase + '\'' +
                '}';
    }
}
