package empleado;

public class EmpleadoPorHoras extends Empleado{
    //atributos
    private double tarifaPorHoras;
    private int horasTrabajadas;
    //constructores
    public EmpleadoPorHoras(){
        super();
    }
    public EmpleadoPorHoras(double tarifaPorHoras, int horasTrabajadas) {
        super();
        this.tarifaPorHoras = tarifaPorHoras;
        this.horasTrabajadas = horasTrabajadas;
    }
    public EmpleadoPorHoras(String nombre, int edad, String tipoRelacionLaboral, double tarifaPorHoras,
            int horasTrabajadas) {
        super(nombre, edad, tipoRelacionLaboral);
        this.tarifaPorHoras = tarifaPorHoras;
        this.horasTrabajadas = horasTrabajadas;
    }
    //getter
    public double getTarifaPorHoras() {
        return tarifaPorHoras;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    //setter
    public void setTarifaPorHoras(double tarifaPorHoras) {
        this.tarifaPorHoras = tarifaPorHoras;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    //sobreescritura
    @Override
    public String toString() {
        return "EmpleadoPorHoras [tarifaPorHoras=" + tarifaPorHoras + ", horasTrabajadas=" + horasTrabajadas + "]";
    }
    
    
    
    
}
