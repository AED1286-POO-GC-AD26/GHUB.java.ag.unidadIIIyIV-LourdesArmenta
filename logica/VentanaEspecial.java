package logica;

public class VentanaEspecial extends Ventana{
    @Override 
    public void copiar(String p, int x, int y){
        System.out.println("Estoy en el método copia de la clase"+
                        " VENTANAESPECIAL que recibe un parámetro tres tipos: String,int,int");

    }
    
    public void copiar(char c, int veces, int x, int y){
        
        System.out.println("Estoy en el método copia de la clase"+
                        " VENTANAESPECIAL que recibe parámetro cuatro tipos: char,int,int,int");

    }

    public void metodo1(){
        System.out.println("Estoy en método1 de la clase derivada e invoco a "+
            " metodo1 de la clase base");
        super.metodo1();
    }
    public void metodo2(){
        this.metodo1();
        super.metodo1();
        metodo3();
        super.metodo3();
    }


    
}
