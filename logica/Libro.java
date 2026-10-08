package logica;

import java.time.LocalDate;

public class Libro extends Publicacion{
    //atributos
    private String isbn;
    private String autor;
    private String titulo;
    //constructores
    public Libro() {
        super();
    }
    public Libro(String editorial, LocalDate fechaPub, String isbn, String autor, String titulo) {
        super(editorial, fechaPub);
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
    }
    //UTILIZAR OTRO CONSTRUCTOR
    //getter
    public String getIsbn() {
        return isbn;
    }
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
    //setter
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    @Override
    public String toString() {
        return "Libro [isbn=" + isbn + ", autor=" + autor + ", titulo=" + titulo + "]";
    }
    
    
}