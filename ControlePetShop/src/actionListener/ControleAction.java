package actionListener;

import Get_Set.Estoque_Get_Set;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Janelas.ControleEstoque;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControleAction implements ActionListener {

    private ControleEstoque controle;

    long Id, EmEstoque;
    String nome;
    String Fornecedor;
    int QuantAdd;
    String DataAtual;
    Double Preco;
    //teste
    String preco;

    private JTable tabela;

    public ControleAction(ControleEstoque controle) {
        this.controle = controle;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Adicionar")) {

            Estoque_Get_Set estoq = controle.getestoq();

            if (estoq == null) {

            } else {
                System.out.println(estoq.toString());
                Id = estoq.getId_produto();
                nome = estoq.getNome_Produto().trim();
                Fornecedor = estoq.getFornecedor().trim();
                QuantAdd = estoq.getQantAdd();
                DataAtual = estoq.getData();
                Preco = estoq.getPreco();
                preco = Preco + "";
                
                preco = preco.replaceAll("[.]", ",");

                //isso a baixo é apenas pra teste
                EmEstoque = QuantAdd;

                tabela = controle.getTabela();

                DefaultTableModel v = (DefaultTableModel) tabela.getModel();

                v.addRow(new String[]{Id + "", nome, QuantAdd + "", preco, Fornecedor, DataAtual, EmEstoque + ""});

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
