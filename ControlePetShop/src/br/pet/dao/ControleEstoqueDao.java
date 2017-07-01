package br.pet.dao;

import br.pet.getset.EstoqueGetSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import br.pet.excecoes.LogExceptions;

public class ControleEstoqueDao {

    private final LogExceptions execao = new LogExceptions();

    public void Insert(EstoqueGetSet es) throws ParseException {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into estoque (id_produto, nome,quantidade,preco,fornecedor,data_compra,em_estoque) values(?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);

            ps.setLong(1, es.getId_produto());
            ps.setString(2, es.getNome_Produto());
            ps.setLong(3, es.getQantAdd());
            ps.setBigDecimal(4, es.getPreco());
            ps.setString(5, es.getFornecedor());

            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data = new java.sql.Date(fmt.parse(es.getData()).getTime());
            ps.setDate(6, data);
            ps.setLong(7, es.getQuantEstoque());

            ps.execute();
            conn.commit();

        } catch (SQLException e) {
            // System.out.println("ERRO: " + e.getMessage());
            execao.exception(e);
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    //System.out.println("ERRO: " + ex.getMessage());
                    execao.exception(ex);
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    //System.out.println("ERRO: " + ex.getMessage());
                    execao.exception(ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    //  System.out.println("ERRO: " + ex.getMessage());
                    execao.exception(ex);
                }
            }
        }
    }

    public void Delete(EstoqueGetSet es) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from estoque  where id_produto = ?";
            ps = conn.prepareStatement(sql);

            ps.setLong(1, es.getId_produto());

            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            //  System.out.println("ERRO: " + e.getMessage());
            execao.exception(e);

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    //System.out.println("ERRO: " + ex.getMessage());
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
                    //System.out.println("ERRO: " + ex.getMessage());
                    execao.exception(ex);
                }
            }
        }
    }

    public List<EstoqueGetSet> read() {

        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement ps = null;

        List<EstoqueGetSet> produtos = new ArrayList<>();

        try {
            conn = Conexao.getConnection();
            String sql = "select * from estoque";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                EstoqueGetSet produto = new EstoqueGetSet();

                produto.setId_produto(rs.getLong("id_produto"));
                SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
                produto.setData(data.format(rs.getDate("data_compra")));
                produto.setFornecedor(rs.getString("fornecedor"));
                produto.setNome_Produto(rs.getString("nome"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setQantAdd(rs.getInt("quantidade"));
                produto.setQuantEstoque(rs.getLong("em_estoque"));
                produtos.add(produto);
            }

            conn.commit();
        } catch (SQLException e) {
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
        return produtos;
    }
}
