package br.pet.listeners;

import br.pet.dao.ClienteDao;
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
    private final LogExceptions execao = new LogExceptions();
    private final ClienteDao dao = new ClienteDao();

    public CadastroClienteAction(Clientes cliente) {
        this.cliente = cliente;
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
            Log("!Clicou em 'Cadastrar Cliente'");
            if (cliente.Verifica()) {
                client = cliente.getcliente();
                dao.Insert(client);
                //System.out.println(client.toString()); Remover ???
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso", "Cadastro concluído", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/br/pet/icones/aceito.png"));
                Log("!Cadastrou um novo cliente: " + client.getCPF());
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos para efetuar o cadastro", "Cadastro falhou", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                Log("!Cadastrou de cliente falhou");
            }
        }

        if (e.getActionCommand().equals("Deletar")) {
            Log("!Clicou em 'Deletar Cliente'");
            client = cliente.getcliente();
            cliente.Deletar();
        }

        if (e.getActionCommand().equals("Buscar")) {
            Log("!Clicou em 'Buscar Cliente'");
            client = cliente.getcliente();
            cliente.Buscar();
        }

        if (e.getActionCommand().equals("Atualizar")) {
            Log("!Clicou em 'Atualizar Cliente'");
           cliente.Atualizar();
        }

        if (e.getActionCommand().equals("Limpar")) {
            cliente.limpar();
            Log("!Limpou os campos no cadastro de cliente");
        }
    }
}
