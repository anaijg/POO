package ejemploherencia;

public class SubClaseB extends Superclase {
    private String atributoSubClaseB;

    public SubClaseB(String atributoSuperclase, String atributoSubClaseB) {
        super(atributoSuperclase);
        this.atributoSubClaseB = atributoSubClaseB;
    }

    @Override
    public String toString() {
        return "SubClaseB{\n" +
                "\natributoSubClaseB='" +
                atributoSubClaseB + '\'' +
                ", \natributoSuperclase='" +
                atributoSuperclase + '\'' +
                '}';
    }
}
