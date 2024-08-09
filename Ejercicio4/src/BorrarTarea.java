public class BorrarTarea implements Comando {
    private ControladorTareas controladorTareas;
    private Tarea tarea;

    public BorrarTarea(ControladorTareas controladorTareas, Tarea tarea) {
        this.controladorTareas = controladorTareas;
        this.tarea = tarea;
    }

    @Override
    public void ejecutar() {
        controladorTareas.borrarTarea(tarea);
    }

    @Override
    public void deshacer() {
        controladorTareas.addTarea(tarea);
    }
}