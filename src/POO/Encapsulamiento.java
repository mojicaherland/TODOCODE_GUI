package POO;

public class Encapsulamiento {
    public static void main(String[] args) {
        Alumno alu = new Alumno();
        Alumno alu2= new Alumno(15,"suscribite","todo code");

        System.out.println(alu2.getId());
        System.out.println(alu2.getNombre());
        System.out.println(alu2.getApellido());
    }
}
