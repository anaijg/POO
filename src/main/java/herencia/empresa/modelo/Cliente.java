package herencia.empresa.modelo;

import java.time.LocalDate;

public class Cliente extends Persona{
    private String telefonoDeContacto;
    //
    public Cliente(
            String nombre,
            LocalDate fechaDeNacimiento,
            String telefonoDeContacto) {
        super(nombre, fechaDeNacimiento);
        // comprobamos que el teléfono viene bien
        // cualquier cosa que no sea un número, lo reemplazamos por nada (o sea, lo quitamos)
        // pero antes inicializo el atributo
        //this.telefonoDeContacto = "888888888";
       if(telefonoDeContacto.matches("\\d{9}")) {
           this.telefonoDeContacto = telefonoDeContacto;
       } else {
           this.telefonoDeContacto = "Desconocido";
       }
    }

    // si el cliente no tiene teléfono lo creamos solo con nombre y fecha


    public Cliente(String nombre, LocalDate fechaDeNacimiento) {
        super(nombre, fechaDeNacimiento);
        // si no hay teléfono,
        this.telefonoDeContacto = "Desconocido";
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("    teléfono: " + this.telefonoDeContacto);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
