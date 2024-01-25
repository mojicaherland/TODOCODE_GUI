package biblioteca_proyecto;

public class Libro {
    public String titulo;
    public String autor;
    public String anioPublicacion;
    public enum EstadoLibro{
        disponible,
        prestado,
        enReparacion,
        ocupado,
        devuelto
    }
    public EstadoLibro estado;

    //Constructores
    public Libro() {
    }

    public Libro(String titulo, String autor, String anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    //getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public EstadoLibro getEstado() {
        return estado;
    }

    public void setEstado(EstadoLibro estado) {
        this.estado = estado;
    }

    //Metodo para saber si el libro esta prestado o devuelto
    public void saberLibroPrestadoDevuelto(Libro libroCLiente){
        if ((libroCLiente.estado == EstadoLibro.prestado) || (libroCLiente.estado == EstadoLibro.devuelto)){
            System.out.println(getEstado());
        }
    }

}
