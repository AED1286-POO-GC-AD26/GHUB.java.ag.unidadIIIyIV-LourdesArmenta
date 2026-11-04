package gestionBiblioteca;
public class Libro extends  MaterialBibliografico{
    private String isbn;
    private String autor;
    private Estado estado;

    public Libro() {
        super();
        isbn = "NA";
        autor = "Desconocido";
        estado = Estado.DISPONIBLE;
    }
    public Libro(String idEjemplar, String isbn, String titulo, String autor,int anio){
        super(idEjemplar,titulo, anio);
        this.isbn = isbn;
        this.autor = autor;
        this.estado = Estado.DISPONIBLE;

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
        this.estado = Estado.DISPONIBLE;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }
    public Estado getEstado(){
        return estado;
    }
    public void setEstado(Estado estado){
        this.estado = estado;
    }

    public boolean estarDisponible() {
         return estado == Estado.DISPONIBLE;
    }

    @Override 
    public String devolverDatos() {
        return getIdEjemplar() + " - ISBN: " + isbn + " - " + getTitulo() + " ("
                + getAnio() + ", " + autor + ") - " + estado;
    }

    @Override 
    public int calcularTiempoPrestamo(){
        return 30;
    }
    
}
