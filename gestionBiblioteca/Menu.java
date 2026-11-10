package gestionBiblioteca;
import java.util.ArrayList;

import java.util.Scanner;
public class Menu {
    private final Biblioteca biblioteca;
    private final Scanner scanner;
    public Menu() {
        this.biblioteca = new Biblioteca();
        this.scanner = new Scanner(System.in);
    }
    public void iniciar(){
         boolean salir = false;
         while (!salir){
            mostrarOpciones();
            int opcion = leerEntero("Seleccione una opción: ");
            switch (opcion) {
                case 1:
                    registrarLibro();
                    break;
                case 2:
                    registrarRevista();
                    break;
                case 3:
                    consultarTodasLosMaterialesBibliograficos();
                    break;
                case 4:
                    buscarMaterialBibliograficoPorId();
                    break;
                case 5:
                    eliminarMaterialBibliografico();
                    break;
                case 0:
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
         }
    }
    public void mostrarOpciones(){
        System.out.println("\n===== MENÚ BIBLIOTECA =====");
        System.out.println("1. Registrar libro");
        System.out.println("2. Registrar revista");
        System.out.println("3. Consultar Material Bibliografico");
        System.out.println("4. Buscar Material Bibliográfico por ID de ejemplar");
        System.out.println("5. Eliminar Material Bibliográfico");
        System.out.println("0. Salir");
    }

    private String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine().trim();
    }

    private int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println("Debe ingresar un número entero.");
            scanner.next();
            System.out.print(mensaje);
        }
        int valor = scanner.nextInt();
        scanner.nextLine(); //limpia el scanner del ultimo enter
        return valor;
    }

    public void registrarLibro(){
        String idEjemplar = leerTexto("Id del ejemplar: ");
        String isbn = leerTexto("ISBN: ");
        String titulo = leerTexto("Título: ");
        int anio = leerEntero("Año de publicación: ");
        String autor = leerTexto("Autor: ");
        if (datosIncompletos(idEjemplar, isbn, titulo, autor) || anio < 1) {
            System.out.println("Todos los datos son obligatorios.");
            return;
        }
        Libro libro = new Libro(idEjemplar, isbn,  titulo,  autor, anio);
        if (biblioteca.registrarMaterialBibliografico(libro)){
            System.out.println("El Libro se registro con Exito!");
        }else{
            System.out.println("No fue posible registrar el Libro!! ");
        }

    }
    public void registrarRevista(){
        String idEjemplar = leerTexto("Id del ejemplar: ");
        String issn = leerTexto("ISSN: ");
        String titulo = leerTexto("Título: ");
        int anio = leerEntero("Año de publicación: ");
        String periodicidad = leerTexto("Periodicidad: ");
        if (datosIncompletos(idEjemplar, issn, titulo, periodicidad) || anio < 1) {
            System.out.println("Todos los datos son obligatorios.");
            return;
        }
        Revista revista = new Revista(idEjemplar,  titulo, anio, periodicidad, issn);
         if (biblioteca.registrarMaterialBibliografico(revista)){
            System.out.println("La Revista se registró con Exito!");
        }else{
            System.out.println("No fue posible registrar La Revistro!! ");
        }

    }
    public void consultarTodasLosMaterialesBibliograficos(){
        ArrayList<MaterialBibliografico> lista = biblioteca.consultarTodasLosMateriales();
        for(MaterialBibliografico mat: lista){
            System.out.println(mat.devolverDatos());
        }


    }
    public void buscarMaterialBibliograficoPorId(){
        String idEjemplar = leerTexto("Id del ejemplar: ");
        MaterialBibliografico mat = biblioteca.buscarMaterialPorIdEjemplar(idEjemplar);
        if(mat==null){
            System.out.println("No existe un Material Bibliografico con ese ID!!");
        }else{
            System.out.println(mat.devolverDatos());
        }


    }
    public void eliminarMaterialBibliografico(){
        String idEjemplar = leerTexto("Id del ejemplar que deseas ELIMINAR: ");
        MaterialBibliografico mat = biblioteca.buscarMaterialPorIdEjemplar(idEjemplar);
        if(mat==null){
            System.out.println("No existe un Material Bibliografico con ese ID!!");
        }else{
            System.out.println(mat.devolverDatos());
            if (biblioteca.eliminarMaterialBibliografico(idEjemplar)) {
                System.out.println("Material Bibliografico eliminado con exito.");
            } else {
                System.out.println("No fue posible eliminar el Material Bibliografico.");
            }
        }


    }
    private boolean datosIncompletos(String... datos) {
        for (String dato : datos) {
            if (dato.isBlank()) {
                return true;
            }
        }
        return false;
    }


    
}
