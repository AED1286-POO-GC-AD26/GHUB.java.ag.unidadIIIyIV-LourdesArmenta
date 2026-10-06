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

}