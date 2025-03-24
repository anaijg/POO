package ejemploherencia;

public class SubClaseB extends Superclase{
    private String atributoSubClaseB;

    public SubClaseB(
            String atributoSuperclase,
            String atributoSubClaseB
    ) {
        super(atributoSuperclase);
        this.atributoSubClaseB = atributoSubClaseB;
    }

    public String getAtributoSubClaseB() {
        return atributoSubClaseB;
    }

    public void setAtributoSubClaseB(String atributoSubClaseB) {
        this.atributoSubClaseB = atributoSubClaseB;
    }

    @Override
    public String toString() {
        return "SubClaseB{\n" +
                "atributoSubClaseB='" + atributoSubClaseB + '\'' +
                ",\natributoSuperclase='" + atributoSuperclase + "\n}";
    }
}
