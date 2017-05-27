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
    private LogExceptions execao = new LogExceptions();
    public FuncionarioAction(Funcionarios funcionario) {

        this.funcionario = funcionario;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Cadastrar")) {
            try {
                Log.escrever("!Clicou em 'Limpar'");
            } catch (IOException ex) {
                //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                execao.exception(ex);
            }
            if (funcionario.Verifica()) {
                fun = funcionario.getfuncio();
                System.out.println(fun.toString());
                try {
                Log.escrever("!Cadastrou um novo funcionario'");
            } catch (IOException ex) {
                //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                execao.exception(ex);
                
            }
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso", "Cadastro concluído", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/br/pet/icones/aceito.png"));
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos para efetuar o cadastro", "Cadastro falhou", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
            }
        }

        if (e.getActionCommand().equals("Limpar")) {
            try {
                Log.escrever("!Clicou em 'Limpar'");
            } catch (IOException ex) {
                //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                execao.exception(ex);
            }

            funcionario.limpar();

        }
    }
}
