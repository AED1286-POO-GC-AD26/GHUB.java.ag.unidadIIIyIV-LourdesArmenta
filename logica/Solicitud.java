package logica;

public class Solicitud {
    //atributos
    private String nombre;
    private int id;
    private EstadoSolicitud estado;
    //métodos
    public Solicitud(String nombre,int id, EstadoSolicitud estado){
        this.nombre = nombre;
        this.id = id;
        this.estado = estado;
    }
    //getter
    public String getNombre(){
        return nombre;
    }
    public int getId(){
        return id;
    }
    public EstadoSolicitud getEstado(){
        return estado;
    }
    //setter

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setEstado(EstadoSolicitud estado){
        this.estado = estado;
    }
    
    @Override 
    public String toString(){
        return "Id:"+id+" Nombre:"+nombre+" Estado:"+estado;
    } 

    
}
