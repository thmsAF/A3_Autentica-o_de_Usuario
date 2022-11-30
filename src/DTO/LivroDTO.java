/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Pichau
 */
public class LivroDTO {

    private String titulo_livro, genero_livro;
    private int id_livro;

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public String gettitulo_livro() {
        return titulo_livro;
    }

    public void settitulo_livro(String titulo_livro) {
        this.titulo_livro = titulo_livro;
    }

    public String getgenero_livro() {
        return genero_livro;
    }

    public void setgenero_livro(String genero_livro) {
        this.genero_livro = genero_livro;
    }
}
