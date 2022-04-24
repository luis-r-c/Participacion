package com.emergentes.modelo;

public class libro {
    private int id;
    private String titulo;
    private String autor;
    private String disponible;
    private String categoria;
    
    public libro() {
        id = 0;
        titulo = "";
        autor = "";
        disponible = "";
        categoria = "";  
    }

    public libro(int id, String titulo, String autor, String disponible, String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
        this.categoria = categoria;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "libro{" + "id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", disponible=" + disponible + ", categoria=" + categoria + '}';
    }
}
