public abstract class Pedido {
    public void procesarPedido() {
        recibirPedido();
        prepararPedido();
        verificarDisponibilidad();
        calcularPrecio();
    }

    void recibirPedido() {
        System.out.println("Tomando el pedido");
    }

    abstract void prepararPedido();

    void verificarDisponibilidad() {

    }

    abstract void calcularPrecio();
}

