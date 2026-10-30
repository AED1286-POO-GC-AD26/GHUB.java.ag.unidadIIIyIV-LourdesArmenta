package gestionBiblioteca;

public abstract class MaterialBibliografico {

    protected String titulo;
    protected int anio;
    public MaterialBibliografico(){
        
    }

    public MaterialBibliografico(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public abstract int calcularTiempoPrestamo();
}
