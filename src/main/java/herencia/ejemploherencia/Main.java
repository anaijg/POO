package herencia.ejemploherencia;

public class Main {
    public static void main(String[] args) {

        System.out.println("SUPERCLASE");
        Superclase superclase = new Superclase("Hola desde la superclase");
        System.out.println(superclase);
        System.out.println("\n\n");

        System.out.println("SubclaseA");
        SubClaseA subClaseA = new SubClaseA("Hola desde la superclase ", "dese la subclaseA");
        System.out.println(subClaseA);

        System.out.println("\n\nSUBCLASEB");
        SubClaseB subClaseB = new SubClaseB("Super desde sub B", "hola desde la clase B");
        System.out.println(subClaseB);

        System.out.println("\n\nSubclaseD");
        SubClaseD subClaseD = new SubClaseD("Super desed niesta S", "SubA desde hija D ", "hola desde la subD");
        System.out.println(subClaseD);

        System.out.println("\n\nsubclaseC");
        SubClaseC subClaseC = new SubClaseC("Hola desde la clase padre", "hola desde la clase hija", "hola desde la clase c");
        System.out.println(subClaseC);




    }
}
