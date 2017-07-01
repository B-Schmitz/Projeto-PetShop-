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
            Log("!Clicou em 'Cadastrar'");
            if (cliente.Verifica()) {
                client = cliente.getcliente();
                
                    dao.Insert(client);

                
                System.out.println(client.toString());
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso", "Cadastro concluído", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/br/pet/icones/aceito.png"));
                Log("!Cadastrou um novo cliente");
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos para efetuar o cadastro", "Cadastro falhou", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
            }
        }

         if (e.getActionCommand().equals("Deletar")) {
             client = cliente.getcliente();
             cliente.Deletar();
             // faltou log
        }
        
        
        if (e.getActionCommand().equals("Limpar")) {
            cliente.limpar();
            Log("!Limpou os campos no cadastro de cliente");
        }

    }

}
