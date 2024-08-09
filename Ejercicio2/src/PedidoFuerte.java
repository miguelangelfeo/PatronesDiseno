public class PedidoFuerte extends Pedido {


    @Override
    void prepararPedido() {
        System.out.println("Preparando el plato fuerte 🍗🍗");
    }

    @Override
    void calcularPrecio() {
        int precioFuerte = 45000;
        System.out.println("El precio del plato fuerte es de "+precioFuerte+" $");
    }
}
