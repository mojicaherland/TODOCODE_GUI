package herencia;

public class Empleado extends Persona {
    int numeroLegajo;
    String cargo;
    Double sueldo;

    //constructor
    public Empleado() {
    }

    public Empleado(int id, String dni, String nombre, String apellido, String domicilio, String telefono, int numeroLegajo, String cargo, Double sueldo) {
        super(id, dni, nombre, apellido, domicilio, telefono); //atributos de la clase madre
        this.numeroLegajo = numeroLegajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
    //getters y setters

    public int getNumeroLegajo() {
        return numeroLegajo;
    }

    public void setNumeroLegajo(int numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
