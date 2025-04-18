package herencia.ejemplopolimorfismo;

public class AnimalMitologico {
    public void saludar() {
        System.out.println("\uD80c\uDD02");
    }
}

class Quimera extends AnimalMitologico {
    @Override
    public void saludar() {
        System.out.println("\uD83E\uDD81");
    }
}

class Main {
    public static void main(String[] args) {

        AnimalMitologico raroraro = new AnimalMitologico();
        AnimalMitologico raro = new Quimera();

        raroraro.saludar();
        raro.saludar();
    }
}
