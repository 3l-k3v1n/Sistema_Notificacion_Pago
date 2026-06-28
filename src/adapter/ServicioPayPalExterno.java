package adapter;

public class ServicioPayPalExterno {

    public void iniciarTransaccion(String moneda, double cantidad) {
        System.out.println("[PayPal] Iniciando transaccion...");
        System.out.println("[PayPal] Moneda: " + moneda);
        System.out.println("[PayPal] Cantidad: " + cantidad);
        System.out.println("[PayPal] Transaccion completada con exito.");
    }
}
