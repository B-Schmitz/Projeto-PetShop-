package br.pet.listeners;

import br.pet.dao.ControleEstoqueDao;
import br.pet.excecoes.LogExceptions;
import br.pet.getset.EstoqueGetSet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.pet.janelas.ControleEstoque;
import br.pet.log.Log;
import br.pet.tablemodel.ControleTableModel;
import java.io.IOException;
import java.text.ParseException;
import javax.swing.JTable;

public class ControleAction implements ActionListener {

    private final ControleEstoque controle;
    private final LogExceptions execao = new LogExceptions();
    private ControleEstoqueDao dao = new ControleEstoqueDao();

    private EstoqueGetSet estoq;
    private JTable tabela;

    private final ControleTableModel model = new ControleTableModel();

    public ControleAction(ControleEstoque controle) {
        this.controle = controle;

    }

    public void Log(String msg) {
        try {
            Log.escrever(msg);
        } catch (IOException ex) {
            execao.exception(ex);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Adicionar")) {
            Log("!Clicou em 'Adicionar'");

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
                    dao.Insert(estoq);
                } catch (ParseException ex) {
                  //  Logger.getLogger(ControleAction.class.getName()).log(Level.SEVERE, null, ex);
                }
                    Log("!Cadastrado um novo produto");

            }

        }

        if (e.getActionCommand().equals("Limpar")) {
            Log("!Clicou em 'Limpar'");
            controle.limpa();

        }

        if (e.getActionCommand().equals("Remover")) {

            Log("!Clicou em 'Remover'");

            tabela = controle.getTabela();
            if (tabela.getSelectedRow() == -1) {
                return;

            } else {

                int i = tabela.getSelectedRow();
                

                model.remove(i);
                Log("!Produto removido");
            }
        }

        if (e.getActionCommand().equals("Editar")) {
            Log("!Clicou em 'Editar'");
            tabela = controle.getTabela();

            if (tabela.getSelectedRow() == -1) {
                //???  return;

            } else {
                estoq = model.getproduto(tabela.getSelectedRow());
                controle.Editar(estoq);
                model.remove(tabela.getSelectedRow());
                Log("!Produto foi para a edição'");

            }
        }

    }
}
