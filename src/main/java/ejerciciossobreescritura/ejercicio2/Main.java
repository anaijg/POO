package ejerciciossobreescritura.ejercicio2;

/**
 * Crea una clase Main que cree diferentes tipos de notificaciones y llame al método enviar() en cada una.
 */
public class Main {
    public static void main(String[] args) {
        Notificacion notificacion = new Notificacion();
        NotificacionEmail notificacionEmail = new NotificacionEmail();
        NotificacionPush notificacionPush = new NotificacionPush();
        NotificacionSMS notificacionSMS = new NotificacionSMS();

        System.out.println(notificacionEmail.enviar());
        System.out.println(notificacionPush.enviar());
        System.out.println(notificacionSMS.enviar());
    }
}
