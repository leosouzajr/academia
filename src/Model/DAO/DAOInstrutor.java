
package Model.DAO;

import Model.Instrutor;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DAOInstrutor extends DAOGenerico{
    
    
    public List<Instrutor> consultarTodosOsInstrutores(){
         conectarBD();
         List<Instrutor> listaDeInstrutores = new ArrayList<>();
         String sql="select * from instrutor;";
         ResultSet rs;  //variavel que vai receber a consulta
        try {
            comando= con.prepareStatement(sql);
            rs=comando.executeQuery();
            
            while( rs.next()){
                 Instrutor instrutor = new Instrutor();
                 instrutor.setIdInstrutor(rs.getInt("idInstrutor"));
                 instrutor.setNomeInstrutor(rs.getString("nomeInstrutor"));
                 instrutor.setIdadeInstrutor(rs.getInt("idadeInstrutor"));
                 instrutor.setSalario(rs.getDouble("salario"));
                 
                 listaDeInstrutores.add(instrutor);
                 
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOInstrutor.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            fecharConexao();
        }
         
         return listaDeInstrutores;
    }
    
    public List<Instrutor> consultarInstrutoresComLike(String nome){
         conectarBD();
         List<Instrutor> listaDeInstrutores = new ArrayList<>();
         String sql="select * from instrutor where nomeInstrutor like ?;";
         ResultSet rs;  //variavel que vai receber a consulta
        try {
            comando= con.prepareStatement(sql);
            comando.setString(1,"%"+nome+"%" );
            rs=comando.executeQuery();
            
            while( rs.next()){
                 Instrutor instrutor = new Instrutor();
                 instrutor.setIdInstrutor(rs.getInt("idInstrutor"));
                 instrutor.setNomeInstrutor(rs.getString("nomeInstrutor"));
                 instrutor.setIdadeInstrutor(rs.getInt("idadeInstrutor"));
                 instrutor.setSalario(rs.getDouble("salario"));
                 
                 listaDeInstrutores.add(instrutor);
                 
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOInstrutor.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            fecharConexao();
        }
         
         return listaDeInstrutores;
    }
    
    
    public void inserirInstrutor(Instrutor instrutor){
       conectarBD();
       String sql="insert into instrutor (nomeInstrutor,idadeInstrutor,salario)"
               + " values(?,?,?);";
        try {
            comando = con.prepareStatement(sql);
            //definir os valores
            comando.setString(1,instrutor.getNomeInstrutor());
            comando.setInt(2,instrutor.getIdadeInstrutor());
            comando.setDouble(3, instrutor.getSalario());
            //executa o comando sql
            comando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOInstrutor.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro no cadastro");
        }finally{
            fecharConexao();
        }    
       

         
       
    }
    
    
    
    
    
    
    
//    public List<Instrutor> consultarTodosOsInstrutores(){
//        conectarBD();
//        
//        List<Instrutor> listaDeInstrutores = new ArrayList<>();
//        String sql="select *from instrutor;";
//        try {
//            ResultSet rs;
//            comando=con.prepareStatement(sql);
//            rs=comando.executeQuery();
//            while(rs.next()){
//                Instrutor instrutor= new Instrutor();
//                instrutor.setIdInstrutor(rs.getInt("idInstrutor"));
//                instrutor.setIdadeInstrutor(rs.getInt("idadeInstrutor"));
//                instrutor.setNomeInstrutor(rs.getString("nomeInstrutor"));
//                instrutor.setSalario(rs.getDouble("salario"));
//                listaDeInstrutores.add(instrutor);
//            }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(DAOInstrutor.class.getName()).log(Level.SEVERE, null, ex);
//        }finally{
//            fecharConexao();
//        }
//        return listaDeInstrutores;
//    }
    
//     public List<Instrutor> consultarInstrutoresPorNome(String nome){
//        conectarBD();
//        
//        List<Instrutor> listaDeInstrutores = new ArrayList<>();
//        String sql="select * from instrutor where nomeInstrutor like ?;";
//        try {
//            ResultSet rs;
//            comando=con.prepareStatement(sql);
//            comando.setString(1, "%"+nome+"%");
//            JOptionPane.showMessageDialog(null,  "%"+nome+"%");
//            rs=comando.executeQuery();
//            while(rs.next()){
//                Instrutor instrutor= new Instrutor();
//                instrutor.setIdInstrutor(rs.getInt("idInstrutor"));
//                instrutor.setIdadeInstrutor(rs.getInt("idadeInstrutor"));
//                instrutor.setNomeInstrutor(rs.getString("nomeInstrutor"));
//                instrutor.setSalario(rs.getDouble("salario"));
//                listaDeInstrutores.add(instrutor);
//            }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(DAOInstrutor.class.getName()).log(Level.SEVERE, null, ex);
//        }finally{
//            fecharConexao();
//        }
//        return listaDeInstrutores;
//    }
}
