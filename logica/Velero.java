package logica;

public class Velero extends Barco{
    public Velero(){
        super();
        System.out.println("Se crea la parte del velero");
    }
    @Override 
    public void alarma(String msg){
        System.out.println("\tMensaje:"+msg+" enviado desde un Velero");
        
    }
    
}
