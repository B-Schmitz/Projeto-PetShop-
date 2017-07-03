package br.pet.dao;

import br.pet.excecoes.LogExceptions;
import br.pet.getset.FuncionarioGetSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FuncionarioDao {

    private final LogExceptions execao = new LogExceptions();

    public void Insert(FuncionarioGetSet f) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into funcionario (cpf, nome, cargo, idade, sexo, telefone, endereco, email, Num_Pis) values(?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);

            ps.setString(1, f.getCPF());
            ps.setString(2, f.getNome());
            ps.setString(3, f.getCargo());
            ps.setInt(4, f.getIdade());
            ps.setString(5, f.getSexo());
            ps.setLong(6, f.getTelefone());
            ps.setString(7, f.getEndereco());
            ps.setString(8, f.getEmail());
            ps.setLong(9, f.getNum_Pis());
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

    public void Update(FuncionarioGetSet f) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update funcionario set  cargo = ?, endereco = ?, email= ?, idade = ?, nome = ?, sexo = ?, telefone = ? where cpf = ?";
            ps = conn.prepareStatement(sql);

            ps.setString(1, f.getCargo());
            ps.setString(2, f.getEndereco());
            ps.setString(3, f.getEmail());
            ps.setInt(4, f.getIdade());
            ps.setString(5, f.getNome());
            ps.setString(6, f.getSexo());
            ps.setLong(7, f.getTelefone());
            ps.setString(8, f.getCPF());
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

    public void Delete(FuncionarioGetSet f) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from funcionario where cpf = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, f.getCPF());
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

    public void Read(FuncionarioGetSet f) {

        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conexao.getConnection();
            String sql = "select * from funcionario where cpf = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, f.getCPF());
            ps.execute();
            rs = ps.executeQuery();

            if (rs.next()) {
                f.setId(rs.getInt("id"));
                f.setCPF(rs.getString("cpf"));
                f.setNome(rs.getString("nome"));
                f.setCargo(rs.getString("cargo"));
                f.setIdade(rs.getInt("idade"));
                f.setSexo(rs.getString("sexo"));
                f.setTelefone(rs.getLong("telefone"));
                f.setEndereco(rs.getString("endereco"));
                f.setEmail(rs.getString("email"));
                f.setNum_Pis(rs.getLong("num_pis"));

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
