/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author yuri
 */
public class Conexao {


    private static String host = "localhost";
    private static String database = "Comanda";
    private static String user = "postgres";
    private static String port = "5432";
    private static String password = "postgres";
    private static Connection singleton = null;

    public Conexao() {

    }

    public static synchronized Connection getInstance() throws SQLException {
        String url = "jdbc:postgresql://" + Conexao.host + ":" + Conexao.port + "/" + Conexao.database;
        if (singleton == null) {
            singleton = DriverManager.getConnection(url, Conexao.user, Conexao.password);
        }
        return singleton;

    }

}
