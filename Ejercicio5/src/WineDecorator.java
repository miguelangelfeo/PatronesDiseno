public class WineDecorator extends HabitacionDecorator {

    public WineDecorator(Habitacion habitacion){
        super(habitacion);
    }

    @Override
    public void decorar() {
        super.decorar();
        System.out.println("Añadiendo vino 🍷 a la habitacion");
    }
}
