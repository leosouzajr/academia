/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexao {
    static private Connection con;
    
    public static Connection getConnection(){
        
        try {
            
            con = (Connection) DriverManager.getConnection(""
                    + "jdbc:mysql://localhost/Academia", "root", "Pass1234");
            
            
            
            
            
            
            
            
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco!");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
       
        return con;
    }
}
    
