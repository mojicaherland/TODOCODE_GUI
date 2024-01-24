package POO;

public class Alumno {
    int id;
    String nombre;
    String apellido;

    //Constructores
    public Alumno(){}// constructor vacio sirve para cuando no haya datos
    public Alumno(int id, String nombre, String apellido) { // ya con datos
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Metodos
    public void mostrarNombre(){
        System.out.println("Hola soy un alumno y se decir mi nombre");
    }
    public void saberAprobado(float clasificacion){
        if (clasificacion>=6){
            System.out.println("Aprobado");
        }else{
            System.out.println("No Aprobado");
        }
    }
}
