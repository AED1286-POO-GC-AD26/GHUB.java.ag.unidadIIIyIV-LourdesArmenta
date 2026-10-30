package gestionBiblioteca;

public class Revista extends MaterialBibliografico {
    private String periodicidad;
    public Revista(){
        super();
    }

    public Revista(String titulo, int anio,String periodicidad) {
        super(titulo, anio);
        this.periodicidad = periodicidad;
    }
    public String getPeriodicidad(){
        return periodicidad;
    }
    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    @Override
    public int calcularTiempoPrestamo() {
        return 7;
    }
}
