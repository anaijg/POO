package ejercicios.variablesestaticas.ejercito;

public class Main {
    public static void main(String[] args) {
        // Crea los siguientes objetos: 5 de tipo Unidad, 3 de tipo Caballero, 1 General, 1 Médico.
        //Muestra cuántos objetos de cada tipo contiene nuestro ejército.
        Unidad unidad1 = new Unidad("Marina");
        Unidad unidad2 = new Unidad("Infantería");
        Unidad unidad3 = new Unidad("Armada");
        Unidad unidad4 = new Unidad("Caballería");
        Unidad unidad5 = new Unidad("Milicia");

        Caballero caballero1 = new Caballero("Don Quijote");
        Caballero caballero2 = new Caballero("Lancelot");
        Caballero caballero3 = new Caballero("John Snow");

        General general = new General("Magat");

        Medico medico = new Medico("House");

        System.out.println("Mi ejército tiene: ");
        System.out.println(Unidad.unidades + " unidades");
        System.out.println(Caballero.caballeros + " caballeros");
        System.out.println(General.generales + " generales");
        System.out.println(Medico.medicos + " médicos");

    }
}
