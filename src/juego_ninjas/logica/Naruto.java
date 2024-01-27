package juego_ninjas.logica;


public class Naruto extends Ninja implements INinjutsu,ITaijutsu{
    public Naruto() {
    }

    @Override
    protected void correr() {
        System.out.println("corro");
    }

    @Override
    protected void saltar() {
        System.out.println("salto");
    }

    @Override
    public void crearNinjutsu() {
        System.out.println("creo el nijutsu");
    }

    @Override
    public void ninjutsuTierra() {
        System.out.println("creo el ninjutsu tierra");
    }

    @Override
    public void ochoPuertas() {
        System.out.println("abro las ocho puertas");
    }

    @Override
    public void pelearCuerpoACuerpo() {
        System.out.println("peleo");
    }
}
