public class Tarea {
    private String nombre;
    private String descripcion;
    private boolean completado;

    public Tarea(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.completado = false;
    }

    public void editar(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void completar() {
        this.completado = true;
    }

    public void incompleta() {
        this.completado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean completado() {
        return completado;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", completado=" + completado +
                '}';
    }
}