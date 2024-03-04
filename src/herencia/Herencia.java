package herencia;


public class Herencia {

    public static void main(String[] args) {
//        Empleado empleado = new Empleado();
//        empleado.getNumeroLegajo();
//        empleado.getNombre();
//
//        Consultor consultor = new Consultor();
//        consultor.getNombre();
        Empleado empleado = new Empleado();
        empleado.getDomicilio();

        //Para entender polimorfismo
        //creando un vector de personas donde puedo almacenar varias formas
        //de tipos de personas como empleado,consultor,jefe
        Persona vector[] = new Persona[5];
        vector[0] = new Persona();
        vector[1]= new Empleado();
        vector[2] = new Consultor();
        vector[3] = new Jefe();

        Persona perso = new Persona();
        Consultor consultor = new Consultor();

        perso = consultor;

    }

}

