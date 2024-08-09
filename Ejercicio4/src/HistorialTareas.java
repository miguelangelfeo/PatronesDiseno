import java.util.Stack;

public class HistorialTareas {
    private Stack<Comando> historial = new Stack<>();

    public void push(Comando comando) {
        historial.push(comando);
    }

    public Comando pop() {
        return historial.pop();
    }

    public boolean isEmpty() {
        return historial.isEmpty();
    }
}