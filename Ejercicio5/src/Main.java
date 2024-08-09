public class Main {
    public static void main(String[] args) {
        Habitacion habitacion = new HabitacionBasica();

        habitacion = new FlowerDecorator(habitacion);
        habitacion = new ChocolateDecorator(habitacion);

        habitacion.decorar();
    }
}