package br.pet.dao;

import br.pet.getset.ClienteGetSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDao {
    
    
    public void Insert(ClienteGetSet c)  {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into cliente (cpf, nome,idade,sexo,telefone,endereco,email) values(?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setLong(1, c.getCPF());
            ps.setString(2, c.getNome());
            ps.setLong(3, c.getIdade());
            ps.setString(4, c.getSexo());
            ps.setLong(5, c.getTelefone());
            ps.setString(6, c.getEndereco());
            ps.setString(7, c.getEmail());
            ps.execute();

            conn.commit();

        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }
        
        public void Update(ClienteGetSet c){
              Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update cliente set endereco = ?, email= ?,idade = ?,nome = ?, sexo = ?, telefone = ?, where cpf = ?";
            ps = conn.prepareStatement(sql);
           
            ps.setString(1, c.getEndereco());
            ps.setString(2, c.getEmail());
            ps.setInt(3, c.getIdade());
            ps.setString(4, c.getNome());
            ps.setString(5, c.getSexo());
            ps.setLong(6, c.getTelefone());
            ps.setLong(7, c.getCPF());
            ps.execute();

            conn.commit();
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }


        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        }
        
    

}
