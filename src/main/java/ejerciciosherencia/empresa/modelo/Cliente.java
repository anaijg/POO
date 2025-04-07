package ejerciciosherencia.empresa.modelo;

import java.time.LocalDate;

public class Cliente extends Persona {
    private String telefonoDeContacto;

    public Cliente(String nombre, LocalDate fechaNacimiento, String telefonoDeContacto) {
        super(nombre, fechaNacimiento);
        //comprobamos que el telefono viene bien, cualquier cosa que no sea un número, lo reemplazamos por nada ( o sea, lo quitamos)
        //pero antes inicializo el atributo
        //this.telefonoDeContacto = "null";

        if (telefonoDeContacto.matches("\\d{9}")) {
            this.telefonoDeContacto = telefonoDeContacto;

        } else {
            this.telefonoDeContacto = "Desconocido";

        }

    }

    //si el cliente no tiene telefono lo creamos solo com nombre y fecha


    public Cliente(String nombre, LocalDate fechaNacimiento) {
        super(nombre, fechaNacimiento);
        //si no hay telefono
        this.telefonoDeContacto = "desconocido";
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("      telefono: " + this.telefonoDeContacto);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
