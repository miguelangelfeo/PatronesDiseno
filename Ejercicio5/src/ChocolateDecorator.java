public class ChocolateDecorator extends HabitacionDecorator{
    public ChocolateDecorator(Habitacion habitacion){
        super(habitacion);
    }

    @Override
    public void decorar() {
        super.decorar();
        System.out.println("Añadiendo Chocolates gourmet 🍫   a la habitacion");
    }
}
