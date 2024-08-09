public class Habilidades {
    String ataque;
    String defensa;
    String habilidad_magica;
    String defensa_magica;

    public Habilidades(String ataque, String defensa, String habilidad_magica, String defensa_magica) {
        this.ataque = ataque;
        this.defensa = defensa;
        this.habilidad_magica = habilidad_magica;
        this.defensa_magica = defensa_magica;
    }

    public String getAtaque() {
        return ataque;
    }

    public String getDefensa() {
        return defensa;
    }

    public String getHabilidad_magica() {
        return habilidad_magica;
    }

    public String getDefensa_magica() {
        return defensa_magica;
    }

    public Habilidades clone(){
        return new Habilidades(this.ataque, this.defensa, this.habilidad_magica, this.defensa_magica);
    }
}
