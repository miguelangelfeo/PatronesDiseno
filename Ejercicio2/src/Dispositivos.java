public class Dispositivos implements Usuario{
    public Dispositivos(String s) {
    }

    @Override
    public void actualizar_estado() {
        System.out.println("Notificación de mensaje nuevo");
    }
}
