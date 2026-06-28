package builder;

import java.time.LocalDate;

public class Tarea {

    private final String titulo;
    private final String descripcion;
    private final String responsable;
    private final LocalDate fechaLimite;
    private final int prioridad;
    private final String etiqueta;

    private Tarea(Builder builder) {
        this.titulo       = builder.titulo;
        this.descripcion  = builder.descripcion;
        this.responsable  = builder.responsable;
        this.fechaLimite  = builder.fechaLimite;
        this.prioridad    = builder.prioridad;
        this.etiqueta     = builder.etiqueta;
    }

    public String getTitulo()          { return titulo; }
    public String getDescripcion()     { return descripcion; }
    public String getResponsable()     { return responsable; }
    public LocalDate getFechaLimite()  { return fechaLimite; }
    public int getPrioridad()          { return prioridad; }
    public String getEtiqueta()        { return etiqueta; }

    @Override
    public String toString() {
        String prioridadTexto = prioridad == 1 ? "Alta" : prioridad == 2 ? "Media" : "Baja";
        return "Tarea{\n"
                + "  titulo='"      + titulo      + "'\n"
                + "  descripcion='" + descripcion + "'\n"
                + "  responsable='" + (responsable  != null ? responsable  : "Sin asignar") + "'\n"
                + "  fechaLimite="  + (fechaLimite  != null ? fechaLimite  : "Sin fecha")   + "\n"
                + "  prioridad="    + prioridadTexto + "\n"
                + "  etiqueta='"    + (etiqueta != null ? etiqueta : "Sin etiqueta") + "'\n"
                + "}";
    }

    public static class Builder {

        private final String titulo;
        private final String descripcion;

        private String responsable  = null;
        private LocalDate fechaLimite = null;
        private int prioridad       = 2;
        private String etiqueta     = null;

        public Builder(String titulo, String descripcion) {
            if (titulo == null || titulo.isBlank())
                throw new IllegalArgumentException("El titulo no puede estar vacio");
            if (descripcion == null || descripcion.isBlank())
                throw new IllegalArgumentException("La descripcion no puede estar vacia");
            this.titulo      = titulo;
            this.descripcion = descripcion;
        }

        public Builder responsable(String responsable) {
            this.responsable = responsable;
            return this;
        }

        public Builder fechaLimite(LocalDate fechaLimite) {
            this.fechaLimite = fechaLimite;
            return this;
        }

        public Builder prioridad(int prioridad) {
            if (prioridad < 1 || prioridad > 3)
                throw new IllegalArgumentException("Prioridad debe ser 1, 2 o 3");
            this.prioridad = prioridad;
            return this;
        }

        public Builder etiqueta(String etiqueta) {
            this.etiqueta = etiqueta;
            return this;
        }

        public Tarea build() {
            return new Tarea(this);
        }
    }
}
