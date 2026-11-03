package gestionBiblioteca;

public class Revista extends MaterialBibliografico {
    private String periodicidad;
    private String issn;
    private boolean disponible;
    public Revista(){
        super();
        this.periodicidad = "No Definida";
        this.issn = "NA";
        disponible = true;
    }

    public Revista(String idEjemplar, String titulo, int anio,String periodicidad,String issn) {
        super(idEjemplar, titulo, anio);
        this.periodicidad = periodicidad;
        this.issn = issn;
        disponible = true;
    }
    public String getPeriodicidad(){
        return periodicidad;
    }
    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }
    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }
    
    public String devolverDatos() {
        Estado estado;
        if (disponible) {
            estado = Estado.DISPONIBLE;
        } else {
            estado = Estado.PRESTADO;
        }
        return  super.getIdEjemplar()+ issn + "  " + titulo + " " +periodicidad+ " "+
                estado;
    }

    @Override
    public int calcularTiempoPrestamo() {
        return 7;
    }
    
}
