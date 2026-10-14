package logica;

import java.util.Arrays;

public class FechaDetallada extends  Fecha{
    //arreglo en donde almacenar los nombre de los meses
    private  static final String meses[] ={"Enero","Febrero","Marzo",
                             "Abril","Mayo","Junio",
                             "Julio","Agosto","Septiembre",
                             "Octubre","Noviembre","Diciembre"};
    private static int cont; //variable que va contar cuantas Fechas Detalladas he hecho
    //constructores
    public FechaDetallada(){
        super();
        cont++;
    }
    public FechaDetallada(int dia,int mes,int anio){
        super(dia,mes,anio);
        cont++;
    }

    public static String getMeses(){
        return Arrays.toString(meses);
    }

    public static int getContador(){
        return  cont;
    }

    @Override 
    public String toString(){
        return this.getDia()+" de "+meses[this.getMes()-1]+" de "+this.getAnio();
    }


                    
    
}
