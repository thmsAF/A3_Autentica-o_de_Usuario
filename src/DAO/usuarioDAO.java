/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import DTO.UsuarioDTO;
import DAO.ConexaoDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

/**
 *
 * @author Pichau
 */
public class usuarioDAO {

    Connection conn;

    public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto) {
        conn = new ConexaoDAO().conectaBD();

        try {
            /*selecionar da tabela usuario onde o nome ? e senha ? forem iguais ao banco*/
            String sql = "select * from usuario where nome_usuario = ? and senha = ?";
            
            /* prepara a conexao e preprara o conteudo e traz o que tver no banco */
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getNome_usuario());
            pstm.setString(2, objusuariodto.getSenha_usuario());
            
            /*execulta o pstm*/
            ResultSet rs = pstm.executeQuery();
            return rs ;
            

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }
    }
}
