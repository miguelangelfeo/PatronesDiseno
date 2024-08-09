public class PedidoPostre extends Pedido{
    @Override
    void prepararPedido() {
        System.out.println("Preparando postre 🍨🍨");

    }

    @Override
    void calcularPrecio() {
        int precioFuerte = 12000;
        System.out.println("El precio del plato fuerte es de "+precioFuerte+" $");
    }
}
