public class EditarTarea implements Comando {
    private Tarea tarea;
    private String nuevoNombre;
    private String nuevaDescripcion;
    private String nombreAnterior;
    private String descripcionAnterior;

    public EditarTarea(Tarea tarea, String nuevoNombre, String nuevaDescripcion) {
        this.tarea = tarea;
        this.nuevoNombre = nuevoNombre;
        this.nuevaDescripcion = nuevaDescripcion;
        this.nombreAnterior = tarea.getNombre();
        this.descripcionAnterior = tarea.getDescripcion();
    }

    @Override
    public void ejecutar() {
        tarea.editar(nuevoNombre, nuevaDescripcion);
    }

    @Override
    public void deshacer() {
        tarea.editar(nombreAnterior, descripcionAnterior);
    }
}