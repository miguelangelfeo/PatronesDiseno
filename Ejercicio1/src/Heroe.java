public abstract class Heroe {
    String nombre;
    Equipamiento equipamiento;

    int experiencia;
    int nivel;
    int puntos_habilidad;

    Habilidades habilidades;


    public Heroe(String nombre, Equipamiento equipamiento, int experiencia, int nivel, int puntos_habilidad, Habilidades habilidades) {
        this.nombre = nombre;
        this.equipamiento = equipamiento.clone();
        this.experiencia = experiencia;
        this.nivel = nivel;
        this.puntos_habilidad = puntos_habilidad;
        this.habilidades = habilidades;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract Heroe clone();
}
