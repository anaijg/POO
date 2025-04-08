package interfaces.ejemplointerfaces.modelo;

public class Lapiz extends Herramienta implements Dibujable{

    public Lapiz(int grosor, String color) {
        super(grosor, color);
    }

    public void dibujarRecta() {
        System.out.println("dibujando una recta con el lápiz");
        System.out.println("--------------------------------");
    }

    public void dibujarCurva() {
        System.out.println("dibujando una curva con el lápiz");
        System.out.println("         *");
        System.out.println("        * *");
        System.out.println("       *   *");
        System.out.println("      *     *");
        System.out.println("     *       *");
        System.out.println("    *         *");
        System.out.println("   *           *");
        System.out.println("  *             *");
        System.out.println(" *               *");
        System.out.println("*                 *");
    }

    public void dibujarLibre() {
        System.out.println("dibujo libre con el lápiz");
        System.out.println("\\_o_/");
        System.out.println("   |");
        System.out.println("  / \\");
    }

}
