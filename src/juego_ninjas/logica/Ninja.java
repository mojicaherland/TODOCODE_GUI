package juego_ninjas.logica;

public abstract class Ninja {
    protected String nombre;
    protected String habilidad;
    protected String poder;
    protected int cantidadPoder;

    public Ninja() {
    }

    public Ninja(String nombre, String habilidad, String poder, int cantidadPoder) {
        this.nombre = nombre;
        this.habilidad = habilidad;
        this.poder = poder;
        this.cantidadPoder = cantidadPoder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public int getCantidadPoder() {
        return cantidadPoder;
    }

    public void setCantidadPoder(int cantidadPoder) {
        this.cantidadPoder = cantidadPoder;
    }

    protected abstract void correr();
    protected abstract void saltar();
}
