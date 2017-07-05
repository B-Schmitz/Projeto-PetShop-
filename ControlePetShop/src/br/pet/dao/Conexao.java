package br.pet.dao;

import br.pet.excecoes.LogExceptions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Conexao {

    private static LogExceptions execao = new LogExceptions();

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("org.hsqldb.jdbcDriver");

            conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/petdb", "sa", "");
        } catch (SQLException e) {
            // e.printStackTrace();
            execao.exception(e);
            System.out.println("Problemas ao conectar no banco de dados");
            JOptionPane.showMessageDialog(null, "Problemas ao conectar no banco de dados", "Erro", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Não é possível conectar-se ao banco de dados,\nEntre em contato com o suporte técnico.", "Erro", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
            execao.exception(e);
        }
        return conn;
    }
}
