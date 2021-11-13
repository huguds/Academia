/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONEXAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author vitin
 */
public class ModuloDeConexao {
    
    // metodo responsavel por estabelecer a conexao com o banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // Chama o driver importado para a biblioteca
        String driver = "com.mysql.jdbc.Driver";
        // Armazena informações referente ao banco
        String url = "jdbc:mysql://127.0.0.1:3306/Academia";
        String user = "root";
        String password = "veto";
        // Estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //Linha abaixo serve de apoio para esclarecer o erro
            //System.out.println(e);
            return null;
        }
    }
    
}
