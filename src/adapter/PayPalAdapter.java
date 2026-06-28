package adapter;

public class PayPalAdapter implements Pago {

    private final ServicioPayPalExterno servicioPayPal;

    public PayPalAdapter(ServicioPayPalExterno servicioPayPal) {
        this.servicioPayPal = servicioPayPal;
    }

    @Override
    public void pagar(double monto) {
        servicioPayPal.iniciarTransaccion("USD", monto);
    }
}
