package Get_Set;

public class Estoque_Get_Set {

    private String Nome_Produto;
    //temporariamente
    private String Id_produto;
    private String QantAdd;
    private String QuantEstoque;
    private String Data;
    private String fornecedor;

    public String getNome_Produto() {
        return Nome_Produto;
    }

    public void setNome_Produto(String Nome_Produto) {
        this.Nome_Produto = Nome_Produto;
    }

    public String getId_produto() {
        return Id_produto;
    }

    public void setId_produto(String Id_produto) {
        this.Id_produto = Id_produto;
    }

    public String getQantAdd() {
        return QantAdd;
    }

    public void setQantAdd(String QantAdd) {
        this.QantAdd = QantAdd;
    }

    public String getQuantEstoque() {
        return QuantEstoque;
    }

    public void setQuantEstoque(String QuantEstoque) {
        this.QuantEstoque = QuantEstoque;
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

    @Override
    public String toString() {
        return "Nome do Produto = " + Nome_Produto + "Id do produto = " + Id_produto + "Quantidade = " + QantAdd + "Quantidade no estoque = " + QuantEstoque + "Data = " + Data + "Fornecedor = " + fornecedor;
    }
    
    

}
