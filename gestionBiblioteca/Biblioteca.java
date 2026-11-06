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
    
    /*
    permite agregar a la coleccion un materio bibliogradifico:Libro o Revista
     */
    public boolean registrarMaterialBibliografico(MaterialBibliografico material) {
        if (!datosValidos(material)) {
            System.out.println("No se puede registrar una publicación con datos incompletos.");
            return false;
        }
        if (existeMaterialBibliografico(material.getIdEjemplar())) {
            System.out.println("Ya existe un ejemplar con el id: " + material.getIdEjemplar());
            return false;
        }
        materialBibliograficos.add(material);
        return true;
    }
    public boolean existeLibro(String idEjemplar) {
        return buscarLibroPorIdEjemplar(idEjemplar) != null;
    }
    public MaterialBibliografico buscarLibroPorIdEjemplar(String idEjemplar) {
        
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
    public boolean eliminarMaterialBibliografico(String idEjemplar){
        if (!existeMaterialBibliografico(idEjemplar)){
            return false;
        
            
        }else{
            for(int i=0;i<materialBibliograficos.size();i++){
                if(materialBibliograficos.get(i).getIdEjemplar().equals(idEjemplar)){
                    materialBibliograficos.remove(i);
                    return true;
                }
            }
            return false;
        }
    }

    
    
    public void eliminarLibro(String idEjemplar){

    }
    public void eliminarLibro(Libro libro){

    }
    private void eliminarLibroInterno(Libro libro){

    }
    
    
    private boolean datosValidos(MaterialBibliografico material) {
        if (material == null || estaVacio(material.getIdEjemplar())
                || estaVacio(material.getTitulo())) {
            return false;
        }
        if (material instanceof Libro libro) {
            return !estaVacio(libro.getIsbn()) && !estaVacio(libro.getAutor());
        }
        if (material instanceof Revista revista) {
            return !estaVacio(revista.getIssn()) && !estaVacio(revista.getPeriodicidad());
        }
        return false;
    
    }
    private boolean estaVacio(String texto) {
        return texto == null || texto.isBlank();
    }
    public boolean existeMaterialBibliografico(String idEjemplar) {
        return buscarMaterialPorIdEjemplar(idEjemplar) != null;
    }
    public MaterialBibliografico buscarMaterialPorIdEjemplar(String idEjemplar) {
        for(int i=0;i<materialBibliograficos.size();i++){
            if (materialBibliograficos.get(i).getIdEjemplar().equals(idEjemplar)){
                return materialBibliograficos.get(i);
            }
        }
        return null;
       //EL CODIGO COMENTADO ES LO MISMO QUE EL CODIGO DEBAJO
       /* 

        for (MaterialBibliografico mat : materialBibliograficos) {
            if (mat.getIdEjemplar().equals(idEjemplar)) {
                return mat;
            }
        }
        return null;
        */
    }

     public ArrayList<MaterialBibliografico> consultarTodasLosMateriales() {
        return materialBibliograficos;
    }

    
}