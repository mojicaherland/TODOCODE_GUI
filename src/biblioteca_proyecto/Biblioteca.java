package biblioteca_proyecto;

import java.util.List;

public class Biblioteca {
    public List<Libro> librosDisponibles;
    public List<Libro> librosPrestados;

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

}
