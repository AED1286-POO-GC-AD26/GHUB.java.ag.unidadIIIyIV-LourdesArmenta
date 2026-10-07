package logica;
public class Empleado extends Persona{
    //atributos
    private double salario;
    //constructores
    public Empleado(){
        super(); //INVOCA AL CONSTRICTOR VACIO DE LA CLASE BASE
        this.salario = 0.0;

    }
    public Empleado(String nombre, int edad,double salario){
        super(nombre,edad); //INVOCA AL CONSTRUCTOR CON DOS PARAMETROS DE LA CLASE BASE
        this.salario = salario;
    }
    //getter
    public double getSalario(){
        return salario;
    }
    //setter
    public void setSalario(double salario){
        this.salario = salario;
    }
    //sobreescribir
    @Override 
    public String mostrarDatos(){
         return "Nombre: "+super.getNombre()+" Edad:"+super.getEdad()+" años "
        +"Salario:"+salario;
    }
     @Override 
    public String toString(){
        return " Empleado: "+" Nombre: "+super.getNombre()+" Edad:"+super.getEdad()
        +" años "+" Salario:"+salario;
    }

}