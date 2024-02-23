package POO_APRENDIENDO.herenciaPracticaAnimal;

public class Perro extends Animal {
    float peso;

    public Perro() {
    }

    public Perro(int edad, String nombreAnimal, String tipoAnimal, int peso) {
        super(edad, nombreAnimal, tipoAnimal);
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    //Metodos
    public static void ladrar() {
        System.out.println("*Ladrando");
    }
}
