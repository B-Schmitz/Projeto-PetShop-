package ActionListeners;

import Get_Set.Cliente_Get_Set;
import Janelas.Clientes;
import Log.Log;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CadastroClienteAction implements ActionListener {

    private final Clientes cliente;
    private Cliente_Get_Set client;

    public CadastroClienteAction(Clientes cliente) {

        this.cliente = cliente;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Cadastrar")) {
            if (cliente.Verifica()) {
                client = cliente.getcliente();
                System.out.println(client.toString());
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso", "Cadastro concluído", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/Icones/aceito.png"));
                 try {
            Log.escrever("!Cadastrou um novo cliente");
        } catch (IOException ex) {
            //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos para efetuar o cadastro", "Cadastro falhou", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/Icones/erro.png"));
            }
        }

        if (e.getActionCommand().equals("Limpar")) {
            cliente.limpar();
              try {
            Log.escrever("!Limpou os campos no cadastro de cliente");
        } catch (IOException ex) {
            //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

    }

}
