package br.pet.dao;

import br.pet.excecoes.LogExceptions;
import br.pet.getset.LoginGetSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {

    private final LogExceptions execao = new LogExceptions();

    public LoginGetSet GetUsuario(String login) {

        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conexao.getConnection();
            String sql = "select id,nome,senha from login where nome = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, login);
            ps.execute();
            rs = ps.executeQuery();
            LoginGetSet l = new LoginGetSet();
            if (rs.next()) {
                l.setId(rs.getInt("id"));
                l.setLogin(rs.getString("nome"));
                l.setSenha(rs.getString("senha"));

                conn.commit();
            }
            return l;
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
        return null;
    }

    public void Update(LoginGetSet login) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update login set  senha = ? where nome = ?";
            ps = conn.prepareStatement(sql);

            ps.setString(1, login.getSenha());
            ps.setString(2, login.getLogin());

            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            execao.exception(e);
            //System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    execao.exception(ex);
                    //System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    execao.exception(ex);
                    //System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    execao.exception(ex);
                    //System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

}
