package gestionBiblioteca;
public class Libro extends  MaterialBibliografico{
    private String idEjemplar;
    private String isbn;
    //private String titulo;
    private String autor;
    private boolean disponible;

    public Libro() {
        super();
        idEjemplar = "NA";
        isbn = "NA";
        //titulo = "Desconocido";
        autor = "Desconocido";
        disponible = true;
    }
    public Libro(String idEjemplar, String isbn, String titulo, String autor,int anio){
        super(titulo, anio);
        this.idEjemplar = idEjemplar;
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
        this.idEjemplar = idEjemplar;
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public String getIdEjemplar() {
        return idEjemplar;
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
        String estado;
        if (disponible) {
            estado = "DISPONIBLE";
        } else {
            estado = "PRESTADO";
        }
        return idEjemplar + " - " + isbn + " - " + titulo + " (" + autor + ") - " +
                estado;
    }
    @Override 
    public int calcularTiempoPrestamo(){
        return 30;
    }
    
}
