package ejemplosobrecarga;

public class Mamifero {
    public String saludar() {
        return "el mamífero te saluda";
    }
}

class Gato extends Mamifero{
    @Override
    public String saludar() {
        return "Miauuuuuuu";
    }
}

class Perro extends Mamifero {
    @Override
    public String saludar() {
        return "Guau, guau";
    }
}

class Gacela extends Mamifero {

}

class Main {
    public static void main(String[] args) {
        Gato gato = new Gato(); // llamamos al constructor por defecto
        String cadena = gato.saludar(); // saludar ha quedado sobreescrito, "tapa" al de la superclase (Mamífero)
        System.out.println(cadena);

        Gacela gacela = new Gacela();
        System.out.println(gacela.saludar());

        Perro perro = new Perro();
        System.out.println(perro.saludar());
    }
}

