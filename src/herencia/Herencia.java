package herencia;


public class Herencia {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.getNumeroLegajo();
        empleado.getNombre();

        Consultor consultor = new Consultor();
        consultor.getNombre();
    }
}
