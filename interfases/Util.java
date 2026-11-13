package interfases;

public class Util {
    public static void ordenar(Comparable arr[]){
        boolean ordenado = false;
        while(!ordenado){
            ordenado = true;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i+1].compareTo(arr[i])<0){
                    Comparable aux = arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1]=aux;
                    ordenado = false;

                }
            }
        }

    }
    public static void ordenar(Object arr[],Criterio cr){
        boolean ordenado = false;
        while(!ordenado){
            
            for(int i=0, j = arr.length-1; i<=j;i++,j--){
                //ahora la decisionde sobre "quien precede a quien"
                //la toma la instancia de Criterio cr
                if(cr.comparar(arr[i+1], arr[i])<0){
                    Object aux = arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1]=aux;
                    ordenado = false;
                     
                }

            }
        }

    }
    
}
