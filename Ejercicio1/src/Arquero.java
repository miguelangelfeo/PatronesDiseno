public class Arquero extends Heroe {

    public Arquero(String nombre, String equipamiento, int experiencia, int nivel, int puntos_habilidad){
        super(nombre, equipamiento, experiencia, nivel, puntos_habilidad);
    }


    @Override
    public Heroe clone() {
        return new Arquero(this.nombre, this.equipamiento, this.experiencia, this.nivel, this.puntos_habilidad);
    }
}