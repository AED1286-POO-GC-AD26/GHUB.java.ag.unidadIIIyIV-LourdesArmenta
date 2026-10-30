package gestionBiblioteca;
public class Biblioteca{
    private MaterialBibliografico listaLibros[];
    
    private static final int M = 20;
    private int cardinalLibros;
    private int capacidadLibros;
    public Biblioteca(){
        listaLibros = new Libro[M];
        this.capacidadLibros = M;
        this.cardinalLibros = 0;

    }
    // Metodo publico delegado: crea el objeto Libro y delega el registro en la
    // sobrecarga que recibe el objeto completo.
    public void registrarLibro(String idEjemplar, String isbn, String titulo, String autor) {
        registrarLibro(new Libro(idEjemplar, isbn, titulo, autor));
    }

    // Punto comun de registro para las distintas formas publicas de recibir un libro.
    public void registrarLibro(Libro libro) {
        registrarLibroInterno(libro);
    }

    // Metodo privado delegado que concentra la validacion y el almacenamiento.
    // Centralizar esta logica evita duplicarla y mantiene una sola regla de registro.
    private void registrarLibroInterno(Libro libro) {
        if (cardinalLibros == capacidadLibros) {
            MaterialBibliografico nuevaLista[] = new Libro[capacidadLibros + M];
            for (int i = 0; i < capacidadLibros; i++) {
                nuevaLista[i] = listaLibros[i];
            }
            capacidadLibros += M;
            listaLibros = nuevaLista;
        }
        if (!existeLibro(libro.getIdEjemplar())) {
            listaLibros[cardinalLibros++] = libro;
        } else {
            System.out.println("Ya existe un ejemplar con el id: " + libro.getIdEjemplar());
        }
    }
    public boolean existeLibro(String idEjemplar) {
        return buscarLibroPorIdEjemplar(idEjemplar) != null;
    }
    public MaterialBibliografico buscarLibroPorIdEjemplar(String idEjemplar) {
        for (int i = 0; i < cardinalLibros; i++) {
            Libro libro = (Libro) listaLibros[i];

            if (libro.getIdEjemplar().equals(idEjemplar)) {
                return listaLibros[i];
            }
        }
        return null;
    }

    public Libro consultarTodosLosLibros() {
        Libro copia = new Libro[cardinalLibros];
        for (int i = 0; i < cardinalLibros; i++) {
            copia[i] = (Libro) listaLibros[i];
        }
        return copia;
    }
    public void eliminarLibro(String idEjemplar){

    }
    public void eliminarLibro(Libro libro){

    }
    private void eliminarLibroInterno(Libro libro){

    }
    
}