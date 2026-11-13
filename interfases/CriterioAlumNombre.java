package interfases;

public class CriterioAlumNombre extends Criterio<Alumno>{
    @Override 
    public int comparar(Alumno a, Alumno b){
        return a.getNombre().compareTo(b.getNombre());
        /* 
        
        if(a.getNombre().compareTo(b.getNombre())>0){
          return 1;
       }else if(a.getNombre().compareTo(b.getNombre())<0){
         return -1;
       }
        else{
            return 0;

       }
        */


    }
    
}
