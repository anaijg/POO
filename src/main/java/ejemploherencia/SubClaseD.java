package ejemploherencia;

public class SubClaseD extends SubClaseA {

    private String atributoSubClaseD;


    public SubClaseD(String atributoSuperclase, String atributoSubClaseA, String atributoSubClaseD) {
        super(atributoSuperclase, atributoSubClaseA);
        this.atributoSubClaseD = atributoSubClaseD;
    }

    @Override
    public String toString() {
        return "SubClaseD{\n" +
                "\natributoSubClaseD='" + atributoSubClaseD + '\'' +
                ",\n atributoSubClaseA='" + atributoSubClaseA + '\'' +
                ",\n atributoSuperclase='" + atributoSuperclase + '\'' +
                '}';
    }
}
