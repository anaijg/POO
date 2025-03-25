package ejerciciosdaniel.ejercito;

public class Main
{
    public static void main(String[] args) {
        Unidad unidad1 = new Unidad("Pepe");
        Unidad unidad2 = new Unidad("Pepe");
        Unidad unidad3 = new Unidad("Pepe");
        Unidad unidad4 = new Unidad("Pepe");
        Unidad unidad5 = new Unidad("Pepe");

        Caballero caballero1 = new Caballero("Juan");
        Caballero caballero2 = new Caballero("Juan");
        Caballero caballero3 = new Caballero("Juan");

        General general1 = new General("Jere");

        Medico medico1 = new Medico("Dani");
        System.out.println("Hay " + Unidad.unidades + " de tipo unidades");
        System.out.println("Hay " + Caballero.caballeros + " de tipo caballeros");
        System.out.println("Hay " +  General.generales + " de tipo generales");
        System.out.println("Hay " + Medico.medicos + " de tipo medicos");
    }

}
