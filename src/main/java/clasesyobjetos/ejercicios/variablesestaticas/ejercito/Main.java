package clasesyobjetos.ejercicios.variablesestaticas.ejercito;

//   i. 	contiene un método main.
//Crea los siguientes objetos: 5 de tipo Unidad, 3 de tipo Caballero, 1 General, 1 Médico.
//Muestra cuántos objetos de cada tipo contiene nuestro ejército.

public class Main {

    public static void main(String[] args) {

        Unidad unidad1 = new Unidad("Marina");
        Unidad unidad2 = new Unidad("Infanteria");
        Unidad unidad3 = new Unidad("Armada");
        Unidad unidad4 = new Unidad("caballería");
        Unidad unidad5 = new Unidad("Milicia");

        Caballero caballero1 = new Caballero("Don quijote");
        Caballero caballero2 = new Caballero("Lancelot");
        Caballero caballero3 = new Caballero("John Show");

        General general1 = new General("Magat");

        Medico medico1 = new Medico("House");

        System.out.println("Mi ejercito tiene: ");
        System.out.println(Unidad.unidades + " unidades ");
        System.out.println(Caballero.caballeros + " caballeros ");
        System.out.println(General.generales + " generales ");
        System.out.println(Medico.medico + " medicos ");


    }

}
