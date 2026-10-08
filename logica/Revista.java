package logica;

import java.time.LocalDate;

public class Revista extends Publicacion{
    //atributos
    private int idEjemplar;
    private String nombre; 
    private String periodicidad;
    //constructores
    public Revista() {
        super();
    }
    
    public Revista(String editorial, LocalDate fechaPub, int idEjemplar, String nombre, String periodicidad) {
        super(editorial, fechaPub);
        this.idEjemplar = idEjemplar;
        this.nombre = nombre;
        this.periodicidad = periodicidad;
    }
    //UTILIZAR OTRO CONSTRUCTOR
    //getter

    public int getIdEjemplar() {
        return idEjemplar;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }
    //setter

    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    @Override
    public String toString() {
        return "Revista [idEjemplar=" + idEjemplar + ", nombre=" + nombre + ", periodicidad=" + periodicidad + "]";
    }
    
    
}