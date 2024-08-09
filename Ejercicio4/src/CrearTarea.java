public class CrearTarea implements Comando {
    private ControladorTareas controladorTareas;
    private Tarea tarea;

    public CrearTarea(ControladorTareas controladorTareas, String nombre, String descripcion) {
        this.controladorTareas = controladorTareas;  
        this.tarea = new Tarea(nombre, descripcion);
    }

    @Override
    public void ejecutar() {
        controladorTareas.addTarea(tarea);  
    }

    @Override
    public void deshacer() {
        controladorTareas.borrarTarea(tarea);
    }
}