/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CentralConexões;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author sistemas
 */
public class ConnectionFactory {
    
  // public Statement stm;
 // public ResultSet rs;
   private String driver;
   private String url= "jdbc:mysql://localhost:3306/testetriagemdoc?useTimezone=true&serverTimezone=UTC";
   private String login = "jov";
   private String senha = "123456";
public Connection conn;
   
public Connection getConnection(){
    Connection conn = null;
    
    try {
        conn = DriverManager.getConnection(url, login, senha);
        JOptionPane.showMessageDialog(null, "Conectado ao banco de dados com sucesso");
        
    } catch (Exception e) {
        System.err.println("Erro de conexão com o banco de dados"+e.getMessage());
//+e.getCause());
    }
       return conn;

}

public void Desconetar(){

    try {
        conn.close();
        JOptionPane.showMessageDialog(null,"Desconexçao com o banco de dados");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Erro ao Desconetar com o banco de dados"+e.getMessage());
    }
}
    }
   

