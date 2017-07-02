package br.pet.dao;

import br.pet.getset.AnimalGetSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AnimalDao {

    public void Insert(AnimalGetSet a) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into animal (proprietario, animal, nome, raca, sexo, cor, idade, altura, peso) values(?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, a.getCliente().getId());
            ps.setString(2, a.getAnimal());
            ps.setString(3, a.getNome());
            ps.setString(4, a.getRaca());
            ps.setString(5, a.getSexo());
            ps.setString(6, a.getCor());
            ps.setInt(7, a.getIdade());
            ps.setInt(8, a.getAltura());
            ps.setInt(9, a.getPeso());
            ps.execute();

            conn.commit();

        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void Update(AnimalGetSet a) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update animal set idade = ?, altura= ?,peso = ?, cor = ?, where id = ?";
            ps = conn.prepareStatement(sql);

            ps.setInt(1, a.getIdade());
            ps.setInt(2, a.getAltura());
            ps.setInt(3, a.getPeso());
            ps.setString(4, a.getCor());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }
    
       public void Delete(int a) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from animal where proprietario = ?";
            ps = conn.prepareStatement(sql);
           ps.setInt(1, a);
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

}
