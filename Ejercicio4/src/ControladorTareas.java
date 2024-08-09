import java.util.ArrayList;
import java.util.List;

public class ControladorTareas {
    private List<Tarea> tareas = new ArrayList<>();
    private HistorialTareas historial = new HistorialTareas();

    public void ejecutarComando(Comando comando) {
        comando.ejecutar();
        historial.push(comando);
    }

    public void deshacerUltimo() {
        if (!historial.isEmpty()) {
            Comando ultiComando = historial.pop();
            ultiComando.deshacer();
        }
    }

    public void addTarea(Tarea tarea) {
        tareas.add(tarea);
        System.out.println("Tarea creada: " + tarea);
    }

    public void borrarTarea(Tarea tarea) {
        tareas.remove(tarea);
        System.out.println("Tarea borrada: " + tarea);
    }

    public void verTareas() {
        for (Tarea tarea : tareas) {
            System.out.println(tarea);
        }
    }

    public List<Tarea> getTareas() {
        return tareas;
    }
}