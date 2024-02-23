package POO_APRENDIENDO;

public class MainPoo {
    public static void main(String[] args) {
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5, "luis", "sarate");

        System.out.println("la id del alu2 es: " + alu2.getId());
        System.out.println("el nombre del alu2 es : " + alu2.getNombre());
        System.out.println("apellido alu2 es : " + alu2.getApellido());

        System.out.println("----------------------------");

        //asignando valores con el set a un alumno y usando get para mostrarlos
        alu1.setId(8);
        alu1.setNombre("Herland");
        alu1.setApellido("Mojica");
        System.out.println(alu1.getId() + " " + alu1.getNombre() + " " + alu1.getApellido());

        System.out.println("-----------------------------");

        //cambiando el id nuevamente
        alu2.setId(35);
        System.out.println("la id del alu2 es: " + alu2.getId());
        System.out.println("el nombre del alu2 es : " + alu2.getNombre());
        System.out.println("apellido alu2 es : " + alu2.getApellido());
    }

}
