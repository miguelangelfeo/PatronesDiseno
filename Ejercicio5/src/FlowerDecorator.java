public class FlowerDecorator extends HabitacionDecorator {

    public FlowerDecorator(Habitacion habitacion){
        super(habitacion);
    }

    @Override
    public void decorar() {
        super.decorar();
        System.out.println("Añadiendo Flores 💐 a la habitacion");
    }

}
