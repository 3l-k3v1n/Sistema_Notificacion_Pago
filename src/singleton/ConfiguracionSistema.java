package singleton;

public class ConfiguracionSistema {

    private static ConfiguracionSistema instancia;

    private String host;
    private int puerto;
    private String nombreApp;


    private ConfiguracionSistema() {
        this.host = "localhost";
        this.puerto = 8080;
        this.nombreApp = "MiAplicacion";
    }


    public static ConfiguracionSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionSistema();
        }
        return instancia;
    }

    // Getters y setters
    public String getHost() { return host; }
    public void setHost(String host) { this.host = host; }

    public int getPuerto() { return puerto; }
    public void setPuerto(int puerto) { this.puerto = puerto; }

    public String getNombreApp() { return nombreApp; }
    public void setNombreApp(String nombreApp) { this.nombreApp = nombreApp; }

    @Override
    public String toString() {
        return "ConfiguracionSistema{host='" + host + "', puerto=" + puerto
                + ", nombreApp='" + nombreApp + "'}";
    }
}
