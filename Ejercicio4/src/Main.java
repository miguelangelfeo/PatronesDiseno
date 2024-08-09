public class Main {
    public static void main(String[] args) {
        ControladorTareas controladorTareas = new ControladorTareas();
        
        Comando crearTarea1 = new CrearTarea(controladorTareas, "Tarea 1", "En esta tarea toca bla bla bla");
        Comando crearTarea2 = new CrearTarea(controladorTareas, "Tarea 2", "Descripcion de la segunda tarea");
        controladorTareas.ejecutarComando(crearTarea1);
        controladorTareas.ejecutarComando(crearTarea2);
        controladorTareas.verTareas();
        System.out.println("-----------");
        Comando editarTarea1 = new EditarTarea(controladorTareas.getTareas().get(0), "Tarea 1 actualizada", "Descripcion de la primera");
        controladorTareas.ejecutarComando(editarTarea1);
        controladorTareas.verTareas();
        System.out.println("-----------");
        controladorTareas.deshacerUltimo();
        controladorTareas.verTareas();
        System.out.println("-----------");
        Comando completarTarea1 = new CompletarTarea(controladorTareas.getTareas().get(0));
        controladorTareas.ejecutarComando(completarTarea1);
        controladorTareas.verTareas();
        System.out.println("-----------");
        controladorTareas.deshacerUltimo();
        controladorTareas.verTareas();
    }
}
