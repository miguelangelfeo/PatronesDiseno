public class Guerrero extends Heroe {

    public Guerrero(String name, String equipment, int experience, int level, int skillPoints){
        super(name, equipment, experience, level, skillPoints);
    }


    @Override
    public Heroe clone() {
        return new Guerrero(this.name, this.equipment, this.experience, this.level, this.skillPoints);
    }
}
