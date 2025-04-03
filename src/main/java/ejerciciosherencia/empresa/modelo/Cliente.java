package ejerciciosherencia.empresa.modelo;

import java.time.LocalDate;

public class Cliente extends Persona{
    private String telefonoDeContacto = "0123456a8";
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
        for (int i = 0; i < telefonoDeContacto.length(); i++) {
            Character carácter = telefonoDeContacto.charAt(i);
            System.out.println(carácter);
            if (!Character.isDigit(carácter)) {
                // en este momento el atributo
                telefonoDeContacto.replaceAll("[^0-9]", "");
            }
        }
        // ahora que sólo tengo dígitos en el teléfono, compruebo que sean 9 cifras
        if (telefonoDeContacto.length() == 9) {
            this.telefonoDeContacto = telefonoDeContacto;
        } else {
            this.telefonoDeContacto = "Desconocido";
        }

    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("    teléfono: " + this.telefonoDeContacto);
    }
}
