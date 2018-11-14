/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author Nil
 */
public class ModuloConexao {
    //método responsável por estabelecer conexão com o banco

    public static Connection conector() {
        //variável que receberá a string de conexão
        java.sql.Connection conexao = null;
        // linha abaixo chama o "driver" da de conexao do mysql
        String driver = "com.mysql.jdbc.Driver";
        //Armazenando informações referentes ao banco
        String url = "jdbc:mysql://localhost:3316/dbinfox";
        String user = "root";
        String password = "";
        
        //estabelecendo a conexão com o banco de dados e tratando exceções como indisponibilidade do servidor
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            
            return conexao;
          
        } catch (Exception e) {
            //A linha abaixo serve de apoio para esclarecer o erro de conexão
           // System.out.println(e);
            
            return null;
        }
        
    }

}
