public class Equipamiento {
    String armadura;
    String color_piel;
    String arma;
    String tamaño;

    public Equipamiento(String armadura, String color_piel, String arma, String tamaño) {
        this.armadura = armadura;
        this.color_piel = color_piel;
        this.arma = arma;
        this.tamaño = tamaño;
    }

    public String getArmadura() {
        return armadura;
    }

    public String getColor_piel() {
        return color_piel;
    }

    public String getArma() {
        return arma;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public void setColor_piel(String color_piel) {
        this.color_piel = color_piel;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Equipamiento clone() {
        return new Equipamiento(this.armadura, this.color_piel, this.arma, this.tamaño);
    }
}
