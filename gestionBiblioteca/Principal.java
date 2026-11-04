package gestionBiblioteca;
import java.util.ArrayList;
public class Principal{
    public static void main(String[] args) {
        Biblioteca bib1 = new Biblioteca();
        Libro lib1 = new Libro("1","ISBN-1","Cien años de soledad","Gabriel Garcia Marquez");
        Libro lib2 = new Libro("2","ISBN-2","El amor en el tiempos del colera","Gabriel Garcia Marquez");
        Libro lib3 = new Libro("3","ISBN-3","El Laberinto de la Soledad","Octavio Paz");
        bib1.registrarLibro(lib1);
        bib1.registrarLibro(lib2);
        bib1.registrarLibro(lib3);
        bib1.registrarLibro("4","ISBN-4","El llano en llamas","Juan Rulfo");
        bib1.registrarLibro("4","ISBN-4","El llano en llamas","Juan Rulfo");
        Libro libro= (Libro) bib1.buscarLibroPorIdEjemplar("2");
        if(libro !=null){
            System.out.println("Libro encontrado:"+libro.devolverDatos());
        }else{
            System.out.println("Libro No encontrado");
        }
        libro= (Libro) bib1.buscarLibroPorIdEjemplar("5");
        if(libro !=null){
            System.out.println("Libro encontrado:"+libro.devolverDatos());
        }else{
            System.out.println("Libro 5 No encontrado");
        }

        System.out.println("Muestra la lista de libros:");
        //Libro listaLibros[] = bib1.consultarTodosLosLibros();
        ArrayList<Libro> listaLibros = bib1.consultarTodosLosLibros();
        /* 
        for(int i=0;i<listaLibros.length;i++){
            System.out.println(listaLibros[i].devolverDatos());
        }
        */
       for(int i=0;i<listaLibros.size();i++){
            System.out.println(listaLibros.get(i).devolverDatos());
        }




        
    }
}