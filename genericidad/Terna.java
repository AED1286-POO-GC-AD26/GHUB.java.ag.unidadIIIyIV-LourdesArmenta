package genericidad;

public class Terna <T> {
    //atributos
    private T p1;
    private T p2;
    private T p3;
    //contructor
    public Terna(){
        p1 = null;
        p2= null;
        p3 = null;
    }
    public Terna(T p1, T p2, T p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    //Método personalizado
    public T get(int i){
        if(i>3 || i<1){
            System.out.println("posición inválida");
            return null;
        }
        if(i==1){
            return p1;
        }else if(i==2){
            return p2;
        }else{
            return p3;
        }
    }
    public void set(T valor, int i){
        if(i>3 || i<1){
            System.out.println("posición inválida");
            return;
        }
        if(i==1){
            p1 = valor;
        }else if(i==2){
            p2 = valor;
        }else{
            p3=valor;
        }
    } 
    @Override 
    public String toString(){
        return "Terna: "+p1+" "+p2+" "+p3;
    }
}
