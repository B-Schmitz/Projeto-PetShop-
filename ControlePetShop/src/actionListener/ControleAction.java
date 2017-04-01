package actionListener;

import Get_Set.Estoque_Get_Set;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Janelas.ControleEstoque;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControleAction implements ActionListener {

    ControleEstoque controle;

    JTable tabela;

    public ControleAction(ControleEstoque controle) {
        this.controle = controle;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Adicionar")) {
            String Id = "";
            String nome = "";
            String Fornecedor = "";
            String QuantAdd = "";
            String dataAdd = "";
            Estoque_Get_Set estoq = controle.getestoq();

            Id = estoq.getId_produto().trim();
            nome = estoq.getNome_Produto().trim();
            Fornecedor = estoq.getFornecedor().trim();
            QuantAdd = estoq.getQantAdd().trim();
           // dataAdd = estoq.getData().trim();
           Date hoje = new Date();
           SimpleDateFormat df;
           df = new SimpleDateFormat("dd/MM/yyyy");
           dataAdd = df.format(hoje);
            //isso a baixo é apenas pra teste
            String EmEstoque = QuantAdd;
            
            System.out.println(controle.toString());

            tabela = controle.getTabela();

            DefaultTableModel v = (DefaultTableModel) tabela.getModel();

            if (Id.isEmpty() || nome.isEmpty() || Fornecedor.isEmpty()
                    || QuantAdd.isEmpty() || dataAdd.isEmpty()) {

            } 
            
            else {

                v.addRow(new String[]{Id, nome, QuantAdd, dataAdd, Fornecedor, EmEstoque});

            }

        }
        
           if (e.getActionCommand().equals("Limpar")) {
            
               controle.limpa();
            
        }
           
        if (e.getActionCommand().equals("Remover")) {
            if (tabela.getSelectedRow() == -1) {

            } else {

                int i = tabela.getSelectedRow();
                controle.setExcluitabela(i);
            }
        }
        
    }
}
