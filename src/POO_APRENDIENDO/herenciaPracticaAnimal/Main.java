package POO_APRENDIENDO.herenciaPracticaAnimal;

public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();

        //asignando datos a un animal y mostrandolos
        perro1.setNombreAnimal("Otto");
        perro1.setTipoAnimal("Perro");
        perro1.setEdad(11);
        perro1.setPeso(10.5f);

        perro2.setNombreAnimal("Ignacio");
        perro2.setTipoAnimal("Perro");
        perro2.setEdad(2);
        perro2.setPeso(26.4f);

        System.out.println("---------------");
        System.out.println(perro1.getNombreAnimal() + " " + perro1.getTipoAnimal() + " " + perro1.getEdad() + " " + perro1.getPeso());
        System.out.println("------------------");
        System.out.println(perro2.getNombreAnimal() + " " + perro2.getTipoAnimal() + " " + perro2.getEdad() + " " + perro2.getPeso());
    }
}
