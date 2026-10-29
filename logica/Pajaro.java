package logica;

public class Pajaro extends Animal{
    public Pajaro(){
        super();
    }
    public Pajaro(String nombre){
        super(nombre);
    }
    @Override 
    public void hacerSonido(){
        System.out.println("el pajaro hace cucurucucu");
    }
    
}
