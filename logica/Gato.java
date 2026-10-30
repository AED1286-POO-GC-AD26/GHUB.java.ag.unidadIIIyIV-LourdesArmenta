package logica;

public class Gato extends Animal{
    public Gato(){
        super();
    }
    public Gato(String nombre){
        super(nombre);
    }
    @Override
    public void hacerSonido(){
        System.out.println("El gato hace miau miau");
    }
   
    
}
