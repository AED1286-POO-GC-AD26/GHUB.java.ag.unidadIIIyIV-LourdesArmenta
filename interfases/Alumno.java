package interfases;
public class Alumno implements Comparable<Alumno>{
    //atributos
    private String nombre;
    private int edad;
    private double notaPromedio;
    //constructores
    public Alumno(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }
    //método heredado de la interfaz Comparable
    @Override 
    public int compareTo(Alumno otroAlumno){
        /* 
        int dif = this.edad - otroAlumno.edad; //18-15 = 3 //15-18 = -3 //18-18 = 0
        return dif;
        */
       //cambiar el criterio de comparacion para que ahora
       //sea el atributo nombre el que utilice
       if(this.nombre.compareTo(otroAlumno.nombre)>0){
          return 1;
       }else if(this.nombre.compareTo(otroAlumno.nombre)<0){
         return -1;
       }
        else{
            return 0;

       }
       

    }
    //sobrecargamos el método toString
    @Override
    public String toString() {
        return "nombre=" + nombre + ", edad=" + edad +
             ", notaPromedio=" + notaPromedio ;
    }
    //getter
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public double getNotaPromedio() {
        return notaPromedio;
    }
    //setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNotaPromedio(double notaPromedio) {
        this.notaPromedio = notaPromedio;
    }
    
    
    
}
