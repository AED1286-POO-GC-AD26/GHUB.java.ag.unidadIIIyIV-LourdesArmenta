package logica;
public class Persona{
    //Atributos
    private String nombre;
    private int edad;
    //constructrores
    public Persona(){

    }
    public Persona(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    //getter
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    //setter
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    


}