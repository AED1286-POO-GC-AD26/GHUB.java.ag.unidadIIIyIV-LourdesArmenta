package gestionBiblioteca;

public abstract class MaterialBibliografico {

    private String idEjemplar;
    protected String titulo;
    protected int anio;
    public MaterialBibliografico(){
        
    }

    public MaterialBibliografico(String idEjemplar,String titulo, int anio) {
        this.idEjemplar = idEjemplar;
        this.titulo = titulo;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }
    

    public String getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(String idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public abstract int calcularTiempoPrestamo();
    public abstract String devolverDatos();
}
