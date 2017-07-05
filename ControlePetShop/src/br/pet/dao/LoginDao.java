package br.pet.dao;

import br.pet.excecoes.LogExceptions;
import br.pet.getset.LoginGetSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {

    private final LogExceptions execao = new LogExceptions();

    
     public void Read(LoginGetSet login) {

        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conexao.getConnection();
            String sql = "select id,nome,senha from login where nome = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, login.getLogin());
          
            
            ps.execute();
            rs = ps.executeQuery();

            if (rs.next()) {
                login.setId(rs.getInt("id"));
                login.setLogin(rs.getString("nome"));
                login.setSenha(rs.getString("senha"));

                conn.commit();
            }
        } catch (SQLException e) {
            execao.exception(e);

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    execao.exception(ex);
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    execao.exception(ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    execao.exception(ex);
                }
            }
        }
    }
}
