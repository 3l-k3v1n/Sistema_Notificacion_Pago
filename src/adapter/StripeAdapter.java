package adapter;
public class StripeAdapter implements Pago {

    private final ServicioStripeExterno servicioStripe;
    private final String tarjetaToken;

    public StripeAdapter(ServicioStripeExterno servicioStripe, String tarjetaToken) {
        this.servicioStripe = servicioStripe;
        this.tarjetaToken   = tarjetaToken;
    }

    @Override
    public void pagar(double monto) {
        long centavos = Math.round(monto * 100);
        servicioStripe.cobrar(tarjetaToken, centavos);
    }
}
