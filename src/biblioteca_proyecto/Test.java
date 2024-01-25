package biblioteca_proyecto;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        Libro libro3 = new Libro();

        //metiendo datos a los libros
        libro1.titulo = "Harry Potter";
        libro1.autor = "pedro";
        libro1.anioPublicacion = 2019;

        libro2.titulo = "Macano Potter";
        libro2.autor = "pedro";
        libro2.anioPublicacion = 2019;

        libro3.titulo = "Luis Potter";
        libro3.autor = "pedro";
        libro3.anioPublicacion = 2019;

//        libro1.setEstado(Libro.EstadoLibro.ocupado);
        libro2.setEstado(Libro.EstadoLibro.disponible);
        libro3.setEstado(Libro.EstadoLibro.disponible);
        //creando arraylist para almacenar mis libros
        ArrayList<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(libro1);
        listaLibros.add(libro2);
        listaLibros.add(libro3);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.prestarLibro(libro1);

        mostrarArrayListDeLibrosDisponibles(listaLibros);

    }


    public static void mostrarArrayListDeLibrosDisponibles(ArrayList<Libro> lista) {
        for (Libro libro : lista) {
            if (libro.getEstado() == Libro.EstadoLibro.disponible) {
                libro.saberLibroPrestadoDevuelto(libro);
                System.out.println("Título: " + libro.titulo + ", Autor: " + libro.autor + ", Año: " + libro.anioPublicacion);
            }
        }
    }
}
