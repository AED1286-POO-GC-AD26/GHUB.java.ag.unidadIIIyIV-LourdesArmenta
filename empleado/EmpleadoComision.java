package empleado;

public class EmpleadoComision extends Empleado{
    //atributos
    private double comision;
    private int ventasRealizadas;
    //constructores
    public EmpleadoComision(){
        super();
    }
    public EmpleadoComision(double comision, int ventasRealizadas) {
        super();
        this.comision = comision;
        this.ventasRealizadas = ventasRealizadas;
        
    }
    public EmpleadoComision(String nombre, int edad, String tipoRelacionLaboral, double comision,
            int ventasRealizadas) {
        super(nombre, edad, tipoRelacionLaboral);
        this.comision = comision;
        this.ventasRealizadas = ventasRealizadas;
    }
    //getter
    public double getComision() {
        return comision;
    }
    public int getVentasRealizadas() {
        return ventasRealizadas;
    }
    //setter
    public void setComision(double comision) {
        this.comision = comision;
    }
    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }
    @Override
    public String toString() {
        return "EmpleadoComision [comision=" + comision + ", ventasRealizadas=" + ventasRealizadas + "]";
    }

    
    
    
    
    
}
