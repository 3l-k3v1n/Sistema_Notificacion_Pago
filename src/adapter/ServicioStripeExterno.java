package adapter;
public class ServicioStripeExterno {

    public void cobrar(String tarjetaToken, long centavos) {
        System.out.println("[Stripe] Procesando cobro...");
        System.out.println("[Stripe] Token tarjeta: " + tarjetaToken);
        System.out.println("[Stripe] Monto en centavos: " + centavos);
        System.out.println("[Stripe] Pago procesado correctamente.");
    }
}
