package logica;

public class Barco {
    public Barco(){
         System.out.println("\tSe crea la parte del barco");

    }
    public void alarma(){
        System.out.println("\tS.O.S desde un Barco");
    }
    public void alarma(String msg){
        System.out.println("\tMensaje:"+msg+" enviado desde un Barco");
        
    }
}
