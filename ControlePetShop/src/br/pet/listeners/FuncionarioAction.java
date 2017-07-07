package br.pet.listeners;

import br.pet.dao.FuncionarioDao;
import br.pet.excecoes.LogExceptions;
import br.pet.getset.FuncionarioGetSet;
import br.pet.janelas.Funcionarios;
import br.pet.log.Log;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FuncionarioAction implements ActionListener {

    private final Funcionarios funcionario;
    private FuncionarioGetSet fun;
    private final LogExceptions execao = new LogExceptions();
    private final FuncionarioDao dao = new FuncionarioDao();

    public FuncionarioAction(Funcionarios funcionario) {

        this.funcionario = funcionario;
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

        // CADASTRO DE FUNCIONÁRIO
        if (e.getActionCommand().equals("Cadastrar")) {
            Log("!Clicou em 'Cadastrar funcionário'");
            if (funcionario.Verifica()) {
                fun = funcionario.getfuncio();
                fun.setNome("");
                dao.Read(fun);
                if (fun.getNome().equals("")) {
                    // adicionei isso
                    fun = funcionario.getfuncio();
                    dao.Insert(fun);
                    funcionario.limpar();
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso", "Cadastro concluído", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/br/pet/icones/aceito.png"));
                    Log("!Cadastrou um novo funcionário: " + fun.getCPF());
                } else {
                    JOptionPane.showMessageDialog(null, "CPF ja cadastrado", "Cadastro falhou", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos para efetuar o cadastro", "Cadastro falhou", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                Log("!Cadastrou de funcionário falhou");
            }
        }

        // LIMPAR CAMPOS NA TELA DE CADASTRO DE FUNCIONÁRIO
        if (e.getActionCommand().equals("Limpar")) {
            Log("!Clicou em 'Limpar funcionário'");
            funcionario.limpar();
        }

        // ATUALIZAR FUNCIONÁRIO NO BANCO DE DADOS
        if (e.getActionCommand().equals("Atualizar")) {
            Log("!Clicou em 'Atualizar Funcionário'");
            if (funcionario.Verifica()) {
                fun = funcionario.getfuncio();
                fun.setNome("");
                dao.Read(fun);
                if ("".equals(fun.getNome().trim())) {
                    JOptionPane.showMessageDialog(null, "Funcionário não encontrado no banco de dados", "Não encontrado", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                    Log("!Atualizar falhou. Funcionário: " + fun.getCPF() + " não encontrado no banco de dados");
                } else {
                    fun = funcionario.getfuncio();
                    dao.Update(fun);
                    funcionario.limpar();
                    JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso", "Atualização concluída", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/br/pet/icones/aceito.png"));
                    Log("!Atualizou funcionário: " + fun.getCPF());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos para efetuar a atualização", "Atualização falhou", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                Log("!Atualização de funcionário falhou");
            }
        }

        // BUSCAR FUNCIONÁRIO NO BANCO DE DADOS
        if (e.getActionCommand().equals("Buscar")) {
            Log("!Clicou em 'Buscar funcionário'");
            fun = new FuncionarioGetSet();
            fun.setNome(""); // Define o nome como vazio para verificação no banco depois.
            String result = (JOptionPane.showInputDialog(null, "Informe o CPF:", "Buscar funcionário", JOptionPane.PLAIN_MESSAGE));
            if (result == null || result.equals("") || result.length() < 11 || result.length() > 11) {
                Log("!Buscar cliente falhou. Ação cancelada ");
                JOptionPane.showMessageDialog(null, "A busca foi cancelada ou CPF inserido é inválido", "Buscar cancelado", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
            } else {
                fun.setCPF(result);
               dao.Read(fun);
                if ("".equals(fun.getNome().trim())) {
                    JOptionPane.showMessageDialog(null, "Funcionário não encontrado no banco de dados", "Não encontrado", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                    Log("!Buscar falhou. Funcionário: " + fun.getCPF() + " não encontrado no banco de dados");
                } else {
                    funcionario.Escreve(fun);
                    Log("!Buscou funcionário: " + fun.getCPF());
                }
            }
        }

        // DELETAR FUNCIONÁRIO DO BANCO DE DADOS
        if (e.getActionCommand().equals("Deletar")) {
            Log("!Clicou em 'Deletar funcionário'");
            String result = (JOptionPane.showInputDialog(null, "Informe o CPF: ", "Deletar cliente", JOptionPane.PLAIN_MESSAGE));
            if (result == null || result.equals("") || result.length() < 11 || result.length() > 11) {
                JOptionPane.showMessageDialog(null, "O delete foi cancelado ou CPF inserido é inválido", "Deletar cancelado", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                Log("!Deletar funcionário falhou. Ação cancelada ");
            } else {
                fun = new FuncionarioGetSet();
                fun.setCPF(result);
                fun.setNome("");
                dao.Read(fun);
                if ("".equals(fun.getNome().trim())) {
                    JOptionPane.showMessageDialog(null, "Funcionário não encontrado no banco de dados", "Não encontrado", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                    Log("!Deletar falhou. Funcionário: " + fun.getCPF() + " não encontrado no banco de dados");
                } else {
                    dao.Delete(fun);
                    JOptionPane.showMessageDialog(null, "Cadastro deletado com sucesso", "Cadastro concluído", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/br/pet/icones/aceito.png"));
                    Log("!Deletou funcionário: " + fun.getCPF());
                }
            }
        }
    }
}
