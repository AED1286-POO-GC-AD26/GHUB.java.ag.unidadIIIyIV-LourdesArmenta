package interfases;

public class TelefonoInteligente extends Telefono implements Camara {
    @Override
    public void hacerLlamada() {
        System.out.println("El telefono inteligenta hace una llamada");  
    }
    @Override
    public void tomarFoto() {
       System.out.println("El telefono inteligente toma una foto");   
    }
    
}
