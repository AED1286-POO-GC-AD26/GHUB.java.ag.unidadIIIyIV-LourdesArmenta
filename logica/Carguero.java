package logica;

public class Carguero extends DeVapor{
    public Carguero(){
        super();
        System.out.println("Se crea la parte del carguero");
    }
    @Override 
    public void alarma(String msg){
        System.out.println("\tMensaje:"+msg+" enviado desde un Carguero");
        
    }
   
    
}
