package empleado;

public class EmpleadoSueldoFijo extends Empleado{
    //atributos
    private double sueldoFijo;

    //constructores
    public EmpleadoSueldoFijo(){
        super();
    }

    public EmpleadoSueldoFijo(String nombre, int edad, String tipoRelacionLaboral,double sueldoFijo) {
        super(nombre,edad,tipoRelacionLaboral);
        this.sueldoFijo = sueldoFijo;
    }

    public double getSueldoFijo() {
        return sueldoFijo;
    }

    public void setSueldoFijo(double sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }

    @Override
    public String toString() {
        return "EmpleadoSueldoFijo [sueldoFijo=" + sueldoFijo + "]";
    }
    
    
    
}
