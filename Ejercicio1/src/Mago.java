public class Mago extends Heroe {

    public Mago(String nombre, String equipamiento, int experiencia, int nivel, int puntos_habilidad){
        super(nombre, equipamiento, experiencia, nivel, puntos_habilidad);
    }


    @Override
    public Heroe clone() {
        return new Mago(this.nombre, this.equipamiento, this.experiencia, this.nivel, this.puntos_habilidad);
    }
}