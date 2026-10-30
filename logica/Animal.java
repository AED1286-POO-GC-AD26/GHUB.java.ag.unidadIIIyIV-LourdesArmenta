package logica;

public abstract class Animal {
    private String nombre;
    public Animal(){

    }
    public Animal(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public abstract void hacerSonido();
    public void moverse(){
        System.out.println("El animal se mueve");
    }
    public final void dormir(){
        System.out.println(nombre+" esta durmiendo....");

    }
    @Override 
    public String toString(){
        return nombre;
    }
    

    
}
