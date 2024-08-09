public class Arquero extends Heroe {

    public Arquero(String nombre, Equipamiento equipamiento, int experiencia, int nivel, int puntos_habilidad, Habilidades habilidades){
        super(nombre, equipamiento, experiencia, nivel, puntos_habilidad, habilidades);
    }


    @Override
    public Heroe clone() {
        return new Arquero(this.nombre, this.equipamiento, this.experiencia, this.nivel, this.puntos_habilidad, this.habilidades);
    }
}