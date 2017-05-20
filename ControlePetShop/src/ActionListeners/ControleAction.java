package ActionListeners;

import Get_Set.Estoque_Get_Set;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Janelas.ControleEstoque;
import TableModel.ControleTableModel;
import javax.swing.JTable;

public class ControleAction implements ActionListener {

    private final ControleEstoque controle;

    private Estoque_Get_Set estoq;
    private JTable tabela;

    private final ControleTableModel model = new ControleTableModel();

    public ControleAction(ControleEstoque controle) {
        this.controle = controle;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Adicionar")) {

            estoq = controle.getestoq();

            // Se quando a funçao getestoq() for chamada e não hover nada nos capos de texto, ela retorna null e armazena em estoq
            // Se estoque estiver como null nao faz nada.
            if (estoq == null) {
                return;

            } //Se estoque nao estiver como null significa q todos os campos de texto estão preenchidos e serão adicionados a lista
            else {
                //  System.out.println(estoq.toString());

                tabela = controle.getTabela();
                tabela.setModel(model);

                model.addLinha(estoq);

            }

        }

        if (e.getActionCommand().equals("Limpar")) {

            controle.limpa();

        }

        if (e.getActionCommand().equals("Remover")) {
            tabela = controle.getTabela();
            if (tabela.getSelectedRow() == -1) {
                return;

            } else {

                int i = tabela.getSelectedRow();

                model.remove(i);
            }
        }

        if (e.getActionCommand().equals("Editar")) {
            tabela = controle.getTabela();

            if (tabela.getSelectedRow() == -1) {
                return;

            } else {
                estoq = model.getproduto(tabela.getSelectedRow());
                controle.Editar(estoq);
                model.remove(tabela.getSelectedRow());

            }
        }

    }
}
