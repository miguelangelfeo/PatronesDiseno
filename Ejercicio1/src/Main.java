public class Main {

    public static void main (String[] args) {

        Habilidades habilidades = new Habilidades("Puñetazo", "Bloqueo", "Rayo de luz", "Escudo magico");
        Equipamiento equipamiento = new Equipamiento("Peto de hierro", "Azul", "Garrote", "delgado");

        Mago mago = new Mago("Jonas", equipamiento, 1200, 69, 10, habilidades);

        System.out.println(mago.nombre);
        System.out.println(mago.equipamiento.armadura);
        System.out.println(mago.experiencia);
        System.out.println(mago.nivel);
        System.out.println(mago.puntos_habilidad);
        System.out.println(mago.habilidades.ataque);

        Heroe clonMago = mago.clone();

        System.out.println(clonMago.nombre);
        System.out.println(clonMago.equipamiento.armadura);
        System.out.println(clonMago.experiencia);
        System.out.println(clonMago.nivel);
        System.out.println(clonMago.puntos_habilidad);
        System.out.println(clonMago.habilidades.ataque);
    }
}
