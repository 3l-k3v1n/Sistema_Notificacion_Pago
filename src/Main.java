import singleton.MainSingleton;
import factory.MainFactory;
import builder.MainBuilder;
import adapter.MainAdapter;

public class Main {
  public static void main(String[] args) {
    System.out.println("========================================");
    System.out.println("   SISTEMA DE PATRONES DE DISEÑO");
    System.out.println("========================================\n");

    MainSingleton.main(args);
    System.out.println("\n----------------------------------------\n");

    MainFactory.main(args);
    System.out.println("\n----------------------------------------\n");

    MainBuilder.main(args);
    System.out.println("\n----------------------------------------\n");

    MainAdapter.main(args);

    System.out.println("\n========================================");
    System.out.println("   FIN DE LA DEMOSTRACION");
    System.out.println("========================================");
  }
}