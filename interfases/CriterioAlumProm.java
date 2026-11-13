package interfases;
public class CriterioAlumProm extends Criterio<Alumno>{
    @Override
    public int comparar(Alumno a, Alumno b){
        return (int) (a.getNotaPromedio()-b.getNotaPromedio());
    }
    
}
