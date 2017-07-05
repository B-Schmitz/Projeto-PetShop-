package br.pet.dao;

import br.pet.excecoes.LogExceptions;
import br.pet.getset.AnimalGetSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnimalDao {

    private final LogExceptions execao = new LogExceptions();

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
            execao.exception(e);
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    execao.exception(ex);
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    execao.exception(ex);
                   // System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    execao.exception(ex);
                   // System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void Update(AnimalGetSet a) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update animal set idade = ?, altura= ?,peso = ?, cor = ? where id = ?";
            ps = conn.prepareStatement(sql);

            ps.setInt(1, a.getIdade());
            ps.setInt(2, a.getAltura());
            ps.setInt(3, a.getPeso());
            ps.setString(4, a.getCor());
            ps.setInt(5,a.getId());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            execao.exception(e);
           // System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    execao.exception(ex);
                  //  System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    execao.exception(ex);
                  //  System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    execao.exception(ex);
                  //  System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    // Se um proprietario é excluido, todos os animais ligados a ele tabem são
    public void DeleteProprietario(int a) {
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
            execao.exception(e);
         //   System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    execao.exception(ex);
                 //   System.out.println("ERRO: " + ex.getMessage());
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
    
    public void Delete(AnimalGetSet a) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from animal where id = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, a.getId());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            execao.exception(e);
          //  System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    execao.exception(ex);
                 //   System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    execao.exception(ex);
                   // System.out.println("ERRO: " + ex.getMessage());
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

    public boolean buscaNome(AnimalGetSet a, String nome) {

       
        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement ps = null;
        boolean t = false;
       
        try {
            conn = Conexao.getConnection();
            String sql = "select id,animal,nome,raca,cor,sexo,idade,altura,peso,proprietario from animal where proprietario = ? and nome = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, a.getCliente().getId());
            ps.setString(2, nome);
            ps.execute();
            rs = ps.executeQuery();

            if (rs.next()) {

                a.setId(rs.getInt("id"));
                a.setAltura(rs.getInt("altura"));
                a.setAnimal(rs.getString("animal"));
                a.setCor(rs.getString("cor"));
                a.setIdade(rs.getInt("idade"));
                a.setNome(rs.getString("nome"));
                a.setPeso(rs.getInt("peso"));
                a.setRaca(rs.getString("raca"));
                a.setSexo(rs.getString("sexo"));
                
                
                conn.commit();
                t = true;
            }
        } catch (SQLException e) {
            t = false;
            // System.out.println("ERRO: " + e.getMessage());
            execao.exception(e);

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    // System.out.println("ERRO: " + ex.getMessage());
                    execao.exception(ex);
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
                    // System.out.println("ERRO: " + ex.getMessage());
                    execao.exception(ex);
                }
            }
        }
       return t;
    }

}
