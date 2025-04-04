package ejerciciossobreescritura.ejercicio2;

/**
 * Crea una superclase llamada Notificacion con un atributo mensaje (String) y un método abstracto enviar() que no devuelve nada.
 * Crea tres subclases concretas: NotificacionEmail (con atributo destinatario), NotificacionSMS (con atributo numeroTelefono), y NotificacionPush (con atributo tokenDispositivo).
 * Implementa el método enviar() en cada subclase para simular el envío de la notificación al medio correspondiente (puedes simplemente imprimir un mensaje indicando a dónde y qué se envía).
 * Sobrescribe el método toString() en cada subclase para que devuelva una representación legible de la notificación, incluyendo el mensaje y la información específica del medio de envío.
 * - Crea una clase Main que cree diferentes tipos de notificaciones y llame al método enviar() en cada una.
 */
public class Notificacion {
    String mensaje;

    public void enviar(){
    }
}

class NotificacionEmail{
 private String destinatario;
    @Override
    public String toString() {
        return enviar();
    }
    public String enviar(){
        return "Se envia a España un monitor";
    }
}
class NotificacionSMS{
 private int numeroTelefono;
    @Override
    public String toString() {
        return enviar();
    }
    public String enviar(){
        return "Se envia a España un raton";
    }
}
class NotificacionPush{
 private int tokenDispositivo;

    @Override
    public String toString() {
        return enviar();
    }

    public String enviar(){
        return "Se envia a España un teclado";
    }
}