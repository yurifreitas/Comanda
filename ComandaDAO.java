/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class ComandaDAO {
    
    public void inserir(String reg) throws SQLException{
        Connection connection = Conexao.getInstance();
         String sql = "INSERT INTO "
                    + "descricao(registro) VALUES (?);";
          PreparedStatement sqlp = connection.prepareStatement(sql);
                sqlp.setString(1,reg);
                sqlp.executeUpdate();
       
        
    }
    
}
