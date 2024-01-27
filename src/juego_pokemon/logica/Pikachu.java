package juego_pokemon.logica;

public class Pikachu extends Pokemon implements IElectrico{
    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("hola");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("hola");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("hola");
    }

    @Override
    public void atacarImpacTrueno() {
        System.out.println("hola");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("hola");
    }
}
