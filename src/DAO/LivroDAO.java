/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import DTO.LivroDTO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public class LivroDAO {

    PreparedStatement pstm;
    Connection conn;
    ResultSet rs;
    ArrayList<LivroDTO> lista = new ArrayList<>();

    public void cadastrarLivro(LivroDTO objlivroDTO) {

        String sql = "insert into livros(titulo_livro, genero_livro) values(?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement("insert into livros(titulo_livro, genero_livro) values(?,?)");
            pstm.setString(1, objlivroDTO.gettitulo_livro());
            pstm.setString(2, objlivroDTO.getgenero_livro());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO" + erro);
        }

    }

    public ArrayList<LivroDTO> CarregararCampos() {

        conn = new ConexaoDAO().conectaBD();
        String sql = "select *from livros";
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                LivroDTO objlivroDTO = new LivroDTO();
                objlivroDTO.setId_livro(rs.getInt("id_livro"));
                objlivroDTO.settitulo_livro(rs.getString("titulo_livro"));
                objlivroDTO.setgenero_livro(rs.getString("genero_livro"));

                lista.add(objlivroDTO);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO Pesquisar" + erro);
        }
        return lista;
    }

    public void excluirLivro(LivroDTO objlivrodto) {
        String sql = "delete from livros where id_livro = ? ";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
           
            pstm.setInt(1, objlivrodto.getId_livro());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO" + erro);
        }
    }
}
