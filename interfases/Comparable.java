package interfases;
/*
Esta interface define un unico método que recibe un objeto
como parámetro y debe retornar un valor entero: mayor, menor o igual a cero
según resulte la compracion entre los atributos de la instancia this y los de
el parámetro obj
 */

public interface Comparable <T> {
    public int compareTo(T obj);
    
}
