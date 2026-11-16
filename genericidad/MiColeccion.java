package genericidad;

import java.util.ArrayList;

/**
 * CLASE GENÉRICA: MiColeccion
 * 
 * Esta clase implementa una colección genérica dinámica usando ArrayList.
 * Utiliza un tipo genérico T que permite trabajar con cualquier tipo de datos
 * sin sacrificar la seguridad de tipos en tiempo de compilación.
 * 
 * OBSERVACIONES ACADÉMICAS:
 * 1. El parámetro <T> permite que la clase sea reutilizable para cualquier tipo
 * 2. ArrayList maneja automáticamente el redimensionamiento dinámico
 * 3. Simplifica el código al delegar operaciones complejas a ArrayList
 * 4. Mantiene una interfaz consistente con la versión anterior
 * 
 * VENTAJAS de usar ArrayList:
 * - No requiere casteos de tipos genéricos
 * - Gestión automática de capacidad y tamaño
 * - Métodos robustos y optimizados (add, remove, get, etc.)
 * - Código más limpio y menos propenso a errores
 */
public class MiColeccion<T> {
    
    // ATRIBUTO:
    // - datos: ArrayList que almacena los elementos de forma segura y dinámica
    //   ArrayList se encarga automáticamente del redimensionamiento
    private ArrayList<T> datos;
    
    
    /**
     * CONSTRUCTOR
     * Inicializa la colección como un ArrayList vacío.
    */
    
    public MiColeccion() {
        datos = new ArrayList<T>();
    }
    
    
    /**
     * AGREGAR un elemento al final de la colección
     * Delega en el método de ArrayList que maneja automáticamente
     * el redimensionamiento si es necesario
     * 
     * @param elm elemento a agregar
     */
    public void agregar(T elm) {
        insertar(elm, datos.size());
    }
    
    /**
     * INSERTAR un elemento en una posición específica
     * 
     * OBSERVACIONES IMPORTANTES:
     * 1. ArrayList.add(index, element) inserta automáticamente en la posición
     *    y desplaza todos los elementos posteriores hacia la derecha
     * 
     * 2. ArrayList maneja automáticamente el redimensionamiento cuando
     *    es necesario expandir la capacidad interna
     * 
     * 3. VALIDACIÓN: Verifica que el índice esté dentro del rango válido [0, size]
     *    Si el índice es inválido, ignora la operación sin insertar nada
     * 
     * @param elm elemento a insertar
     * @param i   posición donde se insertará (0 <= i <= tamaño)
     */
    public void insertar(T elm, int i) {
        // Validación: solo inserta si el índice está en rango válido [0, size]
        if (i < 0 || i > datos.size()) {
            return; // Ignora la operación si el índice es inválido
        }
        
        // ArrayList.add() maneja automáticamente el redimensionamiento y corrimiento
        datos.add(i, elm);
    }
    
    
    /**
     * BUSCAR un elemento en la colección
     * Implementa búsqueda secuencial (lineal) usando el método indexOf() de ArrayList
     * 
     * ANÁLISIS:
     * - Complejidad: O(n) - peor caso cuando el elemento no existe
     * - ArrayList.indexOf() utiliza el método equals() para comparar
     * - Es más seguro que una búsqueda manual porque maneja null values
     * 
     * @param elm elemento a buscar
     * @return índice del elemento si se encuentra, -1 si no existe
     * 
     * NOTA ACADÉMICA: Esta es una búsqueda lineal. Para listas muy grandes,
     * sería más eficiente si estuviera ordenada (permitiría búsqueda binaria: O(log n))
     */
    public int buscar(T elm) {
        return datos.indexOf(elm);
    }
    
    
    /**
     * ELIMINAR un elemento en una posición específica
     * 
     * OBSERVACIONES:
     * 1. ArrayList.remove(index) elimina el elemento en la posición especificada
     *    y desplaza automáticamente todos los elementos posteriores hacia la izquierda
     * 
     * 2. VALIDACIÓN: Verifica que el índice esté dentro del rango [0, size)
     *    Si el índice es inválido, retorna null sin eliminar nada
     * 
     * 3. Comparado con la implementación anterior manual:
     *    - Código más limpio y legible
     *    - Menos propenso a errores de off-by-one
     *    - Mejor rendimiento con optimizaciones internas de ArrayList
     * 
     * @param i posición del elemento a eliminar (0 <= i < size)
     * @return el elemento eliminado, o null si el índice es inválido
     */
    public T eliminar(int i) {
        // Validación: solo elimina si el índice está en rango válido [0, size)
        if (i < 0 || i >= datos.size()) {
            return null; // Retorna null si el índice es inválido
        }
        
        // ArrayList.remove() desplaza automáticamente los elementos hacia la izquierda
        return datos.remove(i);
    }
    
    
    /**
     * OBTENER un elemento en una posición específica
     * Proporciona acceso directo (O(1)) a un elemento por su índice
     * 
     * MEJORA: Agrega validación de rango sin excepciones
     * Si el índice es inválido, retorna null en lugar de lanzar una excepción
     * 
     * @param i índice del elemento (0 <= i < size)
     * @return elemento en la posición i, o null si el índice es inválido
     */
    public T obtener(int i) {
        // Validación: retorna null si el índice está fuera de rango
        if (i < 0 || i >= datos.size()) {
            return null; // Retorna null si el índice es inválido
        }
        return datos.get(i);
    }
    
    /**
     * OBTENER el tamaño actual de la colección
     * 
     * @return número de elementos actualmente en la colección
     */
    public int tamaño() {
        return datos.size();
    }
}
