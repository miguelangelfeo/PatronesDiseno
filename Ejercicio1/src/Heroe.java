public abstract class Heroe {
    String nombre;
    String equipamiento;
    int experiencia;
    int nivel;
    int puntos_habilidad;

    public Heroe(String nombre, String equipamiento, int experiencia, int nivel, int puntos_habilidad) {
        this.nombre = nombre;
        this.equipamiento = equipamiento;
        this.experiencia = experiencia;
        this.nivel = nivel;
        this.puntos_habilidad = puntos_habilidad;
    }

    public abstract Heroe clone();
}
