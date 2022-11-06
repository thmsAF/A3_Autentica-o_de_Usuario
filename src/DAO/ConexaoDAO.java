package DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Pichau
 */
public class ConexaoDAO {
    
    //
    public Connection conectaBD(){
    
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/bancoteste?user=root&passoword=123";
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Conexão DAO"+ erro.getMessage());
        }
        return conn;
    
    }
    
}
