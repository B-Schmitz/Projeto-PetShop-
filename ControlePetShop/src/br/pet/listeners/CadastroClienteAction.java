package br.pet.listeners;

import br.pet.excecoes.LogExceptions;
import br.pet.getset.ClienteGetSet;
import br.pet.janelas.Clientes;
import br.pet.log.Log;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CadastroClienteAction implements ActionListener {

    private final Clientes cliente;
    private ClienteGetSet client;
    private LogExceptions execao = new LogExceptions();

    public CadastroClienteAction(Clientes cliente) {

        this.cliente = cliente;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Cadastrar")) {
            try {
            Log.escrever("!Clicou em 'Cadastrar'");
        } catch (IOException ex) {
            //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            execao.exception(ex);
        }
            if (cliente.Verifica()) {
                client = cliente.getcliente();
                System.out.println(client.toString());
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso", "Cadastro concluído", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/br/pet/icones/aceito.png"));
                 try {
            Log.escrever("!Cadastrou um novo cliente");
        } catch (IOException ex) {
            //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            execao.exception(ex);
        }
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos para efetuar o cadastro", "Cadastro falhou", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
            }
        }

        if (e.getActionCommand().equals("Limpar")) {
            cliente.limpar();
              try {
            Log.escrever("!Limpou os campos no cadastro de cliente");
        } catch (IOException ex) {
            //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            execao.exception(ex);
        }
        }

    }

}
