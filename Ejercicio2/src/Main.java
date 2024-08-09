public class Main {
    public static void main(String[] args) {
        Mensajeria servicioMensajeria = new Mensajeria();

        Dispositivos dispositivo1 = new Dispositivos("Dispositivo 1");
        Dispositivos dispositivo2 = new Dispositivos("Dispositivo 2");
        Dispositivos dispositivo3 = new Dispositivos("Dispositivo 3");

        servicioMensajeria.añadir_dispositivo(dispositivo1);
        servicioMensajeria.añadir_dispositivo(dispositivo2);
        servicioMensajeria.añadir_dispositivo(dispositivo3);

        servicioMensajeria.mensaje();
    }
}