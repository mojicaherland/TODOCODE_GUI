package juego_ninjas.logica;

public abstract class Ninja {
    protected String nombre;
    protected String habilidad;
    protected String poder;
    protected int cantidadPoder;

    protected abstract void correr();
    protected abstract void saltar();
}
