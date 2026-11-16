package genericidad;

public class Caja <T> {
    //atributo
    private T dato;
    //constructor
    public Caja(T dato){
        this.dato = dato;
    }
    //getter
    public T getDato(){
        return dato;
    }
    
    
}
