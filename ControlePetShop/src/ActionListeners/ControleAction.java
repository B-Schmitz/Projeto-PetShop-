package ActionListeners;

import Exceções.LogExceptions;
import Get_Set.Estoque_Get_Set;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Janelas.ControleEstoque;
import Log.Log;
import TableModel.ControleTableModel;
import java.io.IOException;
import javax.swing.JTable;

public class ControleAction implements ActionListener {

    private final ControleEstoque controle;
    private LogExceptions execao = new LogExceptions();

    private Estoque_Get_Set estoq;
    private JTable tabela;

    private final ControleTableModel model = new ControleTableModel();

    public ControleAction(ControleEstoque controle) {
        this.controle = controle;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Adicionar")) {
            try {
                Log.escrever("!Clicou em 'Adicionar'");
            } catch (IOException ex) {
                //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                execao.exception(ex);
            }

            estoq = controle.getestoq();

            // Se quando a funçao getestoq() for chamada e não hover nada nos capos de texto, ela retorna null e armazena em estoq
            // Se estoque estiver como null nao faz nada.
            if (estoq == null) {
                return;

            } //Se estoque nao estiver como null significa q todos os campos de texto estão preenchidos e serão adicionados a lista
            else {
                System.out.println(estoq.toString());

                tabela = controle.getTabela();
                tabela.setModel(model);

                model.addLinha(estoq);
                try {
                    Log.escrever("!Cadastrado um novo produto");
                } catch (IOException ex) {
                    //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    execao.exception(ex);
                }

            }

        }

        if (e.getActionCommand().equals("Limpar")) {

            try {
                Log.escrever("!Clicou em 'Limpar'");
            } catch (IOException ex) {
                //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                execao.exception(ex);
            }
            controle.limpa();

        }

        if (e.getActionCommand().equals("Remover")) {

            try {
                Log.escrever("!Clicou em 'Remover'");
            } catch (IOException ex) {
                //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                execao.exception(ex);
            }

            tabela = controle.getTabela();
            if (tabela.getSelectedRow() == -1) {
                return;

            } else {

                int i = tabela.getSelectedRow();

                model.remove(i);
                try {
                    Log.escrever("!Produto removido");
                } catch (IOException ex) {
                    //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    execao.exception(ex);
                }
            }
        }

        if (e.getActionCommand().equals("Editar")) {
            try {
                Log.escrever("!Clicou em 'Editar'");
            } catch (IOException ex) {
                //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                execao.exception(ex);
            }
            tabela = controle.getTabela();

            if (tabela.getSelectedRow() == -1) {
                return;

            } else {
                estoq = model.getproduto(tabela.getSelectedRow());
                controle.Editar(estoq);
                model.remove(tabela.getSelectedRow());
                try {
                    Log.escrever("!Produto foi para a edição'");
                } catch (IOException ex) {
                    //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    execao.exception(ex);
                }

            }
        }

    }
}
