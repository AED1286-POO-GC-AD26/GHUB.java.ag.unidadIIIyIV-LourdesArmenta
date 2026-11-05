package gestionBiblioteca;
import java.util.ArrayList;

import logica.Publicacion;


public class Biblioteca{
    //private MaterialBibliografico listaLibros[];
    private final ArrayList<MaterialBibliografico> materialBibliograficos;
    //private static final int M = 20;
    //private int cardinalLibros;
    //private int capacidadLibros;
    public Biblioteca(){
        //listaLibros = new Libro[M];
        //this.capacidadLibros = M;
        //this.cardinalLibros = 0;
        materialBibliograficos = new ArrayList<MaterialBibliografico>();
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

        /* 
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
         */

        materialBibliograficos.add(libro);

    }
    public boolean existeLibro(String idEjemplar) {
        return buscarLibroPorIdEjemplar(idEjemplar) != null;
    }
    public MaterialBibliografico buscarLibroPorIdEjemplar(String idEjemplar) {
        /* 
        for (int i = 0; i < cardinalLibros; i++) {
            Libro libro = (Libro) listaLibros[i];

            if (libro.getIdEjemplar().equals(idEjemplar)) {
                return listaLibros[i];
            }
        }
        return null;
        */
       /* 
       for (int i=0; i<materialBibliograficos.size();i++){
            if(materialBibliograficos.get(i).equals(idEjemplar)){
                return materialBibliograficos.get(i);
            }
       }
       return null;
       */
       //EL CODIGO DE ARRIBO PUEDE SER SUSTITUIDO POR EL SIGUIENTE
       for (MaterialBibliografico mat : materialBibliograficos) {
            if (mat.getIdEjemplar().equals(idEjemplar)) {
                return mat;
            }
        }
        return null;

    }

    public ArrayList<Libro> consultarTodosLosLibros() {
       ArrayList<Libro> libros = new ArrayList<>();
        for (MaterialBibliografico mat : materialBibliograficos) {
            if (mat instanceof Libro libro) {
                libros.add(libro);
            }
        }
        return libros;
    }
    public void eliminarLibro(String idEjemplar){

    }
    public void eliminarLibro(Libro libro){

    }
    private void eliminarLibroInterno(Libro libro){

    }
    public boolean registrarMaterialBibliografico(MaterialBibliografico material) {
        if (!datosValidos(material)) {
            System.out.println("No se puede registrar una publicación con datos incompletos.");
            return false;
        }
        if (existeMaterialBibliografico(material.getIdEjemplar())) {
            System.out.println("Ya existe un ejemplar con el id: " + material.getIdEjemplar());
            return false;
        }
        materialBibliograficos.add(material); //es un arrayLista
        return true;
    }
    ///AQUI ME QUEDE PENDIENTE TERMINAR
    private boolean datosValidos(MaterialBibliografico material) {
        
        return false;
    }
    public boolean existeMaterialBibliografico(String idEjemplar) {
        return buscarPublicacionPorIdEjemplar(idEjemplar) != null;
    }
    
}