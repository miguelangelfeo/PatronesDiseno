public class CompletarTarea implements Comando {
    private Tarea tarea;

    public CompletarTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    @Override
    public void ejecutar() {
        tarea.completar();
    }

    @Override
    public void deshacer() {
        tarea.incompleta();
    }
}