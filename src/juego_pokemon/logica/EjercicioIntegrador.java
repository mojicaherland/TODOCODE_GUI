package juego_pokemon.logica;

public class EjercicioIntegrador {
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasur bulbasur = new Bulbasur();
        Pikachu pikachu = new Pikachu();

        squirtle.atacarAraniazo();;
        squirtle.acatarHidrobomba();
        charmander.atacarAraniazo();
        charmander.atacarLanzallamas();
        bulbasur.atacarAraniazo();
        bulbasur.atacarDrenaje();
        pikachu.atacarAraniazo();
        pikachu.atacarImpacTrueno();

    }
}
