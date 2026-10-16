package logica;
//CLASE BASE VENTANA
public class Ventana {
    
    public void copiar(Ventana w ){
        System.out.println("Estoy en el método copia de la clase"+
                        " VENTANA que recibe un parámetro tipo Ventana");

    }
    public void copiar(String p, int x, int y){
        System.out.println("Estoy en el método copia de la clase"+
                        " VENTANA que recibe parámetro tres tipos: String,int,int");

    }
   
    
}
