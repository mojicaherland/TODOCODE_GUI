package POO;

public class Poo {
    public static void main(String[] args) {
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5, "Luis", "Perez");

        System.out.println("la id del alu2 es : " + alu2.getId());
        System.out.println("el nombre es : " + alu2.getNombre());
        System.out.println("el apellido es : " + alu2.getApellido());
        System.out.println("-----------------------------------------");

        //Rellenando datos al alumno primera vez y mostrando sus datos
        alu1.setId(8);
        alu1.setNombre("Suscribite");
        alu1.setApellido("Todo code");
        System.out.println("la id del alu1 es: " + alu1.getId());
        System.out.println("el nombre es : " + alu1.getNombre());
        System.out.println("el apellido es: " + alu1.getApellido());

        System.out.println("-------------------------------------------");
        //Usando otra vez el set modificando
        alu2.setId(35);
        System.out.println("la id del alu2 es : " + alu2.getId());
        System.out.println("el nombre es : " + alu2.getNombre());
        System.out.println("el apellido es : " + alu2.getApellido());

    }
}
