package juego_pokemon.logica;

public class Bulbasur extends Pokemon implements IPlanta{
    public Bulbasur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("hola soy bulbasur y este es mi ataje placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("hola soy bulbasur y este es mi ataje arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("hola soy bulbasur y este es mi ataje mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("holaaaa");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("holaaaaaa");
    }
}
