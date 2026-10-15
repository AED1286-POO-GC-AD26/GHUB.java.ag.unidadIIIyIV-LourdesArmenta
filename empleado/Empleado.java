package empleado;

public class Empleado {
    //atributos
    private String nombre;
    private int edad;
    private String TipoRelacionLaboral;
    //constructores
    public Empleado() {
    }
    public Empleado(String nombre, int edad, String tipoRelacionLaboral) {
        this.nombre = nombre;
        this.edad = edad;
        TipoRelacionLaboral = tipoRelacionLaboral;
    }
    //getter
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getTipoRelacionLaboral() {
        return TipoRelacionLaboral;
    }
    //setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setTipoRelacionLaboral(String tipoRelacionLaboral) {
        TipoRelacionLaboral = tipoRelacionLaboral;
    }
    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", edad=" + edad + ", TipoRelacionLaboral=" + TipoRelacionLaboral + "]";
    }
    
}
