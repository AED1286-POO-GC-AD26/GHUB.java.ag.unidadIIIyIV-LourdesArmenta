package interfases;

public class CriterioAlumEdad extends Criterio<Alumno>{
    @Override 
    public int comparar(Alumno a,Alumno b){
        return a.getEdad()-b.getEdad();

    }
    
}
