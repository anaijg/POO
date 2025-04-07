package ejemplosobrecarga;

public class Mamifero {
    public String saludar() {
        return "El mamifero te saluda";
    }
}

class Gato extends Mamifero {
    @Override
    public String saludar() {
        return "Miauuuuuuuuuuuu";
    }
}

class Perro extends Mamifero{
    @Override
    public String saludar() {
        return "Gauu, guauu, guauu";
    }
}

class Gacela extends Mamifero{
    @Override
    public String saludar() {
        return "La gacela es silenciosa, pero te observa";
    }
}

class Main{
    public static void main(String[] args) {
        Gato gato = new Gato(); // Instanciar directamente Gato
        System.out.println(gato.saludar()); // Imprime: Miauuuuuuuuuuuu

        Perro perro = new Perro(); // Instanciar directamente Perro
        System.out.println(perro.saludar()); // Imprime: Guauuuuuuu, guauuu, guauuuuu

        Gacela gacela = new Gacela(); // Instanciar directamente Gacela
        System.out.println(gacela.saludar()); // Imprime: La gacela es silenciosa, pero te observa.

    }
}
