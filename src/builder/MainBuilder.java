package builder;

import java.time.LocalDate;

public class MainBuilder {

    public static void main(String[] args) {
        System.out.println("=== PATRÓN BUILDER ===\n");

        Tarea tareaSimple = new Tarea.Builder("Revisar documentación", "Leer el manual de usuario v2")
                .build();

        System.out.println("Tarea simple:");
        System.out.println(tareaSimple);

        Tarea tareaCompleta = new Tarea.Builder("Implementar login", "Crear formulario con JWT")
                .responsable("Ana García")
                .fechaLimite(LocalDate.of(2025, 7, 15))
                .prioridad(1)
                .etiqueta("backend")
                .build();

        System.out.println("\nTarea completa (métodos encadenados):");
        System.out.println(tareaCompleta);

        Tarea tareaMedia = new Tarea.Builder("Actualizar dependencias", "Subir versiones en pom.xml")
                .prioridad(3)
                .etiqueta("mantenimiento")
                .build();

        System.out.println("\nTarea con opcionales parciales:");
        System.out.println(tareaMedia);
    }
}
