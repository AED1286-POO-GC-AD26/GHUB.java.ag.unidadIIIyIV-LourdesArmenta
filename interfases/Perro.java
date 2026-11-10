package interfases;

public class Perro implements Cachorro{
    @Override
    public void hacerSonido() {
        System.out.println("El perro hace gua gua");
    }
    @Override
    public void moverse() {
        System.out.println("El perro se mueve");
    }
    @Override
    public void jugar() {
       System.out.println("El cachorro esta jungando");  
    } 
 
}
