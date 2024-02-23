package POO_APRENDIENDO.herencia;

public class Consultor extends Persona{
    String nombreConsultor;
    int numConsultor;

    public Consultor() {
    }

    public Consultor(int id, String dni, String nombre, String apellido, String domicilio, String telefono, String nombreConsultor, int numConsultor) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombreConsultor = nombreConsultor;
        this.numConsultor = numConsultor;
    }

    public String getNombreConsultor() {
        return nombreConsultor;
    }

    public void setNombreConsultor(String nombreConsultor) {
        this.nombreConsultor = nombreConsultor;
    }

    public int getNumConsultor() {
        return numConsultor;
    }

    public void setNumConsultor(int numConsultor) {
        this.numConsultor = numConsultor;
    }
}
