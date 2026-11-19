package genericidad;

public interface Repositorio<T,ID> {
    void agregar(T entidad);
    T obtener(ID id);
    void actualizar(T entidad);
    void eliminar(ID id);  
} 
