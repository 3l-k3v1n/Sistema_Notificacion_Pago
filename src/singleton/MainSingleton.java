package singleton;

public class MainSingleton {

    public static void main(String[] args) {
        System.out.println("=== PATRON SINGLETON ===\n");


        ConfiguracionSistema c1 = ConfiguracionSistema.getInstancia();
        ConfiguracionSistema c2 = ConfiguracionSistema.getInstancia();


        System.out.println("c1 == c2: " + (c1 == c2));
        System.out.println("Configuracion inicial: " + c1);

        c1.setHost("192.168.1.10");
        c1.setPuerto(9090);
        System.out.println("\nDespues de modificar c1:");
        System.out.println("  c1: " + c1);
        System.out.println("  c2: " + c2);
        System.out.println("  (c1 y c2 apuntan al mismo objeto, por eso c2 también cambió)");
    }
}
