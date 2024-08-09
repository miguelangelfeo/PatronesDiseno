public class HabitacionDecorator implements Habitacion {
    Habitacion habitacion;

    public HabitacionDecorator(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public void decorar() {
        habitacion.decorar();
    }
}
