package POO_APRENDIENDO.herenciaPracticaAnimal;

public class Animal {
    int edad;
    String nombreAnimal;
    String tipoAnimal;

    public Animal() {
    }

    public Animal(int edad, String nombreAnimal, String tipoAnimal) {
        this.edad = edad;
        this.nombreAnimal = nombreAnimal;
        this.tipoAnimal = tipoAnimal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
}
