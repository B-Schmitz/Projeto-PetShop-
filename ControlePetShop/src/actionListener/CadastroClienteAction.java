package actionListener;

import Get_Set.Cliente_Get_Set;
import Janelas.Clientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos para efetuar o cadastro", "Cadastro falhou", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/Icones/erro.png"));
            }
        }

        if (e.getActionCommand().equals("Limpar")) {

            cliente.limpar();
        }

    }

}
