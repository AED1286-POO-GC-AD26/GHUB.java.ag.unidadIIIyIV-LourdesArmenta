package logica;
import java.time.LocalDate;
//CLASE BASE
public class Publicacion{
    //atributos
    private String editorial;
    private LocalDate fechaPub;
    //constructores
    public Publicacion() {
    }
    public Publicacion(String editorial, LocalDate fechaPub) {
        this.editorial = editorial;
        this.fechaPub = fechaPub;
    }
    //getter
    public String getEditorial() {
        return editorial;
    }
    public LocalDate getFechaPub() {
        return fechaPub;
    }
    //setter
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public void setFechaPub(LocalDate fechaPub) {
        this.fechaPub = fechaPub;
    }

    @Override
    public String toString() {
        return "Publicacion [editorial=" + editorial + ", fechaPub=" + fechaPub + "]";
    }
    
    

}