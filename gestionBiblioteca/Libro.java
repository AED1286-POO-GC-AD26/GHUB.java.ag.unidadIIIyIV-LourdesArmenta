package gestionBiblioteca;
public class Libro extends  MaterialBibliografico{
    private String isbn;
    private String autor;
    private boolean disponible;

    public Libro() {
        super();
        isbn = "NA";
        autor = "Desconocido";
        disponible = true;
    }
    public Libro(String idEjemplar, String isbn, String titulo, String autor,int anio){
        super(idEjemplar,titulo, anio);
        this.isbn = isbn;
        this.autor = autor;
        this.disponible = true;

    }

    public Libro(String idEjemplar, String isbn, String titulo, String autor) {
        if (idEjemplar == null || idEjemplar.isBlank()) {
            System.out.println("El id del ejemplar no puede ser nulo o estar en blanco");
            return;
        }
        if (isbn == null || isbn.isBlank()) {
            System.out.println("El isbn no puede ser nulo o estar en blanco");
            return;
        }
        if (titulo == null || titulo.isBlank()) {
            System.out.println("El título no puede ser nulo o estar en blanco");
            return;
        }
        if (autor == null || autor.isBlank()) {
            System.out.println("El autor no puede ser nulo o estar en blanco");
            return;
        }
        
        this.isbn = isbn;
        this.autor = autor;
        this.disponible = true;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public boolean estarDisponible() {
        return disponible;
    }
    public String devolverDatos() {
        Estado estado;
        if (disponible) {
            estado = Estado.DISPONIBLE;
        } else {
            estado = Estado.PRESTADO;
        }
        return super.getIdEjemplar() + " - " + isbn + " - " + titulo + " (" + autor + ") - " +
                estado;
    }

    @Override 
    public int calcularTiempoPrestamo(){
        return 30;
    }
    
}
