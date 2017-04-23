package TableModel;

import Get_Set.Estoque_Get_Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ContorleTableModel extends AbstractTableModel {

    private List<Estoque_Get_Set> produtos = new ArrayList<>();
    private String[] colunas = {"IdProduto", "Nome", "Quantidade", "Preço",
        "Fornecedor", "Data da compra", "Qtd Estoque"};

    @Override
    public String getColumnName(int column) {
        
        return colunas[column];
    }
    
    public void remove(int linha){
       produtos.remove(linha);
       fireTableDataChanged();
    }
    
    
 
    public Estoque_Get_Set getproduto(int linha){
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
        
        switch(coluna){
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
                //teste
                return produtos.get(linha).getQantAdd();
        }
        
        return null;

    }
    
    public void addLinha(Estoque_Get_Set produto){
        
        this.produtos.add(produto);
        Collections.sort(produtos);
        this.fireTableDataChanged();
    }

}
