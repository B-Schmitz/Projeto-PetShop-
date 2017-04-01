package actionListener;

import Get_Set.Estoque_Get_Set;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Janelas.ControleEstoque;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControleAction implements ActionListener {

    private ControleEstoque controle;

    String Id;
    String nome;
    String Fornecedor;
    String QuantAdd;
    String DataAtual;
    String Preco;

    private JTable tabela;

    public ControleAction(ControleEstoque controle) {
        this.controle = controle;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Adicionar")) {

            Estoque_Get_Set estoq = controle.getestoq();

            Id = "";
            nome = "";
            Fornecedor = "";
            QuantAdd = "";
            DataAtual = "";
            Preco = "";

            System.out.println(estoq.toString());

            Id = estoq.getId_produto().trim();
            nome = estoq.getNome_Produto().trim();
            Fornecedor = estoq.getFornecedor().trim();
            QuantAdd = estoq.getQantAdd().trim();
            DataAtual = estoq.getData();
            Preco = estoq.getPreco();

            //isso a baixo é apenas pra teste
            String EmEstoque = QuantAdd;

            tabela = controle.getTabela();

            DefaultTableModel v = (DefaultTableModel) tabela.getModel();

            if (Id.isEmpty() || nome.isEmpty() || Fornecedor.isEmpty()
                    || QuantAdd.isEmpty() || DataAtual.isEmpty()) {

            } else {

                v.addRow(new String[]{Id, nome, QuantAdd,Preco , Fornecedor,DataAtual, EmEstoque});

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
        
        if (e.getActionCommand().equals("Editar")) {

            controle.Editar();

        }

    }
}
