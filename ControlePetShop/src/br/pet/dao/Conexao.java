package br.pet.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            

            conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/petdb", "sa", "");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Problemas ao conectar no banco de dados");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Problemas ao conectar no");
        }
        return conn;
    }
}
