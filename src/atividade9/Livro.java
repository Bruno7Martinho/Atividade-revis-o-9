/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade9;

/**
 *
 * @author 7
 */
public class Livro {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginasLidas;

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

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }
    
    public void atualizarProgresso(int paginasLidas) {
        setPaginasLidas(this.paginasLidas + paginasLidas);
    }

   
    public double exibirProgresso() {
        return ((double) paginasLidas / totalPaginas) * 100;
    }

    
    public boolean isLeituraCompleta() {
        return paginasLidas == totalPaginas;
        
    }

   
 
}
