package TableModel;

import Get_Set.Estoque_Get_Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ContorleTableModel extends AbstractTableModel {
    
    private List<Estoque_Get_Set> produtos = new ArrayList<>();
    private String[] colunas = {"IdProduto", "Nome", "Quantidade", "Preço",
        "Fornecedor", "Data da compra", "Qtd Estoque"};
    private long soma;
    
    @Override
    public String getColumnName(int column) {
        
        return colunas[column];
    }
    
    public void remove(int linha) {
        Estoque_Get_Set produto;
        
        produto = produtos.get(linha);
        produtos.remove(linha);
        somaEstoque(produto);
        atualizaEstoque(produto);
        soma = 0;
        
        fireTableDataChanged();
    }
    
    public Estoque_Get_Set getproduto(int linha) {
        return produtos.get(linha);
    }
    
    @Override
    public int getRowCount() {
        
        return produtos.size();
        
    }
    
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch (coluna) {
            case 0:
                return produtos.get(linha).getId_produto();
            
            case 1:
                return produtos.get(linha).getNome_Produto();
            
            case 2:
                return produtos.get(linha).getQantAdd();
            
            case 3:
                return produtos.get(linha).getPrecoStr();
            
            case 4:
                return produtos.get(linha).getFornecedor();
            
            case 5:
                return produtos.get(linha).getData();
            
            case 6:
            
                return produtos.get(linha).getQuantEstoque();
        }
        
        return null;
        
    }
    
    public void addLinha(Estoque_Get_Set produto) {
        
        
        somaEstoque(produto);
        this.produtos.add(produto);
        //Essa parte esta aqui pois o ultimo produto adicionado ainda nao foi somado
        //no método somaEstoque, foi feito assim para que se possa chamar os mesmos
        //métodos tando para adicionar um produto quanto para remover
        //por isso só esse método é que possui essa linha a baixo
        soma += produto.getQantAdd();
        
        atualizaEstoque(produto);
        
        soma = 0;
        
        Collections.sort(produtos);
        this.fireTableDataChanged();
    }
    // Esse método é responsavel por atualizar os produtos em estoque
    //para isso ele percorre toda a lista comparando o nome dos produtos
    //se encontrar um com o mesmo nome buscado(sendo chamado da função addlinha ou da função remove)
    //ele soma o que estiver nos campo de quantidade adicionada de todos os campos.
    public void somaEstoque(Estoque_Get_Set produto) {
        for (int i = 0; i < produtos.size(); i++) {
            
            if (produto.getNome_Produto().equals(produtos.get(i).getNome_Produto())) {
                soma += produtos.get(i).getQantAdd();
            }
            
        }
        
    }
    //Esse método é responsavel por atualizar o campo de produtos em estoque
    //pegando a soma dos produtos adicionados ja calculada na função somaEstoque
    public void atualizaEstoque(Estoque_Get_Set produto) {
        for (int i = 0; i < produtos.size(); i++) {
            
            if (produtos.get(i).getNome_Produto().equals(produto.getNome_Produto())) {
                
                produtos.get(i).setQuantEstoque(soma);
                
            }
            
        }
    }
}
