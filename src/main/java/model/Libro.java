package model;

public class Libro {
    private int codigo;
    private String titulo; 
    private String autor;
    private int nPaginas;
    public Libro(String titulo, String autor, int codigo, int nPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.nPaginas = nPaginas;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
