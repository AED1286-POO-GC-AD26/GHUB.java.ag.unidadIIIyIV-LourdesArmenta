package logica;
//CLASE BASE
public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    //constructor
    public Fecha(){
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;

    }
    public Fecha(int dia, int mes,int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    //getter
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAnio(){
        return anio;
    }
    //setter
    public void setDia(int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    //sobrescribir
    @Override
    public String toString(){
        return dia+"/"+mes+"/"+anio;
    }
    @Override 
    public boolean equals(Object f){
        Fecha o = (Fecha)f; //hago un cast
        if(this.dia == o.getDia() && this.mes == o.getMes() && this.anio == o.getAnio()){
            return true;
        }else{
            return false;
        }
    }
    
    
}
