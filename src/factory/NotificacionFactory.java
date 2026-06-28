package factory;

public class NotificacionFactory {

    public static final String EMAIL = "EMAIL";
    public static final String SMS   = "SMS";

    public static Notificacion crear(String tipo) {
        switch (tipo.toUpperCase()) {
            case EMAIL:
                return new NotificacionEmail();
            case SMS:
                return new NotificacionSMS();
            default:
                throw new IllegalArgumentException("Tipo de notificación desconocido: " + tipo);
        }
    }
}
