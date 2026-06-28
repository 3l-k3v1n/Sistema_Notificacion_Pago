package factory;

public class MainFactory {

    public static void main(String[] args) {
        System.out.println("=== PATRÓN FACTORY ===\n");

        Notificacion email = NotificacionFactory.crear(NotificacionFactory.EMAIL);
        email.enviarMensaje("usuario@email.com", "Tu pedido ha sido confirmado.");

        System.out.println();

        Notificacion sms = NotificacionFactory.crear(NotificacionFactory.SMS);
        sms.enviarMensaje("+593987654321", "Tu código de verificación es 4821.");

        System.out.println();

        try {
            Notificacion invalido = NotificacionFactory.crear("PUSH");
        } catch (IllegalArgumentException e) {
            System.out.println("Error esperado: " + e.getMessage());
        }
    }
}
