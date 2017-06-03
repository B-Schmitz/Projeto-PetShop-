package br.pet.getset;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EstoqueGetSet implements Comparable<EstoqueGetSet> {

    private String Nome_Produto;
    private long Id_produto;
    private long QantAdd;
    private long QuantEstoque;
    private String Data;
    private String fornecedor;
    private BigDecimal Preco;
    private String PrecoStr;
    private String[] diaMesAno, diaMesAno1;
    private int comp1, comp2;

    public String getPrecoStr() {
        return PrecoStr;
    }

    public void setPrecoStr(String PrecoStr) {
        this.PrecoStr = PrecoStr;
    }

    public String getNome_Produto() {
        return Nome_Produto;
    }

    public void setNome_Produto(String Nome_Produto) {
        this.Nome_Produto = Nome_Produto;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public long getId_produto() {
        return Id_produto;
    }

    public void setId_produto(long Id_produto) {
        this.Id_produto = Id_produto;
    }

    public long getQantAdd() {
        return QantAdd;
    }

    public void setQantAdd(long QantAdd) {
        this.QantAdd = QantAdd;
    }

    public long getQuantEstoque() {
        return QuantEstoque;
    }

    public void setQuantEstoque(long QuantEstoque) {
        this.QuantEstoque = QuantEstoque;
    }

    public BigDecimal getPreco() {

        return Preco;
    }

    public void setPreco(Double Preco) {
        this.Preco = new BigDecimal(Preco).setScale(2, RoundingMode.HALF_EVEN);

    }

    @Override
    public String toString() {
        return "Nome do wProduto = " + Nome_Produto + "\nId do produto = " + getId_produto() + "\nQuantidade = " + getQantAdd() + "\nQuantidade no estoque = " + getQuantEstoque() + "\nData = " + Data + "\nFornecedor = " + fornecedor;
    }

    @Override
    public int compareTo(EstoqueGetSet estoque) {

        diaMesAno = this.getData().split("/");
        diaMesAno1 = estoque.getData().split("/");

        for (int i = 2; i > -1; i--) {
            if (!diaMesAno[i].equals(diaMesAno1[i])) {
                comp1 = Integer.parseInt(diaMesAno[i]);
                comp2 = Integer.parseInt(diaMesAno1[i]);

                if (comp1 > comp2) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }

        return this.Nome_Produto.compareTo(estoque.Nome_Produto);
    }

}
