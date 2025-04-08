package herencia.ejemploherencia;

public class Main {
    public static void main(String[] args) {
        System.out.println("SUPERCLASE");
        Superclase superclase = new Superclase("Hola desde la superclase.");
        System.out.println(superclase);

        System.out.println("\n\nSUBCLASE A");
        SubClaseA subClaseA = new SubClaseA("Super desde Sub A", "Hola desde la subclase A");
        System.out.println(subClaseA);

        System.out.println("\n\nSUBCLASE D");
        SubClaseD subClaseD = new SubClaseD("Super desde nieta D", "SubA desde hija D", "hola desde SubD");
        System.out.println(subClaseD);

        System.out.println("\n\nSUBCLASE C");
        SubClaseD subClaseC = new SubClaseD("Super desde nieta C", "SubA desde hija C", "hola desde SubC");
        System.out.println(subClaseC);

        System.out.println("\n\nSUBCLASE B");
        SubClaseB subClaseB = new SubClaseB("Super desde Sub B", "Hola desde la subclase B");
        System.out.println(subClaseB);


    }
}
