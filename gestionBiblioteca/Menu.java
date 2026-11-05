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
        

    }
    public void consultarTodasLosMaterialesBibliograficos(){

    }
    public void buscarMaterialBibliograficoPorId(){

    }
    public void eliminarMaterialBibliografico(){

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
