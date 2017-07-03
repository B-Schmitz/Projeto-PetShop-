package br.pet.listeners;

import br.pet.dao.AnimalDao;
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
                client.setNome("");
                dao.Read(client);
                if (client.getNome().equals("")) {
                    client = cliente.getcliente();
                    dao.Insert(client);
                    cliente.limpar();
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso", "Cadastro concluído", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/br/pet/icones/aceito.png"));
                    Log("!Cadastrou um novo cliente: " + client.getCPF());
                } else {
                    JOptionPane.showMessageDialog(null, "CPF ja cadastrado", "Cadastro falhou", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos para efetuar o cadastro", "Cadastro falhou", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                Log("!Cadastrou de cliente falhou");
            }
        }

        if (e.getActionCommand().equals("Deletar")) {
            Log("!Clicou em 'Deletar cliente'");
            String result = (JOptionPane.showInputDialog(null, "Informe o CPF: ", "Deletar cliente", JOptionPane.PLAIN_MESSAGE));
            if (result == null || result.equals("") || result.length() < 11 || result.length() > 11) {
                JOptionPane.showMessageDialog(null, "O delete foi cancelado ou CPF inserido é inválido", "Deletar cancelado", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                Log("!Deletar cliente falhou. Ação cancelada ");
            } else {
                client = new ClienteGetSet();
                client.setCPF(result);
                client.setNome("");
                dao.Read(client);
                if ("".equals(client.getNome().trim())) {
                    JOptionPane.showMessageDialog(null, "Cliente não encontrado no banco de dados", "Não encontrado", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                    Log("!Deletar falhou. Cliente: " + client.getCPF() + " não encontrado no banco de dados");
                } else {
                    AnimalDao daAni = new AnimalDao();
                    daAni.DeleteProprietario(client.getId());
                    dao.Delete(client);
                    JOptionPane.showMessageDialog(null, "Cadastro deletado com sucesso", "Cadastro concluído", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/br/pet/icones/aceito.png"));
                    Log("!Deletou cliente: " + client.getCPF());
                }
            }
        }

        if (e.getActionCommand().equals("Buscar")) {
            Log("!Clicou em 'Buscar cliente'");
            client = cliente.getcliente();
            client.setNome(""); // Define o nome como vazio para verificação no banco depois.
            String result = (JOptionPane.showInputDialog(null, "Informe o CPF:", "Buscar cliente", JOptionPane.PLAIN_MESSAGE));
            if (result == null || result.equals("") || result.length() < 11 || result.length() > 11) {
                Log("!Buscar cliente falhou. Ação cancelada ");
                JOptionPane.showMessageDialog(null, "A busca foi cancelada ou CPF inserido é inválido", "Buscar cancelado", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
            } else {
                client.setCPF(result);
                dao.Read(client);
                if ("".equals(client.getNome().trim())) {
                    JOptionPane.showMessageDialog(null, "Cliente não encontrado no banco de dados", "Não encontrado", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                    Log("!Buscar falhou. Cliente: " + client.getCPF() + " não encontrado no banco de dados");
                } else {
                    cliente.Escreve();
                    Log("!Buscou cliente: " + client.getCPF());
                }
            }
        }

        if (e.getActionCommand().equals("Atualizar")) {
            Log("!Clicou em 'Atualizar Cliente'");
            //  cliente.Atualizar();
            if (cliente.Verifica()) {

                client = cliente.getcliente();
                client.setNome("");
                dao.Read(client);
                System.out.println(client.getNome());
                if ("".equals(client.getNome().trim())) {
                    JOptionPane.showMessageDialog(null, "Cliente não encontrado no banco de dados", "Não encontrado", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                    Log("!Atualizar falhou. Cliente: " + client.getCPF() + " não encontrado no banco de dados");
                } else {
                    // Precisava pegar os dados informados
                    client = cliente.getcliente();
                    dao.Update(client);
                    cliente.limpar();
                    JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso", "Atualização concluída", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/br/pet/icones/aceito.png"));
                    Log("!Atualizou cliente: " + client.getCPF());
                    //Porque isso em baixo?
                    //  client.setNome("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos para efetuar a atualização", "Atualização falhou", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/br/pet/icones/erro.png"));
                Log("!Atualização de cliente falhou");
            }
        }

        if (e.getActionCommand().equals("Limpar")) {
            cliente.limpar();
            Log("!Limpou os campos no cadastro de cliente");
        }
    }
}
