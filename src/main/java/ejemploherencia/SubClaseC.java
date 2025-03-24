package ejemploherencia;

public class SubClaseC extends SubClaseA {
    private String atributoSubClaseC;


    public SubClaseC(String atributoSuperclase,
                     String atributoSubClaseA,
                     String atributoSubClaseC) {
        super(atributoSuperclase, atributoSubClaseA);
        this.atributoSubClaseC = atributoSubClaseC;
    }

    public String getAtributoSubClaseC() {
        return atributoSubClaseC;
    }

    public void setAtributoSubClaseC(String atributoSubClaseC) {
        this.atributoSubClaseC = atributoSubClaseC;
    }

    @Override
    public String toString() {
        return "SubClaseC{\n" +
                "\natributoSubClaseC='" + atributoSubClaseC + '\'' +
                ",\n atributoSubClaseA='" + atributoSubClaseA + '\'' +
                ",\n atributoSuperclase='" + atributoSuperclase + '\'' +
                '}';
    }
}
