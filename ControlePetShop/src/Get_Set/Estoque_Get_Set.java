package Get_Set;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Estoque_Get_Set {

    private String Nome_Produto;
    private long Id_produto;
    private int QantAdd;
    private long QuantEstoque;
    private String Data;
    private String fornecedor;
    private BigDecimal Preco;
    private String PrecoStr;

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

    public int getQantAdd() {
        return QantAdd;
    }

    public void setQantAdd(int QantAdd) {
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
        return "Nome do Produto = " + Nome_Produto + "\nId do produto = " + getId_produto() + "\nQuantidade = " + getQantAdd() + "\nQuantidade no estoque = " + getQuantEstoque() + "\nData = " + Data + "\nFornecedor = " + fornecedor;
    }
    
   

}
