public class PedidoBebida extends Pedido {
    @Override
    void prepararPedido() {
        System.out.println("Preparando la bebida 🍹🍹");
    }

    @Override
    void calcularPrecio() {
        int precioFuerte = 7000;
        System.out.println("El precio del plato fuerte es de "+precioFuerte+" $");

    }
}
