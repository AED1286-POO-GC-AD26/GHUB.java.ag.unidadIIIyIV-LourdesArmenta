package logica;
public class Alumno extends Persona{
    //atributos
    private String matricula;
    //constructores
    public Alumno(){
        super(); //INVOCA AL CONSTRUCTOR DE LA BASE
        this.matricula = "SIN MATRICULA";
    }
    public Alumno(String nombre, int edad, String matricula){
        super(nombre,edad); //INVOCA AL CONSTRUCTOR DEL PADRE
        this.matricula = matricula;
    }
    //getter
    public String getMatricula(){
        return matricula;
    }
    //setter
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
   
}