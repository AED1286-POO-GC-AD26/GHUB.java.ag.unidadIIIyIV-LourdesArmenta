package logica;

public class Tarea {
    //atributos
    private String nombre;
    private Prioridad prioridad;
    //constructores
    public Tarea(String nombre, Prioridad prioridad){
        this.nombre = nombre;
        this.prioridad=prioridad;

    }
    //getter
    public String getNombre(){
        return nombre;
    }
    public Prioridad getPrioridad(){
        return prioridad;

    }
}
