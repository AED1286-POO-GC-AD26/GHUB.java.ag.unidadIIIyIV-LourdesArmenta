package logica;

public class Perro extends Animal{
    public Perro(){
        super();
    }
    public Perro(String nombre){
        super(nombre);
    }
    @Override 
    public void hacerSonido(){
        System.out.println("El perro hace gua gua");
    }
    
}
