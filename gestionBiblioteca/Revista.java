package gestionBiblioteca;

public class Revista extends MaterialBibliografico {
    private String periodicidad;
    private String issn;
    private Estado estado;
    public Revista(){
        super();
        this.periodicidad = "No Definida";
        this.issn = "NA";
        estado = Estado.DISPONIBLE;
    }

    public Revista(String idEjemplar, String titulo, int anio,String periodicidad,String issn) {
        super(idEjemplar, titulo, anio);
        this.periodicidad = periodicidad;
        this.issn = issn;
        estado = Estado.DISPONIBLE;
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
    public Estado getEstado(){
        return estado;
    }
    public void setEstado(Estado estado){
        this.estado = estado;
    }


    @Override 
    public String devolverDatos() {
        
        return  super.getIdEjemplar()+ issn + "  " + titulo + " " +periodicidad+ " "+
                estado;
    }

    @Override
    public int calcularTiempoPrestamo() {
        return 7;
    }
    
}
