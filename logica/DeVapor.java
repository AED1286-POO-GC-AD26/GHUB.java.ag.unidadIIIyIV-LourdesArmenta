package logica;

public class DeVapor extends Barco{
    public DeVapor(){
        super();
        System.out.println("Se crea la parte del barco de vapor");
    }
    @Override 
    public void alarma(String msg){
        System.out.println("\tMensaje:"+msg+" enviado desde un DeVapor");

    }
    
}
