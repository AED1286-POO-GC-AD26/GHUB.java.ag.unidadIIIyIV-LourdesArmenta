package logica;

public class FechaDetallada extends  Fecha{
    //arreglo en donde almacenar los nombre de los meses
    private String meses[] ={"Enero","Febrero","Marzo",
                             "Abril","Mayo","Junio",
                             "Julio","Agosto","Septiembre",
                             "Octubre","Noviembre","Diciembre"};
    //constructores
    public FechaDetallada(){
        super();
    }
    public FechaDetallada(int dia,int mes,int anio){
        super(dia,mes,anio);
    }
    @Override 
    public String toString(){
        return this.getDia()+" de "+meses[this.getMes()-1]+" de "+this.getAnio();
    }


                    
    
}
