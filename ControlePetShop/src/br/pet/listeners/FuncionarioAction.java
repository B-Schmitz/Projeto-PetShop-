package br.pet.listeners;

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
        if (e.getActionCommand().equals("Cadastrar")) {
            Log("!Clicou em 'Limpar'");
            if (funcionario.Verifica()) {
                fun = funcionario.getfuncio();
                System.out.println(fun.toString());
                Log("!Cadastrou um novo funcionario'");
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso", "Cadastro concluído", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/br/pet/icones/aceito.png"));
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos para efetuar o cadastro", "Cadastro falhou", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
            }
        }

        if (e.getActionCommand().equals("Limpar")) {
            Log("!Clicou em 'Limpar'");
            funcionario.limpar();
        }
        
        if (e.getActionCommand().equals("Deletar")) {
            //falta log
            fun = funcionario.getfuncio();
            funcionario.Deletar();
        }
    }
}
