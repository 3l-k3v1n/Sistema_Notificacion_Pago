package adapter;

public class MainAdapter {

    public static void main(String[] args) {
        System.out.println("=== PATRON ADAPTER ===\n");

        System.out.println("-- Pago con PayPal --");
        Pago pagoPayPal = new PayPalAdapter(new ServicioPayPalExterno());
        pagoPayPal.pagar(49.99);

        System.out.println();

        System.out.println("-- Pago con Stripe --");
        Pago pagoStripe = new StripeAdapter(new ServicioStripeExterno(), "tok_abc123xyz");
        pagoStripe.pagar(120.50);
        System.out.println();
        System.out.println("El sistema siempre llamó a pagar().");
        System.out.println("Los adaptadores tradujeron internamente la llamada a cada API externa.");
    }
}
