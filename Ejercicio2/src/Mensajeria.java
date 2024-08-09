import java.util.ArrayList;

public class Mensajeria {
    private ArrayList<Usuario> dispositivos = new ArrayList<>();
    public void mensaje() {
        System.out.println("Mensaje enviado");
        notificar_dispositivo();
    }

    public void eliminar_dispositivo(Usuario dispositivo){
        dispositivos.remove(dispositivo);
    }

    public void añadir_dispositivo(Usuario dispositivo){
        dispositivos.add(dispositivo);
    }

    public void notificar_dispositivo(){
        for (Usuario dispositivo : dispositivos) {
            dispositivo.actualizar_estado();
        }
    }
}
