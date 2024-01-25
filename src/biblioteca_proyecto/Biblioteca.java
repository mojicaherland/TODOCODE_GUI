package biblioteca_proyecto;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public List<Libro> librosDisponibles = new ArrayList<>();
    public List<Libro> librosPrestados = new ArrayList<>();

    //constructores
    public Biblioteca() {
    }

    public Biblioteca(List<Libro> librosDisponibles, List<Libro> librosPrestados) {
        this.librosDisponibles = librosDisponibles;
        this.librosPrestados = librosPrestados;
    }

    // getters y setters
    public List<Libro> getLibrosDisponibles() {
        return librosDisponibles;
    }

    public void setLibrosDisponibles(List<Libro> librosDisponibles) {
        this.librosDisponibles = librosDisponibles;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(List<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    //Metodo para prestar un libro. asegurando de actualizar la lista de los libros disponibles
    // y prestados segun sea necesario
    public void prestarLibro(Libro libro) {
        if (librosDisponibles.contains(libro) && libro.estado == Libro.EstadoLibro.disponible) {
            librosDisponibles.remove(libro);
            librosPrestados.add(libro);
            System.out.println("Libro prestado: " + libro.titulo);
        } else if (libro.getEstado() == Libro.EstadoLibro.ocupado) {
            System.out.println("libro ocupado");
        }
    }
}
